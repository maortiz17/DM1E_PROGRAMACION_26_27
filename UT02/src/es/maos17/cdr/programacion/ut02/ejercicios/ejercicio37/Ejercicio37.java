package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio37;

import java.util.Scanner;

public class Ejercicio37 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que: ● Pregunte al usuario una frase, formada por varias
		 * palabras. ● Pregunte al usuario la palabra que quiere buscar en la frase. ●
		 * Localice TODAS las apariciones de la palabra buscada, teniendo en cuenta que
		 * no se deben distinguir mayúsculas y minúsculas. ● Por cada aparición de la
		 * palabra buscada, mostrará la posición en la frase. ● Si la palabra buscada no
		 * aparece ninguna vez, no mostrará nada. ● Antes de salir, mostrará “Fin del
		 * programa”.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca una frase: ");
		String frase = sc.nextLine();

		System.out.print("Introduzca la palabra a buscar: ");
		String palabra = sc.nextLine();

		// Solo iniciamos la búsqueda si la palabra contiene caracteres
		if (!palabra.isEmpty()) {
			String fraseMin = frase.toLowerCase();
			String palabraMin = palabra.toLowerCase();

			int posicion = fraseMin.indexOf(palabraMin);

			while (posicion != -1) {
				System.out.println("Encontrada en posición: " + posicion);
				posicion = fraseMin.indexOf(palabraMin, posicion + 1);
			}
		}

		System.out.println("Fin del programa");
	}

}
