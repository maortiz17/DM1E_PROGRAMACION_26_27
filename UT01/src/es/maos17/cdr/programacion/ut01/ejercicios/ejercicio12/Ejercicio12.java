package es.maos17.cdr.programacion.ut01.ejercicios.ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		/*
		 * Pide al usuario dos números enteros y muestra la “distancia” entre ellos. La
		 * distancia entre dos números enteros es el valor absoluto de su diferencia, de
		 * modo que el resultado sea siempre positivo.
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		int primerNumero = scanner.nextInt();
		System.out.print("Introduce el segundo número: ");
		int segundoNumero = scanner.nextInt();

		int distancia = Math.abs(primerNumero - segundoNumero);

		System.out.printf("La distancia entre %d y %d es %d\n", primerNumero, segundoNumero, distancia);

	}
}
