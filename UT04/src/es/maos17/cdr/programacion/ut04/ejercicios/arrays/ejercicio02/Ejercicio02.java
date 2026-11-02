package es.maos17.cdr.programacion.ut04.ejercicios.arrays.ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	private static final int CANTIDAD_NOMBRES = 10;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] nombres = new String[CANTIDAD_NOMBRES];
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.printf("Introduzca nombre número %d: ", i + 1);
			nombres[i] = sc.nextLine();
		}
		
		System.out.println();
		System.out.println("LISTADO DE NOMBRES");
		System.out.println("==================");
		for (int i = 0; i < nombres.length; i++) {
			System.out.printf("%d: %s\n", i + 1, nombres[i]);
		}
	}

}
