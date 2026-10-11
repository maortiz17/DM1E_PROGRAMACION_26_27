package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio43;

public class Ejercicio43 {
	/*
	 * Crea un método “suma” en Java que reciba dos números enteros y devuelva la
	 * suma de los dos números. Este método, a diferencia del método del problema
	 * anterior, sí que devuelve el valor de la suma, y no muestra nada por pantalla.
	 * Prueba el método invocándolo desde el método main.
	 */

	public static void main(String[] args) {
		int numero1, numero2;
		
		numero1 = 33;
		numero2 = 11;
		
		System.out.printf("%d + %d = %d", numero1, numero2, suma(numero1, numero2));

		double otroNumero = 2 * suma(numero1, numero2);
	}

	private static int suma(int n1, int n2) {
		return n1 + n2;
	}

}
