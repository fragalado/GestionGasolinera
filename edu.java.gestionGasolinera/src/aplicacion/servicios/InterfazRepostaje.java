package aplicacion.servicios;

import java.util.List;

import aplicacion.entidades.Repostaje;

/**
 * Interfaz que define los metodos que dan servicio a la gestion de repostaje
 * @author csi22
 *
 */
public interface InterfazRepostaje {
	// Cabecera
	
	// repostaje normal
	/**
	 * Devuelve un repostaje normal
	 * @param listaBD (lista con los repostajes)
	 * @return repostaje
	 */
	public Repostaje repostajeNormal(List<Repostaje> listaBD);
	
	// repostaje factura
	/**
	 * Devuelve una lista actualizada con el repostaje factura
	 * @param listaBD (lista con los repostajes)
	 * @return List actualizada
	 */

	public List<Repostaje> repostajeFactura(List<Repostaje> listaBD);
	
	// listar todos los repostajes
	/**
	 * Muestra por consola el listado de repostajes existente
	 * @param listaBD
	 */
	public void todosRepostajes(List<Repostaje> listaBD);
}
