package es.maos17.cdr.programacion.ut04.ejercicios.arrays.utilidades;

import java.util.Random;

/**
 * Clase de utilidades. Contiene métodos estáticos que utilizaremos en
 * diferentes programas.
 * La clase tiene un único constructor privado para que no se pueda instanciar (no tiene sentido hacerlo)
 * Será algo similar a la clase de la API Java:
 * 
 * @see https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
 */
public class Utilidades {
	private Utilidades() {
	}

	/**
	 * Recibe un array de números enteros que se rellena con números aleatorios.
	 * Funciona correctamente porque pasamos una copia de la referencia del array,
	 * lo que permite modificar su contenido
	 * 
	 * @param numeros: array de números enteros a rellenar
	 * @param max:     máximo valor de los enteros aleatorios
	 */
	public static void generarNumeros(int[] numeros, int min, int max) {
		if (numeros != null) {
			Random rnd = new Random();
			for (int i = 0; i < numeros.length; i++) {
				numeros[i] = rnd.nextInt(min, max + 1);
			}
		}
	}

	/**
	 * Recibe la cantidad de números aleatorios a generar. Construimos el vector, se
	 * rellena con enteros aleatorios entre 0 y {@code max} y se devuelve
	 * 
	 * @param cantidad: cantidad de números aleatorios deseada
	 * @param max:      máximo valor de los enteros aleatorios
	 * @return: array generado con los números aleatorios solicitados
	 */
	public static int[] generarNumeros(int cantidad, int min, int max) {
		Random rnd = new Random();
		int[] numeros = new int[cantidad];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rnd.nextInt(min, max + 1);
		}
		return numeros;
	}

	/**
	 * Muestra el contenido de un array de enteros que recibe como parámetro. Los
	 * enteros se separan por comas
	 * 
	 * @param numeros
	 */
	public static void mostrarNumeros(int[] numeros, String separador) {
		if (numeros == null) {
			return;
		}
		for (int i = 0; i < numeros.length; i++) {
			if (i > 0) {
				System.out.print(separador);
			}
			System.out.print(numeros[i]);
		}
		System.out.println();
	}

	/**
	 * Determina si un número recibido como parámetro es primo o no lo es.
	 * @param numero: número a determinar si es primo
	 * @return true si el número recibido como parámetro es primo, y false en caso contrario
	 */
	public static boolean esPrimo(int numero) {

		boolean esPrimo = numero > 1;
		int limite = (int) Math.sqrt(numero) + 1;
		for (int divisor = 2; divisor <= limite && esPrimo; divisor++) {
			if (numero % divisor == 0) {
				esPrimo = false;
			}
		}
		return esPrimo;
	}
}
