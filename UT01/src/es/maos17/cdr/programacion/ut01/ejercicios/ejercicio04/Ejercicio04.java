package es.maos17.cdr.programacion.ut01.ejercicios.ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {
		/*
		 * Escribir un programa que pregunte al usuario la base y la altura de un
		 * rectángulo y calcule su perímetro y su área.
		 */

		// Declaramos variables
		int base = 0;
		int altura = 0;
		int area = 0;
		int perimetro = 0;

		// Solicitamos información
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce la base: ");
		base = sc.nextInt();
		System.out.print("Introduce la altura: ");
		altura = sc.nextInt();

		// Calculamos datos de salida
		area = base * altura;
		// perimetro = (2 * base) + (2 * altura);
		perimetro = 2 * (base + altura);

		// Generamos salida solicitada
		System.out.printf("El área del rectángulo es: %d\n", area);
		System.out.printf("El perímetro del rectángulo es: %d\n", perimetro);

	}
}
