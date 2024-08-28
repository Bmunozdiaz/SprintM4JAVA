package main;

/*
 * @author Ariel Alfaro - Bastian Muñoz
 * @version: 28/08/24
 */
public class Principal {

	public static void main(String[] args) {
		// Creacion del objeto de la clase Contenedor.
		Contenedor c = new Contenedor();
/*
*  Llamado al metodo menu de la clase Contenedor que permite desplegar un menu de opciones por consola.
*  Permite almacenar Usuarios de tipo clientes,profesionals, administrativos y capacitaciones. 
*  Tambien permite listar las capacitaciones almacenadas anteriormente.
*/
		c.menu();
		
	} // Cierra el metodo main.

} // Cierra la clase Principal.
