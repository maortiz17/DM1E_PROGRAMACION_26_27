package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
	/*
	 * Realiza un programa que pida por teclado el resultado (dato entero) obtenido
	 * al lanzar un dado de seis caras y muestre por pantalla el número en letras
	 * (dato cadena) de la cara opuesta al resultado obtenido. 
	 * ● Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4. 
	 * ● Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se
	 *   mostrará el mensaje: “ERROR: número incorrecto.”.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca resultado de lanzar dado: ");
		int numero = Integer.parseInt(sc.nextLine());

		/*
		switch (numero) {
		case 1:
			System.out.println("SEIS");
			break;
		case 2:
			System.out.println("CINCO");
			break;
		case 3:
			System.out.println("CUATRO");
			break;
		case 4:
			System.out.println("TRES");
			break;
		case 5:
			System.out.println("DOS");
			break;
		case 6:
			System.out.println("UNO");
			break;
		default:
			System.out.println("ERROR: número incorrecto");
		}
		*/
		String caraOpuesta = switch(numero) {
		case 1 -> "SEIS";
		case 2 -> "CINCO";
		case 3 -> "CUATRO";
		case 4 -> "TRES";
		case 5 -> "DOS";
		case 6 -> "UNO";
		default -> "ERROR: número erróneo";
		};
		
		System.out.println(caraOpuesta);
	}
}
