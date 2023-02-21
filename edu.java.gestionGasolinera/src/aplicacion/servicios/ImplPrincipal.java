package aplicacion.servicios;

public class ImplPrincipal implements InterfazPrincipal {

	@Override
	public void mostrarMenu() {
		// 
		System.out.println("1. Repostaje Normal");
		System.out.println("2. Repostaje Factura");
		System.out.println("3. Ver todos los repostajes");
		System.out.println("4. Salir");		
	}

}
