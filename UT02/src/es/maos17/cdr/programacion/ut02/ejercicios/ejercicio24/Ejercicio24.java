package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio24;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		/*Repite el programa del problema 23, pero usando un bucle while.*/
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce número inicial: ");
		int inicial = sc.nextInt();

		System.out.print("Introduce número final: ");
		int fin = sc.nextInt();

		if (inicial > fin) {
			System.out.println("ERROR: inicial no puede ser mayor a final");
		} else {
			int contador = inicial; // Podríamos incrementar directamente inicial hasta llegar a fin, pero perderíamos su valor
			while (contador <= fin) {
				System.out.print(contador + " ");
				contador++;
			}
		}

	}

}
