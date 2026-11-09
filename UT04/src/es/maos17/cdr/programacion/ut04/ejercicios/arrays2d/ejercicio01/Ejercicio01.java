package es.maos17.cdr.programacion.ut04.ejercicios.arrays2d.ejercicio01;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio01 {

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
			System.out.printf("Suma de fila %d = %d\n", i, sumarFila(numeros, i));
		}
		for (int i = 0; i < numColumnas; i++) {
			System.out.printf("Suma de columna %d = %d\n", i, sumarColumna(numeros, i));
		}
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

		for (int numero : numeros[numFila]) {
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

	
}
