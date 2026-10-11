package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio42;

public class Ejercicio42 {
	/*
	 * Crea un método en Java que reciba dos números (con decimales) y muestre en la
	 * consola la suma de los dos números. El método tiene que llamarse “suma”, recibirá
	 * dos parámetros y no devuelve ningún valor.
	 * Prueba el método invocándolo desde el método main.
	 */

	public static void main(String[] args) {
		double numero1;
		double numero2;

		numero1 = 33.4;
		numero2 = 11.1;

		suma(numero1, numero2);

	}

	private static void suma(double n1, double n2) {
		System.out.printf("%.2f + %.2f = %.2f", n1, n2, n1 + n2);
	}

}
