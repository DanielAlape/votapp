package com.example.demo.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Votante {
    
	@Id
	private int codVotante;
	private int identificacion;
	private String nombres;
	private String apellidos;
	private String fechaNac;
	private String fechaExpCed;
	private int lugarNac;
	private int lugarRes;
	private int movil;
	private String correo;
	private int sexo;
	public int getCodVotante() {
		return codVotante;
	}
	
	// Getter y Setter
	
	public void setCodVotante(int codVotante) {
		this.codVotante = codVotante;
	}
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getFechaExpCed() {
		return fechaExpCed;
	}
	public void setFechaaExpCed(String fechaExpCed) {
		this.fechaExpCed = fechaExpCed;
	}
	public int getLugarNac() {
		return lugarNac;
	}
	public void setLugarNac(int lugarNac) {
		this.lugarNac = lugarNac;
	}
	public int getLugarRes() {
		return lugarRes;
	}
	public void setLugarRes(int lugarRes) {
		this.lugarRes = lugarRes;
	}
	public int getMovil() {
		return movil;
	}
	public void setMovil(int movil) {
		this.movil = movil;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getSexo() {
		return sexo;
	}
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	
	
	
}
