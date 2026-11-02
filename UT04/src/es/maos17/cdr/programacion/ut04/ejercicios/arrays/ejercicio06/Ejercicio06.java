package es.maos17.cdr.programacion.ut04.ejercicios.arrays.ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

	private static final int CANTIDAD_NUMEROS = 10;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numeros = solicitarNumeros(CANTIDAD_NUMEROS, sc);
		System.out.println("\n--- Método con presentación en main ---");
		int posMaximo = buscarMaximo(numeros);
		int posMinimo = buscarMinimo(numeros);
		System.out.printf("El máximo es %d (posición %d) y el mínimo es %d (posición %d).\n", numeros[posMaximo], posMaximo, numeros[posMinimo], posMinimo);
	}

	private static int[] solicitarNumeros(int cantidad, Scanner sc) {
		int[] numeros = new int[cantidad];
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Introduce el número %d: ", i + 1);
			numeros[i] = sc.nextInt();
		}
		return numeros;
	}

	private static int buscarMaximo(int[] numeros) {
		if (numeros == null || numeros.length == 0) {
			return -1;
		} else {
			int posMaximo = 0;

			for (int i = 1; i < numeros.length; i++) {
				if (numeros[i] > numeros[posMaximo]) {
					posMaximo = i;
				}
			}
			return posMaximo;
		}
	}
	
	private static int buscarMinimo(int[] numeros) {
		if (numeros == null || numeros.length == 0) {
			return -1;
		} else {
			int posMinimo = 0;

			for (int i = 1; i < numeros.length; i++) {
				if (numeros[i] < numeros[posMinimo]) {
					posMinimo = i;
				}
			}
			return posMinimo;
		}
	}
}
