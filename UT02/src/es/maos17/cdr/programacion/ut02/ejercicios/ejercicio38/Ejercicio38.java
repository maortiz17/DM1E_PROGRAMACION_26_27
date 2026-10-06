package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio38;

import java.util.Scanner;

public class Ejercicio38 {
	private static final String VOCALES = "aeiouáéíóúüAEIOUÁÉÍÓÚÜ";
	public static void main(String[] args) {
		/*
		 * Escribe un programa que pregunte una frase al usuario. Mostrará cuántas
		 * vocales hay en la frase introducida por el usuario. Se considerarán vocales
		 * las siguientes letras: ● Vocales minúsculas y mayúsculas: a, e, i, o, u, A,
		 * E, I, O, U. ● Vocales minúsculas y mayúsculas con tilde: á, é, í, ó, ú, Á, É,
		 * Í, Ó, Ú. ● La u con diéresis, tanto minúscula como mayúscula: ü, Ü. Aunque
		 * hay varias formas de hacerlo, unas pistas para una de las formas más
		 * flexibles, que permite incorporar ciertos cambios prácticamente sin tocar
		 * código: ● Se puede recorrer la cadena introducida por el usuario con un
		 * bucle, extrayendo caracteres con charAt. ● Se puede crear una constante con
		 * todas las letras que consideramos vocales válidas. ● Se puede usar indexOf en
		 * la constante para saber si un carácter es una vocal válida.
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca una frase: ");
		String frase = sc.nextLine();

		int totalVocales = 0;

		// Recorrido de longitud prefijada: el bucle for es la estructura canónica
		for (int i = 0; i < frase.length(); i++) {
			char caracterActual = frase.charAt(i);

			// String.indexOf(int ch) acepta un char; si devuelve != -1, el carácter está en
			// la constante
			if (VOCALES.indexOf(caracterActual) != -1) {
				totalVocales++;
			}
		}

		System.out.println("La frase contiene " + totalVocales + " vocales.");
	}

}
