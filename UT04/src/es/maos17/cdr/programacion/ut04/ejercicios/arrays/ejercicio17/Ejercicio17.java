package es.maos17.cdr.programacion.ut04.ejercicios.arrays.ejercicio17;

import java.util.Scanner;

import es.maos17.cdr.programacion.ut04.ejercicios.arrays.utilidades.Utilidades;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Generamos el array en un método
		int[] numeros = generarArray(sc, solicitarNumero(sc, "¿Cuántos elementos tendrá el array?: "));

		// Solicitamos posición inicial y final con los controles necesarios
		int posInicial, posFinal;

		do {
			posInicial = solicitarNumero(sc, String.format("Posición inicial a invertir (0-%d): ", numeros.length - 2));
			posFinal = solicitarNumero(sc,
					String.format("Posición final a invertir (%d-%d): ", posInicial + 1, numeros.length - 1));
			if (posInicial < 0 || posFinal < 0) {
				System.out.println("Ambos tienen que ser mayores que 0.");
			} else if (posInicial > posFinal) {
				System.out.println("La posición inicial tiene que ser menor o igual que la posición final.");
			} else if (posFinal > numeros.length - 1) {
				System.out.println("Tienen que ser menores que la cantidad de números cargados");
			}
		} while (posInicial < 0 || posFinal < 0 || posInicial > posFinal || posFinal > numeros.length - 1);

		Utilidades.mostrarNumeros(numeros, ",");
		invertirArray(numeros, posInicial, posFinal);
		Utilidades.mostrarNumeros(numeros, ",");
	}

	public static void invertirArray(int[] numeros, int posInicial, int posFinal) {

		if (numeros != null) {
			// Utilicemos un método diferente, tal vez un poco más intuitivo
			// Empieza por la izquierda desde la posición inicial solicitada del array
			int izquierda = posInicial;
			// Por la derecha desde el final de la posición solicitada del array
			int derecha = posFinal;
			// Mientras que no se crucen...
			while (izquierda < derecha) {
				// Permutamos los valores de las dos posiciones.
				int aux = numeros[izquierda];
				numeros[izquierda] = numeros[derecha];
				numeros[derecha] = aux;
				// La izquierda avanza hacia delante y la derecha hacia atrás
				izquierda++;
				derecha--;
			}

			// Podemos hacerlo con un bucle for como antes
			//if (numeros != null) {
			//	for (int i = 0; i < ((posFinal - posInicial) / 2); i++) {
			//		int aux = numeros[posInicial + i];
			//		numeros[posInicial + i] = numeros[posFinal - i];
			//		numeros[posFinal - i] = aux;
			//	}
			//}
		}
	}

	public static int[] generarArray(Scanner scanner, int numero) {
		// Crear el array del tamaño adecuado. Solicitamos tamaño
		int[] numeros = new int[numero];
		// Recorrer el array (con un índice, porque si no no se puede cambiar)
		for (int i = 0; i < numeros.length; i++) {
			// En cada posición leemos un valor por teclado
			numeros[i] = solicitarNumero(scanner, "Introduzca un número: ");
		}
		// Devuelve el array generado
		return numeros;
	}

	public static int solicitarNumero(Scanner scanner, String mensaje) {
		System.out.print(mensaje);
		return scanner.nextInt();
	}

}