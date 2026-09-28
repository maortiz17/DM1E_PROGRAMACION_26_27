package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
	/*
	 * Crea un programa que pida al usuario dos números y muestre la división del
	 * primero por el segundo sólo si el segundo no es cero. Si el segundo es cero,
	 * mostrará un mensaje de aviso indicando que no se puede hacer la operación.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introducir dividendo: ");
		double dividendo = sc.nextDouble();
		System.out.print("Introducir divisor: ");
		double divisor = sc.nextDouble();

		if (divisor == 0) {
			System.out.println("Error. No se puede dividir por cero");
		} else {
			double resultado = dividendo / divisor;
			System.out.println("El resultado de la división es " + resultado);
		}
	}
}
