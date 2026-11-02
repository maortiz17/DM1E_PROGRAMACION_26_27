package es.maos17.cdr.programacion.ut04.ejercicios.arrays.ejercicio07;

import es.maos17.cdr.programacion.ut04.ejercicios.arrays.utilidades.Utilidades;

public class Ejercicio07 {

	private static final int CANTIDAD_NUMEROS = 20;
	private static final int NUMERO_MINIMO = 0;
	private static final int NUMERO_MAXIMO = 99;
	
	public static void main(String[] args) {
		int[] numeros = Utilidades.generarNumeros(CANTIDAD_NUMEROS, NUMERO_MINIMO, NUMERO_MAXIMO);
		
		Utilidades.mostrarNumeros(numeros, " ");
		
		mostrarPrimos(numeros);
		
	}
	
	private static void mostrarPrimos(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			if (Utilidades.esPrimo(numeros[i])) {
				System.out.printf("%d (posición %d) es primo\n", numeros[i], i + 1);
			}
		}
	}

}
