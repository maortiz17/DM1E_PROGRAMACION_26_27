package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio39;

import java.util.Scanner;

public class Ejercicio39 {
	private static final String VOCALES = "aeiouáéíóúüAEIOUÁÉÍÓÚÜ";
	public static void main(String[] args) {
		/*
		 * Crea un programa que pida una cadena de texto al usuario. El programa creará
		 * otra cadena de texto en el que estarán todas las letras de la cadena
		 * original, excepto las vocales. Se consideran vocales las mismas letras que en
		 * el problema 04-38.
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca una frase: ");
		String frase = sc.nextLine();
		String fraseSinVocales = "";

		// Recorrido de longitud prefijada: el bucle for es la estructura canónica
		for (int i = 0; i < frase.length(); i++) {
			char caracterActual = frase.charAt(i);

			// String.indexOf(int ch) acepta un char; si devuelve != -1, el carácter está en
			// la constante
			if (VOCALES.indexOf(caracterActual) == -1) {
				fraseSinVocales += caracterActual;
			}
		}
		
		System.out.println(fraseSinVocales);
	}

}
