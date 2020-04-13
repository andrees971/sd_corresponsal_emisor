package co.edu.campusucc.sd.modelo;
// Generated 28/03/2020 03:58:47 PM by Hibernate Tools 5.4.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente implements java.io.Serializable {

	private String idCliente;
	private TipoCliente tipoCliente;
	private TipoDocumento tipoDocumento;
	private String idPais;
	private String nombres;
	private String apellidos;
	private String razonSocial;
	private String idGiro;
	private Set ubicacions = new HashSet(0);
	private Set biometrias = new HashSet(0);
	private Set giros = new HashSet(0);

	public Cliente() {
	}

	public Cliente(String idCliente, String nombres, String apellidos, String razonSocial) {
		this.idCliente = idCliente;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.razonSocial = razonSocial;
	}

	public Cliente(String idCliente, TipoCliente tipoCliente, TipoDocumento tipoDocumento, String idPais,
			String nombres, String apellidos, String razonSocial, String idGiro, Set ubicacions, Set biometrias,
			Set giros) {
		this.idCliente = idCliente;
		this.tipoCliente = tipoCliente;
		this.tipoDocumento = tipoDocumento;
		this.idPais = idPais;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.razonSocial = razonSocial;
		this.idGiro = idGiro;
		this.ubicacions = ubicacions;
		this.biometrias = biometrias;
		this.giros = giros;
	}

	public String getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public TipoCliente getTipoCliente() {
		return this.tipoCliente;
	}

	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public TipoDocumento getTipoDocumento() {
		return this.tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getIdPais() {
		return this.idPais;
	}

	public void setIdPais(String idPais) {
		this.idPais = idPais;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getRazonSocial() {
		return this.razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getIdGiro() {
		return this.idGiro;
	}

	public void setIdGiro(String idGiro) {
		this.idGiro = idGiro;
	}

	public Set getUbicacions() {
		return this.ubicacions;
	}

	public void setUbicacions(Set ubicacions) {
		this.ubicacions = ubicacions;
	}

	public Set getBiometrias() {
		return this.biometrias;
	}

	public void setBiometrias(Set biometrias) {
		this.biometrias = biometrias;
	}

	public Set getGiros() {
		return this.giros;
	}

	public void setGiros(Set giros) {
		this.giros = giros;
	}

}