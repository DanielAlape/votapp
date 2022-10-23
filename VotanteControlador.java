package com.example.demo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.entidades.Votante;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;

import com.example.demo.servicios.VotanteService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VotanteControlador {

	@Autowired
	private VotanteService votanteService;

	@GetMapping("/votapp")
	public String despVotapp() {
		return "/Sprint3";
	}

	@GetMapping("/pag2")
	public String Pag2() {
		return "/Sprint3Pág2";
	}

	@GetMapping("/back")
	public String Back() {
		return "/Sprint3";
	}

	@GetMapping("/addVotante")
	public String addVotante() {
		return "/addVotante";
	}
	
	@GetMapping("/listVotante")
	public String listarVotantes(Model model) {
		try {
			List<Votante> listaVotantes = votanteService.findAll();
			System.out.println("listaVotantes-->" + listaVotantes.toString());
			model.addAttribute("votantes", listaVotantes);
		} catch (Exception e) {
			System.out.println("error-->" + e.getCause());
		}
		return "/listVotantes";
	}
	
	
	@GetMapping("/editarVotante/{id}")
	public String Editar(@PathVariable int id, Model model) {
		Optional<Votante> votante = votanteService.findById(id);
		model.addAttribute("votante", votante.get());
		return "/modificar";
	}
	
	@GetMapping("/eliminarVotante/{id}")
	public String Borrar(@PathVariable int id) {
		votanteService.deleteById(id);
		return "redirect:/listVotante";
	}
	
	@GetMapping("/mostrarVotante/{id}")
	public String Mostrar(@PathVariable int id, Model model) {
		Optional<Votante> votante = votanteService.findById(id);
		model.addAttribute("votante", votante.get());
		return "/mostrar";
	}
	
	@PostMapping("/saveVotante")
	public String addVotante(@Validated Votante votante) {
		System.out.println("Votante-->"+votante.toString()); 
		votanteService.save(votante);
		return "redirect:/listVotante";
		
	}
}
