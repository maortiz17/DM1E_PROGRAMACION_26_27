package es.maos17.cdr.programacion.ut02.ejemplos.ejemplo01;

import java.util.Scanner;

public class Ejemplo01If {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número entero: ");
		numero = sc.nextInt();

		// Ejemplo de estructura condicional simple: if sin alternativas
		if (numero == 7) {
			// Solo entra aquí si el número es 7
			System.out.println("Has acertado el número");
		}
		// Fuera del condicional. Se ejecuta siempre
		System.out.println("Fin del programa");

	}

}
