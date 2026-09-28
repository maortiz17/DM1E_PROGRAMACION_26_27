package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio06B;

import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca una letra: ");
		String unaLetra = sc.nextLine();

		if (unaLetra.length() == 1) {
			char letra = unaLetra.charAt(0);
			if (letra >= 'A' && letra <= 'Z') {
				System.out.println("Su letra es correcta!!");
			} else {
				System.out.println("Debe ser mayúscula. Letra incorrecta");
			}
		} else {
			System.out.println("La cadena no tiene una letra");
		}
	}
}
