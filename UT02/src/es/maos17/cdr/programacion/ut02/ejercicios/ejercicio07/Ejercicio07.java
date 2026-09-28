package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {
	/*
	 * Crea un programa que pida dos números ‘nota’ y ‘edad’ y un carácter ‘sexo’ y
	 * muestre el mensaje ‘ACEPTADA’ si la nota es mayor o igual a cinco, la edad es
	 * mayor o igual a dieciocho y el sexo es ‘F’. En caso de que se cumpla lo
	 * mismo, pero el sexo sea ‘M’, debe imprimir ‘POSIBLE’. Si no se cumplen dichas
	 * condiciones se debe mostrar ‘NO ACEPTADA’
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduzca nota: ");
		int nota = Integer.parseInt(scanner.nextLine());
		System.out.print("Introduzca edad: ");
		int edad = Integer.parseInt(scanner.nextLine());
		System.out.print("Introduzca sexo: ");
		char sexo = scanner.nextLine().toUpperCase().charAt(0);

		if (nota >= 5 && edad >= 18) {
			if (sexo == 'F') {
				System.out.println("ACEPTADA");
			} else if (sexo == 'M') {
				System.out.println("POSIBLE");
			} else {
				System.out.println("NO ACEPTADA");
			}
		} else {
			System.out.println("NO ACEPTADA");
		}
	}
}
