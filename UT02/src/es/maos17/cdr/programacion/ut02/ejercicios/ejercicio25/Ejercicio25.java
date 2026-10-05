package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio25;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		/* Haz un programa que permita escribir la tabla de multiplicar 
		 * de un número que se pregunte al usuario.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int numero = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%dx%d=%d\n", numero, i, numero * i);
		}
	}

}
