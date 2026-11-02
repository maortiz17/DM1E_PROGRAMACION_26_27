package es.maos17.cdr.programacion.ut04.ejercicios.arrays.ejercicio08;

import es.maos17.cdr.programacion.ut04.ejercicios.arrays.utilidades.Utilidades;

public class Ejercicio08 {
	private static final int CANTIDAD_NUMEROS = 20;
	private static final int NUMERO_MINIMO = 0;
	private static final int NUMERO_MAXIMO = 99;

	public static void main(String[] args) {
		
		int[] numeros = Utilidades.generarNumeros(CANTIDAD_NUMEROS, NUMERO_MINIMO, NUMERO_MAXIMO);
		
		Utilidades.mostrarNumeros(numeros, " ");
		
		System.out.printf("Suma de posiciones pares: %d\n", sumarPares(numeros));
		System.out.printf("Media de posiciones impares: %.2f\n", mediaImpares(numeros));
		Utilidades.mostrarNumeros(null, " ");
	}

	private static int sumarPares(int[] numeros) {
		if (numeros == null) {
			return 0;
		}
		int suma = 0;
		for (int i = 0; i < numeros.length; i += 2) {
			suma += numeros[i];
		}
		return suma;
	}
	
	private static double mediaImpares(int[] numeros) {
		if (numeros == null || numeros.length == 0) {
			return 0;
		}
		int suma = 0;
		int cantidad = 0;
		for (int i = 1; i < numeros.length; i += 2) {
			suma += numeros[i];
			cantidad++;
		}
		return (double)suma / cantidad;
	}
}
