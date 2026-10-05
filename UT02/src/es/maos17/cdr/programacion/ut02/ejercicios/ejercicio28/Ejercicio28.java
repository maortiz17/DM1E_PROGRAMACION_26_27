package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio28;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		/*
		 * Hacer un programa igual que el del ejercicio 27, 
		 * pero en lugar de mostrar un mensaje por cada número introducido, 
		 * mostrará cuántos números positivos, cuántos negativos y 
		 * cuántos ceros se han introducido.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int positivos = 0;
		int negativos = 0;
		int ceros = 0;

		System.out.print("¿Cuántos números desea procesar?: ");
		int numero = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= numero; i++) {
			System.out.print("Número " + i + ": ");
			int entero = Integer.parseInt(sc.nextLine());
			if (entero < 0) {
				negativos++;
			} else if (entero == 0) {
				ceros++;
			} else {
				positivos++;
			}
		}
		System.out.printf("Has introducido %d positivos, %d negativos y %d ceros.\n", positivos, negativos, ceros);
	}

}
