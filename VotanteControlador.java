package com.example.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.servicios.VotanteService;

import org.springframework.web.bind.annotation.GetMapping;

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
}
