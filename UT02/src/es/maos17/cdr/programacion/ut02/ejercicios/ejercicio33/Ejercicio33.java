package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio33;

import java.util.Scanner;

public class Ejercicio33 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que diga si un número introducido por teclado es o no primo.
		 * Un número primo es aquel que sólo es divisible entre él mismo y la unidad.
		 * La estrategia más habitual es comprobar si el número es divisible por algún número
		 * menor que él, además de el 1. Para optimizar el algoritmo, basta con probar con los
		 * números desde 2 hasta la raíz cuadrada del número que estamos probando.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca un número: ");
		int numero = Integer.parseInt(sc.nextLine());

		boolean esPrimo = numero > 1;

		if (esPrimo) {
			int raizCuadrada = (int) Math.sqrt(numero);
			System.out.println(raizCuadrada);
			int divisor = 2;

			while (divisor <= raizCuadrada && esPrimo) {
				if (numero % divisor == 0) {
					esPrimo = false;
				}
				divisor++;
			}
		}

		System.out.println(esPrimo ? "Es primo" : "No es primo");
		sc.close();
	}

}