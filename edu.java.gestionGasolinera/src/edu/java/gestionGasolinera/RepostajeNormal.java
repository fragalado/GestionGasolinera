package edu.java.gestionGasolinera;

import java.time.LocalDate;

public class RepostajeNormal {
	// NORMAL: se guarda la fecha, los litros y el importe.
	
	// Atributos
	
	private LocalDate fecha;
	private double litros;
	private double importe;
	
	// Constructores
	
		// Constructor 1: Sin parámetros
	public RepostajeNormal() {
		super();
	}
		
		// Constructor 2: Pasándole todos los paramétros
	public RepostajeNormal(LocalDate fecha, double litros, double importe) {
		super();
		this.fecha = fecha;
		this.litros = litros;
		this.importe = importe;
	}

	// Getters And Setters
	
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	
	// Métodos
	
	
}
