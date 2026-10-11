package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio41;

public class Ejercicio41 {
	/*
	 * Crea un método en Java que muestre por consola tu nombre y apellidos. El método
	 * no tiene que recibir parámetros ni devolver ningún valor. Tu nombre y apellidos
	 * tienen que estar en una constante de la clase (del programa).
	 * Escribe el programa principal (método main) para que llame al método que has
	 * creado para mostrar tu nombre y apellidos.
	 */
	private static final String NOMBRE_COMPLETO = "Miguel Ángel Ortiz";

	public static void main(String[] args) {
		escribirNombre();
		escribirNombre("Hola ");
	}
	
	private static void escribirNombre() {
		System.out.println(NOMBRE_COMPLETO);
	}
	
	private static void escribirNombre(String saludo) { // Método sobrecargado
		System.out.println(saludo + NOMBRE_COMPLETO + "!!");
	}

}
