package es.maos17.cdr.programacion.ut04.ejercicios.arrays2d.ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca número de personas: ");
		int numPersonas = Integer.parseInt(sc.nextLine());
		
		String[][] personas = new String[numPersonas][];
		
		for (int i = 0; i < personas.length; i++) {
			System.out.printf("Introduce el número de hijos de la persona %d: ", i + 1);
			personas[i] = obtenerHijos(Integer.parseInt(sc.nextLine()), sc);
		}
		
		mostrarDatos(personas);
	}
	
	private static String[] obtenerHijos(int numHijos, Scanner sc) {
		String[] hijos = new String[numHijos];
		for (int i = 0; i < hijos.length; i++) {
			System.out.printf("Introduce el nombre del hijo %d: ", i + 1);
			hijos[i] = sc.nextLine();
		}
		return hijos;
	}
	
	private static void mostrarDatos(String[][] personas) {
		for (int i = 0; i < personas.length; i++) {
			System.out.printf("\nHijos de la persona %d: \n", i + 1);
			for (String hijo : personas[i]) {
				System.out.printf("\t%s\n", hijo);
			}
		}
	}
}
