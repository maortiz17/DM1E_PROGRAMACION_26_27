package es.maos17.cdr.programacion.ut04.ejercicios.arrays.ejercicio09;

import java.util.Random;

import es.maos17.cdr.programacion.ut04.ejercicios.arrays.utilidades.Utilidades;

public class Ejercicio09 {
	private static final int CANTIDAD_NUMEROS = 100;
	private static final int MIN = 0;
	private static final int MAX = 10;
	
	public static void main(String[] args) {
		int[] numeros = new int[CANTIDAD_NUMEROS];
		Utilidades.generarNumeros(numeros, MIN, MAX);
		Utilidades.mostrarNumeros(numeros, " ");
		procesarNumeros(numeros);
		Utilidades.mostrarNumeros(numeros, " ");
	}
	
	private static void procesarNumeros(int[] numeros) {
		if (numeros == null) {
			return;
		}
		for (int i = 0; i < numeros.length; i++) {
			if (esPar(numeros[i])) { // Si el número es par
				numeros[i] /= 2; // numeros[i] = numeros[i] / 2;
			} else {
				numeros[i] *= 2; // numeros[i] = numeros[i] * 2;
			}
		}
	}
	
	private static boolean esPar(int numero) {
		return numero % 2 == 0;
	}
}
