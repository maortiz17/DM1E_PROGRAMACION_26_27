package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio34;

import java.util.Scanner;

public class Ejercicio34 {

	public static void main(String[] args) {
		/*
		 * Programa que muestra en pantalla los N primeros números primos. Se pide por
		 * teclado la cantidad de números primos que queremos mostrar.
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("¿Cuántos números primos desea mostrar?: ");
		int cantidad = Integer.parseInt(sc.nextLine());

		int encontrados = 0;
		int candidato = 2;

		// Bucle externo: avanza candidatos hasta encontrar la cantidad N solicitada
		while (encontrados < cantidad) {

			boolean esPrimo = true;
			int raizCuadrada = (int) Math.sqrt(candidato);
			int divisor = 2;

			// Bucle interno: búsqueda de un divisor
			while (divisor <= raizCuadrada && esPrimo) {
				if (candidato % divisor == 0) {
					esPrimo = false;
				}
				divisor++;
			}

			if (esPrimo) {
				System.out.print(candidato + " ");
				encontrados++;
			}

			candidato++;
		}

		System.out.println();
	}

}
