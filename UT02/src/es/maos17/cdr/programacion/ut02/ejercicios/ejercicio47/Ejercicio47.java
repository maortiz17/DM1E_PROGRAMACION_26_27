package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio47;

import java.util.Scanner;

public class Ejercicio47 {
	/*
	 * Repite el ejercicio anterior, pero esta vez no uses la clase String en el
	 * método. Usa divisiones enteras para saber cuántas veces puedes dividir un
	 * número por 10.
	 */

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		numero = sc.nextInt();
		if (contarCifras(numero) == 0) {
			System.out.println("Número erróneo.");
		} else {
			System.out.printf("%d tiene %d cifras", numero, contarCifras(numero));
		}
	}

	private static int contarCifras(int numero) {
		int contadorCifras = 0;

		if (numero < 0) {
			return 0;
		}

		if (numero == 0) {
			return 1;
		}

		while (numero > 0) {
			contadorCifras++;

			numero = numero / 10;

		}
		return contadorCifras;
	}

}
