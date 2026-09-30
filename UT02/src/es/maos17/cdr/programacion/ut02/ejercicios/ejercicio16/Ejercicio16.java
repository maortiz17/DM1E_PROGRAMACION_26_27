package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número de 1 a 7: ");
		int dia = sc.nextInt();

		String diaEnLetra = switch (dia) {
		case 1 -> "LUNES";
		case 2 -> "MARTES";
		case 3 -> "MIÉRCOLES";
		case 4 -> "JUEVES";
		case 5 -> "VIERNES";
		case 6 -> "SÁBADO";
		case 7 -> "DOMINGO";
		default -> "DÍA INCORRECTO";
		};

		System.out.println(diaEnLetra);
	}
}