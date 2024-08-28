package main;

// Clase padre llamada Usuario que implementa una interfaz llamada IAsesoria.
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Usuario implements Iasesoria {

	private String nombre;
	private String fecha;
	private int run;
	
	// Constructor vacio de la clase Usuario que no recibe parametros.
	public Usuario() {
	} // Cierra el constructor vacio de la clase Usuario.

	// Constructor que posee los parametros de la clase Usuario.
	public Usuario(String nombre, String fecha, int run) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.run = run;
	} // Cierra el constructor con parametros de la clase Usuario.


	// Metodo que permite obtener el nombre de Usuario e imprimirlo por consola.
	@Override public void analizarUsuario() {
		System.out.println("Nombre de usuario: " +this.getNombre());
	}

	// Getters and Setters de la clase Usuario.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}
	
/*
 * Metodo que permite calcular y mostrar la edad de un Usuario en base a la fecha de nacimiento ingresada.
 * 1. Obtiene la fecha actual del sistema.
 * 2. Aplica un formato especifico a la fecha.
 * 3. Convierte la fecha a String y crea un arreglo del mismo tipo.
 * 4. Convierte los datos a entero y calcula la diferencia de años.
 */
	public int mostrarEdad() {
		 LocalDate dateNow = LocalDate.now();
		 DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		 String formattedDate = dateNow.format(myFormatObj);
		 String stringDate = formattedDate.toString();
		 String[] dateString = stringDate.split("-");
		 String[] userDateString = fecha.split("-");
		 int yDateInt = Integer.parseInt(dateString[2]);
		 int uDateInt = Integer.parseInt(userDateString[2]);
		 
		 return yDateInt-uDateInt ;
	 } // Cierra el metodo mostrarEdad de la clase Usuario.

/*
* Metodo toString() de la clase Usuario.
* Sobrescribe el metodo ToString para presentar por consola los datos asociados al Usuario registrado.
*/
	@Override
	public String toString() {
		return "Datos del usuario: \nNombre: " + nombre + "\nFecha de nacimiento: " + fecha+ "\nRut: " + run  ;
	}
	
} // Cierra la clase Usuario.

