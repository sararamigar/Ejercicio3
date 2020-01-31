package com.amanecer.seguros.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the seguro database table.
 * 
 */
@Entity
@Table(name="seguro")
@NamedQuery(name="Seguro.findAll", query="SELECT s FROM Seguro s")
public class Seguro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String ape1;

	private String ape2;

	private byte casado;

	private int coberturas;

	private int edad;

	private byte embarazada;

	private int enfermedades;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;

	private String nif;

	private String nombre;

	private int numHijos;

	private int sexo;

	//bi-directional many-to-one association to Asistencia
	@OneToMany(mappedBy="seguro")
	private List<Asistencia> asistencias;

	//bi-directional one-to-one association to Cobertura
	@OneToOne
	@JoinColumns({
		})
	private Cobertura cobertura1;

	//bi-directional one-to-one association to Cobertura
	@OneToOne
	@JoinColumns({
		})
	private Cobertura cobertura2;

	public Seguro() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApe1() {
		return this.ape1;
	}

	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}

	public String getApe2() {
		return this.ape2;
	}

	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}

	public byte getCasado() {
		return this.casado;
	}

	public void setCasado(byte casado) {
		this.casado = casado;
	}

	public int getCoberturas() {
		return this.coberturas;
	}

	public void setCoberturas(int coberturas) {
		this.coberturas = coberturas;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public byte getEmbarazada() {
		return this.embarazada;
	}

	public void setEmbarazada(byte embarazada) {
		this.embarazada = embarazada;
	}

	public int getEnfermedades() {
		return this.enfermedades;
	}

	public void setEnfermedades(int enfermedades) {
		this.enfermedades = enfermedades;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getNif() {
		return this.nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumHijos() {
		return this.numHijos;
	}

	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}

	public int getSexo() {
		return this.sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public List<Asistencia> getAsistencias() {
		return this.asistencias;
	}

	public void setAsistencias(List<Asistencia> asistencias) {
		this.asistencias = asistencias;
	}

	public Asistencia addAsistencia(Asistencia asistencia) {
		getAsistencias().add(asistencia);
		asistencia.setSeguro(this);

		return asistencia;
	}

	public Asistencia removeAsistencia(Asistencia asistencia) {
		getAsistencias().remove(asistencia);
		asistencia.setSeguro(null);

		return asistencia;
	}

	public Cobertura getCobertura1() {
		return this.cobertura1;
	}

	public void setCobertura1(Cobertura cobertura1) {
		this.cobertura1 = cobertura1;
	}

	public Cobertura getCobertura2() {
		return this.cobertura2;
	}

	public void setCobertura2(Cobertura cobertura2) {
		this.cobertura2 = cobertura2;
	}

}