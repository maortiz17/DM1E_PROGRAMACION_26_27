package es.maos17.cdr.programacion.ut04.ejercicios.arrays2d.ejercicio03B;

import java.util.Random;
import java.util.Scanner;

/** 
 * Esta implementación del algoritmo solo es válida para matrices cuadradas, ya que trasponemos
 * la matriz sobre sí misma
 */

public class Ejercicio03B {
	private static int VALOR_MAXIMO = 9;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Tamaño de la matriz: ");
		int n = sc.nextInt();
		// Creamos array
		int[][] matriz = new int[n][n];
		rellenarConAleatorios(matriz, VALOR_MAXIMO);
		// Mostramos valor inicial
		System.out.println("Matriz inicial");
		mostrarMatriz(matriz);
		// Trasponemos la matriz
		trasponerMatriz(matriz);
		// Mostramos valor final
		System.out.println("Matriz traspuesta");
		mostrarMatriz(matriz);

	}

	private static void rellenarConAleatorios(int[][] array, int maximo) {
		Random aleatorio = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = aleatorio.nextInt(maximo + 1);
			}
		}
	}

	private static void mostrarMatriz(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%d ", array[i][j]);
			}
			System.out.println();
		}
	}
	
	private static void trasponerMatriz(int[][] matriz) {
		//Variable auxiliar para intercambios
		int auxiliar = 0;
		/* En este caso no vamos a utilizar una segunda matriz para trasponer
		Al empezar j en i + 1, solo recorremos la diagonal superior de la matriz.
		Intercambiamos el elemento [i][j] (arriba de la diagonal) con su simétrico [j][i] (debajo de la diagonal).
		Los elementos de la diagonal principal (donde i == j) no se tocan */
		for (int i = 0; i < matriz.length; i++)
			for (int j = i + 1; j < matriz[i].length; j++) {
				auxiliar = matriz[i][j];
				matriz[i][j] = matriz[j][i];
				matriz[j][i] = auxiliar;
			}
	}
}