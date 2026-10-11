package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio44;

public class Ejercicio44 {
	/*
	 * Crea un método “mostrarNVeces” que reciba un mensaje, que será una cadena de
	 * texto (String) y un número entero.
	 * Si el número es menor que cero, mostrará en pantalla un mensaje indicando que es
	 * un error. Si el número es mayor que cero mostrará el mensaje tantas veces como
	 * indique el parámetro entero, una vez en cada línea.
	 */

	public static void main(String[] args) {
		mostrarNVeces("Hola a todos!!", -1);
		
		mostrarNVeces("Hola a todos!!", 5);
		
	}

	private static void mostrarNVeces(String mensaje, int repeticiones) {
		if (repeticiones < 0) {
			System.out.println("Número de repeticiones erróneo.");
		} else {
			for (int i = 1; i <= repeticiones; i++) {
				System.out.println(i + " " + mensaje);
			}
		}
	}

}
