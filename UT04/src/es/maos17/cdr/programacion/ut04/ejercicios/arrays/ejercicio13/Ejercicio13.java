package es.maos17.cdr.programacion.ut04.ejercicios.arrays.ejercicio13;

import java.util.Random;

public class Ejercicio13 {
	
	private static final int TAMANIO_MUESTRA = 100_000_000;
	private static final int CANTIDAD_NUMEROS = 100;
	private static final boolean PROBAR_OBJETO_RANDOM = true;
	
	public static void main(String[] args) {
		Random rnd = new Random();

		// En la posición 0 guardamos cuantas veces se genera un 0,
		// en la 1 cuantas el 1, y así sucesivamente
		int[] contadores = new int[CANTIDAD_NUMEROS];

		// Generamos números y contamos cuantas veces aparecen
		for (int i = 0; i < TAMANIO_MUESTRA; i++) {
			int numero;
			if (PROBAR_OBJETO_RANDOM) {
				numero = rnd.nextInt(CANTIDAD_NUMEROS);
			} else {
				numero = (int) (Math.random() * CANTIDAD_NUMEROS);
			}
			contadores[numero]++;
		}

		// Mostramos la cantidad de veces que se generó cada número.
		for (int i = 0; i < contadores.length; i++) {
			int aparicionesDeI = contadores[i];
			System.out.printf("%2d - %6d\n", i, aparicionesDeI);
		}

		// Llamamos a un método que buscará los extemos,
		// el que más veces se generó y el que menos.
		buscaExtremos(contadores);
	}
	
	private static void buscaExtremos(int[] numeros) {
		int menor = numeros[0];
		int posMenor = 0;
		int mayor = numeros[0];
		int posMayor = 0;
		for (int i = 0; i < numeros.length; i++) {
			int candidato = numeros[i];
			if (candidato < menor) {
				menor = candidato;
				posMenor = i;
			}
			if (candidato > mayor) {
				mayor = candidato;
				posMayor = i;
			}
		}
		System.out.printf("El número que menos veces aparece es el %d (%d veces)\n", posMenor, menor);
		System.out.printf("El número que más veces aparece es el %d (%d veces)\n", posMayor, mayor);
		System.out.printf("La diferencia entre ellos es de %d veces\n", mayor - menor);

	}

}
