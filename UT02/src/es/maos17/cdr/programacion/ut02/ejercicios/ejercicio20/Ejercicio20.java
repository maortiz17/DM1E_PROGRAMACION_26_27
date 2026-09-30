package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {
	/*
	 * Escribe un programa en Java que simule una calculadora de operaciones
	 * básicas. El programa debe solicitar al usuario que introduzca dos números y
	 * luego le dará la opción de realizar una de las siguientes operaciones: suma,
	 * resta, multiplicación o división. El usuario debe seleccionar la operación
	 * deseada introduciendo un número del 1 al 4. Luego, el programa debe realizar
	 * la operación seleccionada y mostrar el resultado. Si la operación es ilegal
	 * (división por cero), debe mostrar un mensaje indicando que no se puede
	 * realiza
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca primer operando: ");
		double operando1 = Double.parseDouble(sc.nextLine());
		System.out.print("Introduzca segundo operando: ");
		double operando2 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Seleccione la operación deseada (1-4): ");
		System.out.println("1. Suma.");
		System.out.println("2. Resta.");
		System.out.println("3. Multiplicación.");
		System.out.println("4. División.");
		int opcion = Integer.parseInt(sc.nextLine());
		
		switch (opcion){
		case 1 : // suma
			System.out.printf("%.2f + %.2f = %.2f\n", operando1, operando2, operando1 + operando2);
			break;
		case 2 : // resta
			System.out.printf("%.2f - %.2f = %.2f\n", operando1, operando2, operando1 - operando2);
			break;
		case 3 : // multiplicación 
			System.out.printf("%.2f * %.2f = %.2f\n", operando1, operando2, operando1 * operando2);
			break;
		case 4: // división
			if (operando2 != 0) {
				System.out.printf("%.2f / %.2f = %.2f\n", operando1, operando2, operando1 / operando2);
			} else {
				System.out.println("ERROR: división por cero.");
			}
			break;
		default: 
			System.out.println("Operación inválida.");
		}
	}
}
