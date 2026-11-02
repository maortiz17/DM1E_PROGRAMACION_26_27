package es.maos17.cdr.programacion.ut04.ejercicios.arrays.ejercicio10;

import es.maos17.cdr.programacion.ut04.ejercicios.arrays.utilidades.Utilidades;

public class Ejercicio10 {
	private static int CANTIDAD = 20;
	private static int MINIMO = 1;
	private static int MAXIMO = 20;
	
	public static void main(String[] args) {
		int[] numeros = Utilidades.generarNumeros(CANTIDAD, MINIMO, MAXIMO);
		Utilidades.mostrarNumeros(numeros, ", ");
		procesarArray(numeros);
		Utilidades.mostrarNumeros(numeros, ", ");
	}
	
	private static void procesarArray(int[] numeros) {
		for (int i =0; i < numeros.length; i++) {
			if (Utilidades.esPrimo(numeros[i])) {
				numeros[i] = 0;
			}
		}
	}
}
