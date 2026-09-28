package es.maos17.cdr.programacion.ut02.ejemplos.ejemplo02;

import java.util.Scanner;

public class Ejemplo02IfElse {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número entero: ");
		numero = sc.nextInt();

		// Ejemplo de estructura condicional compuesta (if-else)
		if (numero == 7) {
			// Solo entra aquí si el número es 7 (condición evalúa a true)
			System.out.println("Has acertado el número!!");
		} else {
			// Alternativa por defecto. Se ejecuta si la evaluación de la condición
			// resulta ser false
			System.out.println("No has acertado :(");
		}
		// Fuera del condicional. Se ejecuta siempre
		System.out.println("Fin del programa");

	}

}