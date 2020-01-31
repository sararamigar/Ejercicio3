package com.amanecer.seguros.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cobertura database table.
 * 
 */
@Entity
@Table(name="cobertura")
@NamedQuery(name="Cobertura.findAll", query="SELECT c FROM Cobertura c")
public class Cobertura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String dental;

	private String fecundacion;

	private String oftalmologia;

	//bi-directional one-to-one association to Seguro
	@OneToOne(mappedBy="cobertura1")
	private Seguro seguro1;

	//bi-directional one-to-one association to Seguro
	@OneToOne(mappedBy="cobertura2")
	private Seguro seguro2;

	public Cobertura() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDental() {
		return this.dental;
	}

	public void setDental(String dental) {
		this.dental = dental;
	}

	public String getFecundacion() {
		return this.fecundacion;
	}

	public void setFecundacion(String fecundacion) {
		this.fecundacion = fecundacion;
	}

	public String getOftalmologia() {
		return this.oftalmologia;
	}

	public void setOftalmologia(String oftalmologia) {
		this.oftalmologia = oftalmologia;
	}

	public Seguro getSeguro1() {
		return this.seguro1;
	}

	public void setSeguro1(Seguro seguro1) {
		this.seguro1 = seguro1;
	}

	public Seguro getSeguro2() {
		return this.seguro2;
	}

	public void setSeguro2(Seguro seguro2) {
		this.seguro2 = seguro2;
	}

}