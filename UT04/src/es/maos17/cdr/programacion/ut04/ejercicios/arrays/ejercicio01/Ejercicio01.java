package es.maos17.cdr.programacion.ut04.ejercicios.arrays.ejercicio01;

public class Ejercicio01 {
	private static final int CANTIDAD_NUMEROS = 5;

	public static void main(String[] args) {
		int[] numeros = new int[CANTIDAD_NUMEROS];

		numeros[0] = 3;
		numeros[1] = 6;
		numeros[2] = 9;
		numeros[3] = 7;
		numeros[4] = 5;
		// numeros[5] = 10; // Lanza una excepción de índice fuera de límites
		System.out.printf("La tercera posición (índice 2) es %d, y la cuarta (índice 3) es %d.\n", numeros[2],
				numeros[3]);
	}

}
