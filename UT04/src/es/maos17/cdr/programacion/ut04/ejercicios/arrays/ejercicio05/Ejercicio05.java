package es.maos17.cdr.programacion.ut04.ejercicios.arrays.ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

	private static final int CANTIDAD_NUMEROS = 10;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = solicitarNumeros(CANTIDAD_NUMEROS, sc);
		System.out.println("\n--- Método con presentación integrada (void) ---");
		mostrarMaximoMinimo(numeros);
	}

	private static int[] solicitarNumeros(int cantidad, Scanner sc) {
		int[] numeros = new int[cantidad];
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Introduce el número %d: ", i + 1);
			numeros[i] = sc.nextInt();
		}
		return numeros;
	}

	private static void mostrarMaximoMinimo(int[] numeros) {
		if (numeros == null || numeros.length == 0) {
			System.out.println("Array vacío");
		} else {
			int maximo = numeros[0];
			int minimo = numeros[0];
			int posMaximo = 1;
			int posMinimo = 1;

			for (int i = 1; i < numeros.length; i++) {
				if (numeros[i] > maximo) {
					posMaximo = i + 1;
					maximo = numeros[i];
				}
				if (numeros[i] < minimo) {
					posMinimo = i + 1;
					minimo = numeros[i];
				}
			}
			System.out.printf("El máximo es %d (posición %d) y el mínimo es %d (posición %d).\n", maximo, posMaximo, minimo, posMinimo);
		}
	}
}
