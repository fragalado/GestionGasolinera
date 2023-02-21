package aplicacion.entidades;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Repostaje {
	// CLASE REPOSTAJE
	
	// Atributos
	
	private int id;
	private LocalDate fecha = LocalDate.of(1111, 1, 1);
	private float litros = 0;
	private float importe = 0;
	private String dni = "aaaaaaaaaa";
	private String matricula = "aaaaaaaaaa";
	
	// Constructores
	
		// Constructor 1: Sin ningún atributo
	public Repostaje() {
		super();
	}

		// Constructor 2: Con todos los atributos/propiedades /// ESTE NO SE VA A UTILIZAR, PERO LO PONGO PARA RECORDAR
	public Repostaje(LocalDate fecha, float litros, float importe, String dni, String matricula) {
		super();
		this.fecha = fecha;
		this.litros = litros;
		this.importe = importe;
		this.dni = dni;
		this.matricula = matricula;
	}
	
	// Getters And Setters
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public float getLitros() {
		return litros;
	}

	public void setLitros(float litros) {
		this.litros = litros;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	// Método toString
	
	@Override
	public String toString() {
		return "Repostaje [fecha=" + fecha + ", litros=" + litros + ", importe=" + importe + ", dni=" + dni
				+ ", matricula=" + matricula + "]";
	}
	
	// Métodos
	
	/**
	 * REPOSTAJE NORMAL: se guarda la fecha, los litros y el importe.
	 * ENTRADA: Base de datos
	 * DEVUELVE: Un objeto de tipo Repostaje
	 */
	//public Repostaje repostajeNormal(List<Repostaje> listaBD) {
	//}

	/**
	 * REPOSTAJE FACTURA: se guarda la fecha, los litros, el importe, el DNI del cliente y la matrícula del vehículo.
	 */
	//public List<Repostaje> repostajeFactura(List<Repostaje> listaBD) {
		
	//}
	
	/**
	 * Para mostrar todos los repostajes
	 * ENTRADA: Base de datos
	 * DEVUELVE: Todos los repostajes (Normales y Facturas)
	 */
	//public void todosRepostajes(List<Repostaje> listaBD) {
		
	//}
	
	
}
