package es.maos17.cdr.programacion.ut01.ejemplos.ejemplo05;

public class Ejemplo05 {
	final static int NUMERO_FIJO = 2; // Esta constante pertenece a la clase. Está disponible en cualquier método de
										// la clase. Es la forma HABITUAL de crearlas

	public static void main(String[] args) {

		final int NUMERO_VIDAS = 3; // Esta constante es local al método main. Menos común.

		// NUMERO_VIDAS = 5; <- Error!! Esto está prohibido. No pueden modificarse constantes

		System.out.println(NUMERO_FIJO);
		System.out.println(NUMERO_VIDAS);
	}
}
