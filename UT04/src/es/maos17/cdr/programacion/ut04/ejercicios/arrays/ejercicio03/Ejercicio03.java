package es.maos17.cdr.programacion.ut04.ejercicios.arrays.ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cantNumeros = pedirCantidadNumeros(sc);

		int[] numeros1 = new int[cantNumeros];
		
		pedirNumeros(numeros1, sc);
		
		int[] numeros2 = pedirNumeros(cantNumeros, sc);
		
		mostrarNumerosOrdenNormal(numeros1);
		mostrarNumerosOrdenInverso(numeros2);
		
	}
	
	private static int pedirCantidadNumeros(Scanner sc) {
		int cantNumeros = 0;
		do {
			System.out.print("¿Cuántos números desea?: ");
			cantNumeros = sc.nextInt();
			if (cantNumeros <= 0) {
				System.err.println("Tiene que ser un número positivo");
			}
		} while (cantNumeros <= 0);
		
		return cantNumeros;
	}
	// Método sobrecargado con las dos versiones del enunciado
	
	// Esta versión recibe la referencia al array por valor y modifica su contenido en el heap
	private static void pedirNumeros(int[] array, Scanner sc) {
		System.out.println("Sistema 1");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Introduce el número %d: ", i + 1);
			array[i] = sc.nextInt();
		}
	}

	// Esta versión devuelve un array creado en el propio método
	private static int[] pedirNumeros(int tam, Scanner sc) {
		System.out.println("Sistema 2");
		int[] array = new int[tam];
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Introduce el número %d: ", i + 1);
			array[i] = sc.nextInt();
		}
		return array;
	}
	
	private static void mostrarNumerosOrdenNormal(int[] numeros) {
		// En orden normal podemos utilizar un bucle for-each
		System.out.println("Orden normal");
		for (int numero : numeros) {
			System.out.printf("%d ", numero);
		}
		System.out.println();
	}
	
	private static void mostrarNumerosOrdenInverso(int[] numeros) {
		// En orden inverso tenemos que utilizar un bucle "convencional"
		System.out.println("Orden inverso");
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.printf("%d ", numeros[i]);
		}
		System.out.println();
	}

}
