package es.maos17.cdr.programacion.ut01.ejercicios.ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		/*
		 * Pide al usuario dos pares de números x1, y2 y x2, y2, que representen dos
		 * puntos en el plano. Calcula y muestra la distancia entre ellos.
		 */
		Scanner scanner = new Scanner(System.in);

		int x1, y1, x2, y2;

		System.out.print("Introduce x1: ");
		x1 = scanner.nextInt();
		System.out.print("Introduce y1: ");
		y1 = scanner.nextInt();
		System.out.print("Introduce x2: ");
		x2 = scanner.nextInt();
		System.out.print("Introduce y2: ");
		y2 = scanner.nextInt();

		double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		System.out.printf("La distancia entre los dos puntos es %.4f", distancia);

	}
}
