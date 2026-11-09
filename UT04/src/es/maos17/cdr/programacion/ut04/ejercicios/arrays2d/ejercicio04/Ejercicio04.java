package es.maos17.cdr.programacion.ut04.ejercicios.arrays2d.ejercicio04;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio04 {
	private static int VALOR_MAXIMO = 9;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero de filas: ");
		int n = sc.nextInt();
		System.out.print("Numero de columnas: ");
		int m = sc.nextInt();
		// Creamos array
		int[][] matriz = new int[n][m];
		rellenarConAleatorios(matriz);
		// Mostramos valor inicial
		System.out.println("Matriz inicial");
		mostrarMatriz(matriz);
		// Permutamos la filas
		permutarFilas(matriz, calcularMinimo(matriz), calcularMaximo(matriz));
		// Mostramos valor final
		System.out.println("Matriz final");
		mostrarMatriz(matriz);
	}
	
	private static void permutarFilas(int[][] array, int fila1, int fila2) {
		int auxiliar; // para intercambio de valores
		for (int i = 0; i < array[0].length; i++) {
			// Intercambiamos valores de ambas filas uno a uno con ayuda de variable auxiliar
			auxiliar = array[fila1][i];
			array[fila1][i] = array[fila2][i];
			array[fila2][i] = auxiliar;
		}
	}
	
	private static void rellenarConAleatorios(int[][] array) {
		Random aleatorio = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0;j < array[i].length; j++) {
				array[i][j] = aleatorio.nextInt(VALOR_MAXIMO + 1);
			}
		}
	}
	
	public static int calcularMinimo(int[][] array) {
		int filaMinimo = 0;
		int valorMinimo = 0;
		int suma = 0;
		
		// Calculamos la suma de la PRIMERA fila (fila 0) para tener una referencia
	    for (int j = 0; j < array[0].length; j++) {
	        valorMinimo += array[0][j];
	    }
		
		for (int i = 1; i < array.length; i++) {
			suma = 0;
			for (int j = 0;j < array[i].length; j++) {
				suma += array[i][j];
			}
			if (suma < valorMinimo) { // Nos quedamos con la primera que tenga el valor mínimo
				valorMinimo = suma;
				filaMinimo = i;
			}
		}
		return filaMinimo;
	}
	
	public static int calcularMaximo(int[][] array) {
		int filaMaximo = 0;
		int valorMaximo = 0;
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma = 0;
			for (int j = 0;j < array[i].length; j++) {
				suma += array[i][j];
			}
			if (suma > valorMaximo) { // Nos quedamos con la primera que tenga el valor máximo
				valorMaximo= suma;
				filaMaximo= i;
			}
		}
		return filaMaximo;
	}
	
	public static void mostrarMatriz(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0;j < array[i].length; j++) {
				System.out.printf("%d ", array[i][j]);
			}
			System.out.println();
		}
	}

}
