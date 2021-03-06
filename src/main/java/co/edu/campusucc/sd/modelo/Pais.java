package co.edu.campusucc.sd.modelo;
// Generated 27/04/2020 11:48:23 AM by Hibernate Tools 5.4.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Pais generated by hbm2java
 */
public class Pais implements java.io.Serializable {

	private String idPais;
	private String nombre;
	private String gentilicio;
	private Set giros = new HashSet(0);

	public Pais() {
	}

	public Pais(String idPais, String nombre, String gentilicio) {
		this.idPais = idPais;
		this.nombre = nombre;
		this.gentilicio = gentilicio;
	}

	public Pais(String idPais, String nombre, String gentilicio, Set giros) {
		this.idPais = idPais;
		this.nombre = nombre;
		this.gentilicio = gentilicio;
		this.giros = giros;
	}

	public String getIdPais() {
		return this.idPais;
	}

	public void setIdPais(String idPais) {
		this.idPais = idPais;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGentilicio() {
		return this.gentilicio;
	}

	public void setGentilicio(String gentilicio) {
		this.gentilicio = gentilicio;
	}

	public Set getGiros() {
		return this.giros;
	}

	public void setGiros(Set giros) {
		this.giros = giros;
	}

}
