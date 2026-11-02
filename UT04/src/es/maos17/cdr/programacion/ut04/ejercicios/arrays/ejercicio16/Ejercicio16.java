package es.maos17.cdr.programacion.ut04.ejercicios.arrays.ejercicio16;

import es.maos17.cdr.programacion.ut04.ejercicios.arrays.utilidades.Utilidades;

public class Ejercicio16 {

	private static final int CANTIDAD = 11;
	private static final int MIN = 1000;
	private static final int MAX = 2000;

	public static void main(String[] args) {
		int[] numeros = Utilidades.generarNumeros(CANTIDAD, MIN, MAX);
		Utilidades.mostrarNumeros(numeros, ", ");
		invertirArray(numeros);
		Utilidades.mostrarNumeros(numeros, ", ");
	}

	public static void invertirArray(int[] numeros) {
		
		// Comprueba si es null. Los arrays son objetos, y pueden tener valor "null".
		// Si es null, al llamar, por ejemplo, al atributo "length", se produciría una
		// excepción NullPointerException
		
		if (numeros != null) {
			for (int i = 0; i < (numeros.length / 2); i++) {
				int aux = numeros[i];
				numeros[i] = numeros[numeros.length -1 -i];
				numeros[numeros.length -1 - i] = aux;
			}
		}
	}
}