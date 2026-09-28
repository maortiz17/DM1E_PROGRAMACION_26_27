package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
	/*
	 * Escribe un programa que lea un número e indique si es par o impar. El resto
	 * de la división entera de un número entre dos es cero si es par, y uno si es
	 * impar
	 */
	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca un número: ");
		numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}

	}
}
