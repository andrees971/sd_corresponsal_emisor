package co.edu.campusucc.sd.modelo;
// Generated 28/03/2020 03:58:47 PM by Hibernate Tools 5.4.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Giro generated by hbm2java
 */
public class Giro implements java.io.Serializable {

	private String idGiro;
	private Cliente cliente;
	private Pais pais;
	private String paisOrigen;
	private String paisLlegada;
	private int valorEnvio;
	private double comision;
	private Set formaPagos = new HashSet(0);

	public Giro() {
	}

	public Giro(String idGiro, String paisOrigen, String paisLlegada, int valorEnvio, double comision) {
		this.idGiro = idGiro;
		this.paisOrigen = paisOrigen;
		this.paisLlegada = paisLlegada;
		this.valorEnvio = valorEnvio;
		this.comision = comision;
	}

	public Giro(String idGiro, Cliente cliente, Pais pais, String paisOrigen, String paisLlegada, int valorEnvio,
			double comision, Set formaPagos) {
		this.idGiro = idGiro;
		this.cliente = cliente;
		this.pais = pais;
		this.paisOrigen = paisOrigen;
		this.paisLlegada = paisLlegada;
		this.valorEnvio = valorEnvio;
		this.comision = comision;
		this.formaPagos = formaPagos;
	}

	public String getIdGiro() {
		return this.idGiro;
	}

	public void setIdGiro(String idGiro) {
		this.idGiro = idGiro;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getPaisOrigen() {
		return this.paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public String getPaisLlegada() {
		return this.paisLlegada;
	}

	public void setPaisLlegada(String paisLlegada) {
		this.paisLlegada = paisLlegada;
	}

	public int getValorEnvio() {
		return this.valorEnvio;
	}

	public void setValorEnvio(int valorEnvio) {
		this.valorEnvio = valorEnvio;
	}

	public double getComision() {
		return this.comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public Set getFormaPagos() {
		return this.formaPagos;
	}

	public void setFormaPagos(Set formaPagos) {
		this.formaPagos = formaPagos;
	}

}
