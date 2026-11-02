package es.maos17.cdr.programacion.ut04.ejercicios.arrays.ejercicio12;

import java.util.Random;
import java.util.Scanner;

import es.maos17.cdr.programacion.ut04.ejercicios.arrays.utilidades.Utilidades;

public class Ejercicio12 {

	private static final int CANTIDAD_MIN = 10;
	private static final int CANTIDAD_MAX = 100;
	
	private static final int MIN_NUMERO = 0;
	private static final int MAX_NUMERO = 1000;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cantidadNumeros = pedirCantidadNumeros(scanner, CANTIDAD_MIN, CANTIDAD_MAX);
		
		int[] numeros = crearNumerosAleatoriosNoRepetidos(cantidadNumeros, MIN_NUMERO, MAX_NUMERO);

		Utilidades.mostrarNumeros(numeros, "-");

		if (hayRepetidos(numeros)) { // Comprobamos el resultado
			System.out.println("Hay repetidos en el array");
		} else {
			System.out.println("No hay repetidos en el array");
		}

	}

	private static int pedirCantidadNumeros(Scanner scanner, int minCantidadNumeros, int maxCantidadNumeros) {
		int numero;

		do {
			System.out.printf("Introduce un número entre %d y %d: ", minCantidadNumeros, maxCantidadNumeros);
			numero = scanner.nextInt();
			if (numero < minCantidadNumeros || numero > maxCantidadNumeros) {
				System.out.println("El número introducido no es válido.");
			}
		} while (numero < minCantidadNumeros || numero > maxCantidadNumeros);

		return numero;
	}
	
	private static int[] crearNumerosAleatoriosNoRepetidos(int cantidadNumeros, int min, int max) {
		Random rnd = new Random();
		int[] numeros = new int[cantidadNumeros];
		for (int i = 0; i < numeros.length; i++) {
			int candidato = rnd.nextInt(min, max + 1);
			// Comprobar que el candidato no está ya en numeros
			while (contieneNumero(numeros, candidato, i)) {
				candidato = rnd.nextInt(min, max + 1);
			}
			numeros[i] = candidato;
		}
		return numeros;
	}
	

	private static boolean contieneNumero(int[] numeros, int candidato, int hastaPosicion) {
		for (int i = 0; (i < numeros.length) && (i < hastaPosicion); i++) {
			int num = numeros[i];
			if (num == candidato) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean hayRepetidos(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			int numeroBuscado = numeros[i];

			for (int j = 0; j < numeros.length; j++) {
				if (i != j) {
					int numActual = numeros[j];
					if (numActual == numeroBuscado) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
