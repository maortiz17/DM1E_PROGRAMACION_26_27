package es.maos17.cdr.programacion.ut04.ejercicios.arrays2d.ejercicio02;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio02 {

	private static final int MAX = 99;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el número de filas: ");
		int numFilas = Integer.parseInt(scanner.nextLine());

		System.out.println("Introduce el número de columnas: ");
		int numColumnas = Integer.parseInt(scanner.nextLine());

		int[][] numeros = crearArray2D(numFilas, numColumnas, MAX);

		mostrarNumeros(numeros);

		for (int i = 0; i < numFilas; i++) {
			int sumaFila = sumarFila(numeros, i);
			System.out.printf("Suma de fila %d = %d\n", i, sumaFila);
			System.out.printf("Media de fila %d = %.2f\n", i, (double) sumaFila / numeros[i].length);
			System.out.printf("Máximo de fila %d = %d\n", i, maximoFila(numeros, i));
			System.out.printf("Mínimo de fila %d = %d\n", i, minimoFila(numeros, i));
		}
		for (int i = 0; i < numColumnas; i++) {
			int sumaColumna = sumarColumna(numeros, i);
			System.out.printf("Suma de columna %d = %d\n", i, sumaColumna);
			System.out.printf("Media de columna %d = %.2f\n", i, (double) sumaColumna / numeros.length);
			System.out.printf("Máximo de columna %d = %d\n", i, maximoColumna(numeros, i));
			System.out.printf("Mínimo de columna %d = %d\n", i, minimoColumna(numeros, i));
		}

		System.out.printf("Máximo absoluto: %d\n", maximoGeneral(numeros));

	}

	private static void mostrarNumeros(int[][] numeros) {
		for (int[] numerosFila : numeros) {
			for (int numero : numerosFila) {
				System.out.printf("%d ", numero);
			}
			System.out.println();
		}

	}

	private static int[][] crearArray2D(int numFilas, int numColumnas, int limiteNumeros) {
		Random rnd = new Random();

		int[][] numeros = new int[numFilas][numColumnas];

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = rnd.nextInt(limiteNumeros + 1);
			}
		}
		return numeros;
	}

	private static int sumarFila(int[][] numeros, int numFila) {
		int suma = 0;

		int[] numerosFila = numeros[numFila];

		for (int numero : numerosFila) {
			suma += numero;
		}

		return suma;
	}

	private static int sumarColumna(int[][] numeros, int numColumna) {
		int suma = 0;

		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i][numColumna];
		}

		return suma;
	}

	private static int maximoFila(int[][] numeros, int numFila) {

		int maximo = numeros[numFila][0];

		for (int numero : numeros[numFila]) {
			maximo = Math.max(maximo, numero);
		}

		return maximo;
	}

	private static int maximoColumna(int[][] numeros, int numColumna) {
		int maximo = numeros[0][numColumna];

		for (int i = 0; i < numeros.length; i++) {
			maximo = Math.max(maximo, numeros[i][numColumna]);
		}

		return maximo;
	}

	private static int minimoFila(int[][] numeros, int numFila) {

		int minimo = numeros[numFila][0];

		for (int numero : numeros[numFila]) {
			minimo = Math.min(minimo, numero);
		}

		return minimo;
	}

	private static int minimoColumna(int[][] numeros, int numColumna) {
		int minimo = numeros[0][numColumna];

		for (int i = 0; i < numeros.length; i++) {
			minimo = Math.min(minimo, numeros[i][numColumna]);
		}

		return minimo;
	}

	private static int maximoGeneral(int[][] numeros) {

		int maximo = maximoFila(numeros, 0);
		for (int i = 1; i < numeros.length; i++) {
			maximo = Math.max(maximo, maximoFila(numeros, i));
		}
		return maximo;
	}
}
