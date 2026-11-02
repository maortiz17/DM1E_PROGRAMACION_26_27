package es.maos17.cdr.programacion.ut04.ejercicios.arrays.ejercicio20;

import java.util.Scanner;

import es.maos17.cdr.programacion.ut04.ejercicios.arrays.utilidades.Utilidades;

public class Ejercicio20 {
	private static final int CANTIDAD_NUM_USUARIO = 5;
	private static final int CANTIDAD_NUM_ALEATORIOS = 25;
	private static final int MIN = 1;
	private static final int MAX = 100;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		NumeroBuscado[] numerosBuscados = pedirNumerosAUsuario(CANTIDAD_NUM_USUARIO, MIN, MAX, scanner);
		int[] aleatorios = Utilidades.generarNumeros(CANTIDAD_NUM_ALEATORIOS, MIN, MAX);
		buscarNumeros(numerosBuscados, aleatorios);
		System.out.println("Números del usuario");
		for (NumeroBuscado numeroUsuario : numerosBuscados) {
			System.out.printf("%d ", numeroUsuario.getNumeroUsuario());
		}
		System.out.println();
		System.out.println("Números aleatorios");
		Utilidades.mostrarNumeros(aleatorios, " ");
		System.out.println("Resultado");
		mostrarEncontrados(numerosBuscados);

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

	private static NumeroBuscado[] pedirNumerosAUsuario(int cantidadNumeros, int min, int max, Scanner scanner) {
		NumeroBuscado[] numerosBuscados = new NumeroBuscado[cantidadNumeros];
		for (int i = 0; i < numerosBuscados.length; i++) {
			int numeroUsuario = pedirNumero(scanner, min, max);
			numerosBuscados[i] = new NumeroBuscado(numeroUsuario);
		}
		return numerosBuscados;
	}

	private static void buscarNumeros(NumeroBuscado[] numerosBuscados, int numeros[]) {

		for (int posBuscado = 0; posBuscado < numerosBuscados.length; posBuscado++) {

			for (int numeroCandidato : numeros) {
				if (numerosBuscados[posBuscado].getNumeroUsuario() == numeroCandidato) {
					numerosBuscados[posBuscado].setSeEncontro(true);
				}
			}
		}
		
		// Aquí no es necesario devolver nada. Como tenemos la referencia la array, lo modificamos directamente
	}

	private static void mostrarEncontrados(NumeroBuscado[] numerosUsuario) {
		for (NumeroBuscado numeroUsuario : numerosUsuario) {
			if (numeroUsuario.seEncontro()) {
				System.out.printf("%d - Encontrado\n", numeroUsuario.getNumeroUsuario());
			} else {
				System.out.printf("%d - No encontrado\n", numeroUsuario.getNumeroUsuario());
			}
		}

	}
}
