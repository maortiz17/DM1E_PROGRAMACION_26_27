package es.maos17.cdr.programacion.ut01.ejercicios.ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {
	static private final int PUNTOS_CORRECTA = 5;
	private final static int PUNTOS_INCORRECTA = -1;

	public static void main(String[] args) {
		/* Escribir un programa para calcular la nota final de un estudiante, considerando
		 * que por cada respuesta correcta son 5 puntos, cada incorrecta -1 y por respuesta
		 * en blanco 0.
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("¿Cuántas respuestas son correctas? ");
		int numCorrectas = scanner.nextInt();
		System.out.print("¿Cuántas respuestas son incorrectas? ");
		int numIncorrectas = scanner.nextInt();

		int nota = (numCorrectas * PUNTOS_CORRECTA) + (numIncorrectas * PUNTOS_INCORRECTA);

		System.out.printf("La nota final es %d", nota);
	}
}
