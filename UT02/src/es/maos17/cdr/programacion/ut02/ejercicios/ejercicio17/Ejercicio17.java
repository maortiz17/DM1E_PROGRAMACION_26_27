package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {
	/*Escribe un programa que pida un número entero entre uno y doce (un mes) 
	 * Mostrará:
	 * ● Si el mes no es un número entre 1 y 12 a.i., mostrará un error.
	 * ● El número de días del mes
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduzca número de mes (1-12): ");
		int mes = Integer.parseInt(scanner.nextLine());
		
		String dias = switch(mes) {
			case 1, 3, 5, 7, 8, 10, 12 -> "31";
			case 4, 6, 9, 11 -> "30";
			case 2 -> "28 o 29";
			default -> "Mes erróneo";
		};
		
		System.out.println(dias);
	}
}
