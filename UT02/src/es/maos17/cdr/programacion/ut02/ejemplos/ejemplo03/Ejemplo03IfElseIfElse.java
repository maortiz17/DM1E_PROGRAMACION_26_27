package es.maos17.cdr.programacion.ut02.ejemplos.ejemplo03;

import java.util.Scanner;

public class Ejemplo03IfElseIfElse {
	static final int NUMERO = 7;

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número entero: ");
		numero = sc.nextInt();

		// Ejemplo de estructura condicional compuesta (if-else)
		if (numero == NUMERO) {
			// Solo entra aquí si el número es el de la constante (condición evalúa a true)
			System.out.println("Has acertado el número!!");
		} else if (numero < NUMERO) {
			// Por aquí entra si el buscado es mayor
			System.out.println("El número buscado es mayor");
		} else {
			System.out.println("El número buscado es menor");
		}
		// Fuera del condicional. Se ejecuta siempre
		System.out.println("Fin del programa");

	}

}
