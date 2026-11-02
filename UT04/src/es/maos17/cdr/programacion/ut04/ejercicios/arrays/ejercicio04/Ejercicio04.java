package es.maos17.cdr.programacion.ut04.ejercicios.arrays.ejercicio04;

import es.maos17.cdr.programacion.ut04.ejercicios.arrays.utilidades.Utilidades;

public class Ejercicio04 {

	private static final int VALOR_MINIMO = 0;
	private static final int VALOR_MAXIMO = 99;
	private static final int CANTIDAD_NUMEROS = 100;

	public static void main(String[] args) {
		// Llamada al método versión 1
		int[] numeros = Utilidades.generarNumeros(CANTIDAD_NUMEROS, VALOR_MINIMO, VALOR_MAXIMO);
		
		Utilidades.mostrarNumeros(numeros, " ");
		
		int suma = calcularSuma(numeros);


		double media = calcularMedia(numeros);

		if (media != -1) {
			System.out.printf("La suma es %d y la media es %.2f\n", suma, media);
		} else {
			System.out.println("El array está vacío.");
		}

		// Llamada al método versión 2
		Utilidades.generarNumeros(numeros, VALOR_MINIMO,VALOR_MAXIMO);

		Utilidades.mostrarNumeros(numeros, " ");
		
		suma = calcularSuma(numeros);

		media = calcularMedia(numeros);

		if (media != -1) {
			System.out.printf("La suma es %d y la media es %.2f\n", suma, media);
		} else {
			System.out.println("El array está vacío.");
		}

		// Prueba de control con array vacío
		int[] vacio = new int[0];
		double mediaVacio = calcularMedia(vacio);
		if (mediaVacio != -1) {
			System.out.printf("La media es %.2f\n", mediaVacio);
		} else {
			System.out.println("No se puede calcular la media: el array está vacío.");
		}
	}

	/**
	 * Recibe un array de enteros y suma sus elementos mediante bucle for-each
	 * 
	 * @param numeros: array a sumar
	 * @return: suma de los elementos del array
	 */
	private static int calcularSuma(int[] numeros) {
		int suma = 0;
		for (int numero : numeros) {
			suma += numero;
		}
		return suma;
	}

	/**
	 * Recibe un array de enteros y calcula el valor medio. Utilizamos el método
	 * {@link #calcularSuma(int[])} para sumar, y luego dividimos por la cantidad de
	 * elementos. A tener en cuenta:
	 * <ul>
	 * <li>Si el array está vacío se produce excepción por división por cero.
	 * Controlado.
	 * <li>Ojo con la división entera
	 * 
	 * @param numeros: array sobre el que calcular el valor medio
	 * @return: devuelve el valor medio de los elementos del array (-1 si el array
	 *          recibido está vacío)
	 */
	private static double calcularMedia(int[] numeros) {
		if (numeros.length == 0) {
			return -1;
		}
		return (double) calcularSuma(numeros) / numeros.length;
	}

}
