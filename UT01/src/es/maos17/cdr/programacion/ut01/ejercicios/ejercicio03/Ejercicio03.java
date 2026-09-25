package es.maos17.cdr.programacion.ut01.ejercicios.ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		// Escribir un programa que pregunte al usuario su nombre, y luego le salude.

		// Declaramos la variable para el nombre
		String nombre;

		// Solicitamos nombre a través de objeto Scanner
		Scanner sc = new Scanner(System.in);

		System.out.print("Por favor, dime tu nombre: ");
		nombre = sc.nextLine();

		// Escribimos salida
		System.out.println("Hola " + nombre);
	}
}
