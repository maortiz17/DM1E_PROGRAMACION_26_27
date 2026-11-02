package es.maos17.cdr.programacion.ut04.ejercicios.arrays.ejercicio14;

import java.util.Random;
import java.util.Scanner;

import es.maos17.cdr.programacion.ut04.ejercicios.arrays.utilidades.Utilidades;

public class Ejercicio14 {

	private static final int CANTIDAD_NUM_USUARIO = 5;
	private static final int CANTIDAD_NUM_ALEATORIOS = 25;
	private static final int MIN = 1;
	private static final int MAX = 100;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numeros = pedirNumerosAUsuario(CANTIDAD_NUM_USUARIO, MIN, MAX, scanner);
		int[] aleatorios = Utilidades.generarNumeros(CANTIDAD_NUM_ALEATORIOS, MIN, MAX);
		boolean[] encontrados = buscarNumeros(numeros, aleatorios);
		System.out.println("Números del usuario");
		Utilidades.mostrarNumeros(numeros, ", ");
		System.out.println("Números aleatorios");
		Utilidades.mostrarNumeros(aleatorios, ", ");
		System.out.println("Resultado");
		mostrarEncontrados(numeros, encontrados);

	}

	private static int pedirNumero(Scanner scanner, int min, int max) {
		int numero;
		do {
			System.out.printf("Por favor, introduce un número entre %d y %d (ambos incluidos): ", min, max);
			numero = scanner.nextInt();
			if (numero < min || numero > max) {
				System.out.println("Error, el número no es correcto. Vuelve a intentarlo.");
			}
		} while (numero < min || numero > max);
		return numero;
	}

	private static int[] pedirNumerosAUsuario(int cantidadNumeros, int min, int max, Scanner scanner) {
		int[] numeros = new int[cantidadNumeros];
		for (int i = 0; i < numeros.length; i++) {
			int numeroUsuario = pedirNumero(scanner, min, max);
			numeros[i] = numeroUsuario;
		}
		return numeros;
	}

	private static boolean[] buscarNumeros(int[] numerosBuscados, int numeros[]) {
		boolean[] encontrados = new boolean[numerosBuscados.length];

		for (int posBuscado = 0; posBuscado < numerosBuscados.length; posBuscado++) {
			int numBuscado = numerosBuscados[posBuscado];

			for (int numeroCandidato : numeros) {
				if (numBuscado == numeroCandidato) {
					encontrados[posBuscado] = true;
				}
			}
		}
		return encontrados;
	}

	private static void mostrarEncontrados(int[] numerosUsuario, boolean[] seEncontraron) {
		for (int i = 0; i < seEncontraron.length; i++) {
			if (seEncontraron[i]) {
				System.out.printf("%d - Encontrado\n", numerosUsuario[i]);
			} else {
				System.out.printf("%d - No encontrado\n", numerosUsuario[i]);
			}
		}

	}

}