package aplicacion.servicios;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import aplicacion.entidades.Repostaje;

/**
 * Implementación de la interfaz repostaje
 * @author csi22
 *
 */
public class ImplRepostaje implements InterfazRepostaje{

	//
	
	// implementación repostaje normal
	@Override
	public Repostaje repostajeNormal(List<Repostaje> listaBD) {
			
		// Vamos a pedir al usuario los siguientes valores:
		// la fecha, los litros y el importe.
		// Scanner con los valores del usuario
		Scanner entradaValores = new Scanner(System.in);
		
		// Variables utilizadas
		LocalDate entradaFecha;
		float entradaLitros, entradaImporte, eurosLitroGasolina, totalIVAGasolina;
		
		// Preguntamos la fecha del repostaje
		System.out.println("Introduzca la fecha del respotaje:");
		entradaFecha = LocalDate.parse(entradaValores.next());
		
		// Preguntamos los litros del repostaje
		System.out.println("Introduzca los litros del repostaje:");
		entradaLitros = entradaValores.nextFloat();
		
		// Para calcular el importe
		// Vamos a usar el precio real del disel y le calculamos el iva (21%)
		eurosLitroGasolina = 1.65f;
		entradaImporte = entradaLitros * eurosLitroGasolina;
		// Ahora le calculamos le IVA, una vez calculada se lo sumamos al importe
		totalIVAGasolina = entradaImporte * 0.21f;
		entradaImporte += totalIVAGasolina;
		
		// Devolvemos el objeto de tipo Repostaje creado con los datos
		Repostaje aux = new Repostaje();
		// Para añadir el id vamos a llamar a calculoID()
		aux.setId(calculoID(listaBD));
		aux.setFecha(entradaFecha);
		aux.setLitros(Math.round(entradaLitros*10.0)/10f);
		aux.setImporte(Math.round(entradaImporte*100.0)/100f);;
		
		// Cerramos la variable Scanner antes de cerrar
		// Si la cerramos da error
		//entradaValores.close();
		return aux;

	}
	
	
	// implementación repostaje con factura
	@Override
	public List<Repostaje> repostajeFactura(List<Repostaje> listaBD) {
		
		// Declaramos las variables que vamos a utilizar
		LocalDate entradaFecha;
		float entradaLitros, entradaImporte, eurosLitroGasolina;
		String entradaDNI, entradaMatricula;
		
		// Scanner para preguntar los datos al usuario
		Scanner entradaDatos  = new Scanner(System.in);
		
		// Pedimos los datos
		// Empezamos pidiendo el DNI
		System.out.println("Introduzca su DNI:");
		entradaDNI = entradaDatos.next();
		
		// Pedimos la matrícula ahora
		System.out.println("Introduzca su matrícula del coche:");
		entradaMatricula = entradaDatos.next();
		
		// Pedimos la fecha
		System.out.println("Introduzca la fecha del repostaje:");
		entradaFecha = LocalDate.parse(entradaDatos.next());
		
		// Pedimos el importe a echar de gasolina y después calculamos cuántos litros serían
		System.out.println("Importe para el repostaje:");
		entradaImporte = entradaDatos.nextFloat();
		
		// Calculamos ahora los litros que serían
		eurosLitroGasolina = 1.65f;
		entradaLitros = entradaImporte / eurosLitroGasolina;
		
		// Creamos el objeto de tipo Repostaje para asignarle los valores
		Repostaje aux = new Repostaje();
		// ID
		aux.setId(calculoID(listaBD));
		aux.setFecha(entradaFecha);
		aux.setLitros(Math.round(entradaLitros*10.0)/10f);
		aux.setImporte(Math.round(entradaImporte*100.0)/100f);
		aux.setDni(entradaDNI);
		aux.setMatricula(entradaMatricula);
		
		// Devolvemos la lista con el nuevo objeto Repostaje
		listaBD.add(aux);
		return listaBD;

	}

	// implementación listado todos repostajes
	@Override
	public void todosRepostajes(List<Repostaje> listaBD) {
		//
		// Vamos a mostrar todos los repostajes de la base de datos
		for (Repostaje aux : listaBD) {
			System.out.println("[Fecha Repostaje=" + aux.getFecha() + "; Litros=" + aux.getLitros() + "; Importe=" + aux.getImporte() + 
					"; Dni=\"" + aux.getDni() + "\"; Matricula=\"" + aux.getMatricula() + "\"]");
		}	
	}
	
	/**
	 * Calcular id del nuevo repostaje 
	 * @param listaBD (lista actual de repostajes)
	 * @return id de un nuevo repostaje
	 */
	private int calculoID(List<Repostaje> listaBD) {
		 
		int idActual, idMayor=0;
		for (Repostaje aux : listaBD) {
			
			// Guardamos en la variable idActual el valor del id del repostaje aux
			// Y si es mayor que idMayor le asignaremos el nuevo id
			idActual = aux.getId();
			
			if(idActual > idMayor)
				idMayor = idActual;
		}
		
		// Devolvemos el idMayor + 1
		return idMayor + 1;
	}

}
