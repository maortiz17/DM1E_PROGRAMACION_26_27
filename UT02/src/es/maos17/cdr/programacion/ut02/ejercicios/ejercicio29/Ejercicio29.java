package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio29;

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		/* Crea un programa que pida números enteros positivos hasta que se introduzca un cero. 
		 * Debe calcular la suma y la media de todos los números introducidos. 
		 * Si el usuario introduce un número menor que cero, 
		 * debe mostrar un mensaje indicando que no es válido y no tenerlo en cuenta para el cálculo.
		 */
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		long suma = 0;
		int numero;
		
		do {
			System.out.print("Introduzca número entero positivo (0 para terminar): ");
			numero = Integer.parseInt(sc.nextLine());
			if (numero < 0) {
				System.out.println("No se admiten negativos");
			} else if (numero > 0) {
				contador++;
				suma += numero;
			}
			
		}while (numero != 0);
		
		if (contador > 0) {
			System.out.printf("La suma es : %d y la media: %.2f\n", suma, (double)suma/contador);
		} else {
			System.out.println("No se introdujo ningún número.");
		}
	}

}
