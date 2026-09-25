package es.maos17.cdr.programacion.ut01.ejercicios.ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {
		/*
		 * Escribir un programa que convierta un valor dado en grados Fahrenheit a
		 * grados Celsius. La fórmula para la conversión es: C = (F-32) * 5 / 9 El
		 * programa debe funcionar con temperaturas con decimales. El resultado de la
		 * conversión se mostrará redondeado con dos decimales.
		 */

		double celsius = 0;
		double fahr = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce grados Fahrenheit: ");
		fahr = sc.nextDouble();

		celsius = (fahr - 32) * (5D / 9); //OJO si 5 no es double, la división entera da cero

		System.out.printf("%.2f grados Fahrenheit son %.2f grados Celsius", fahr, celsius);

	}
}
