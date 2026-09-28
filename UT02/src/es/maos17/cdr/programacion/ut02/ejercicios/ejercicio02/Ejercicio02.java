package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
	// Algoritmo que pida un número y diga si es positivo, negativo o 0
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese un número: ");
		double numero = sc.nextDouble();

		if (numero > 0) {
			System.out.println("Este número es positivo");
		} else if (numero < 0) {
			System.out.println("Este número es negativo");
		} else {
			System.out.println("Este número es cero");
		}
	}
}
