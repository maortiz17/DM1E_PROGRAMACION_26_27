package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio26;

import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		/*Algoritmo que pida números hasta que se introduzca un cero. 
		 * Debe mostrar cada uno de los números introducidos, hasta que el usuario introduzca el cero, 
		 * a medida que los vaya introduciendo. 
		 * El cero, que es el número con el que el usuario “corta” el programa, no debe mostrarse.
		 */
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		do {
			System.out.print("Introduce un número (0 para terminar): ");
			numero = Integer.parseInt(sc.nextLine());
			if (numero != 0) {
				System.out.println(numero);
			}
		}while (numero != 0);
		
		System.out.println("Fin del programa");
	}

}
