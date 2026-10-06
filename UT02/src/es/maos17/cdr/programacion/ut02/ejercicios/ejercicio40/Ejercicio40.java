package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio40;

public class Ejercicio40 {

	// Secuencias de escape ANSI para color y reseteo
	private static final String RESET = "\u001B[0m";
	private static final String COLOR_PRIMO = "\u001B[33m"; // Amarillo (o 32m verde, 31m rojo, 36m cian)
	private static final int TOTAL_NUMEROS = 120;
	private static final int COLUMNAS = 10;
	
	public static void main(String[] args) {
		/*
		 * Realizar un programa que muestre todos los números del 1 al 120, en filas de
		 * 10 números. En esta matriz de números se deben generar con un color distinto
		 * los números primos.
		 */

		for (int numero = 1; numero <= TOTAL_NUMEROS; numero++) {

			// --- Comprobación de si 'numero' es primo 
			boolean esPrimo = numero > 1;
			int raizCuadrada = (int) Math.sqrt(numero);
			int divisor = 2;

			while (divisor <= raizCuadrada && esPrimo) {
				if (numero % divisor == 0) {
					esPrimo = false;
				}
				divisor++;
			}

			// Selección del color y visualización alineada a 3 caracteres
			if (esPrimo) {
				System.out.printf(COLOR_PRIMO + "%3d " + RESET, numero);
			} else {
				System.out.printf("%3d ", numero);
			}

			// Salto de línea al completar cada fila de 10 columnas
			if (numero % COLUMNAS == 0) {
				System.out.println();
			}
		}
	}

}