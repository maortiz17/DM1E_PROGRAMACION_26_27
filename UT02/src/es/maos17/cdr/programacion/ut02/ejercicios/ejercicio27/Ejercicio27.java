package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio27;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		/*Realizar un programa que:
		Pregunte al usuario cuántos números vamos a procesar.
		Pida al usuario la cantidad de números que ha introducido en el paso anterior, 
		y para cada número indique si el número es menor que cero, cero o mayor que cero.
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Cuántos números desea procesar?: ");
		int numero = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= numero; i++) {
			System.out.print("Número " + i + ": ");
			int entero = Integer.parseInt(sc.nextLine());
			if (entero < 0) {
				System.out.println("Es negativo");
			} else if (entero == 0) {
				System.out.println("Número cero");
			} else {
				System.out.println("Es positivo");
			}
		}
		
		System.out.println("Fin del programa");
	}

}
