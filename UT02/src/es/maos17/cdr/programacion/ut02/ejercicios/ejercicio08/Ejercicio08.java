package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {
	/*
	 * Escribe un programa que pida tres números y los muestre ordenados (de mayor a menor);
	 */

	public static void main(String[] args) {
		int numero1, numero2, numero3;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca el primer número: ");
		numero1 = sc.nextInt();
		System.out.print("Introduzca el segundo número: ");
		numero2 = sc.nextInt();
		System.out.print("Introduzca el tercer número: ");
		numero3 = sc.nextInt();

		if (numero1 >= numero2 && numero2 >= numero3) {
			System.out.println(numero1 + " >= " + numero2 + " >= " + numero3);
		} else if (numero1 >= numero3 && numero3 >= numero2) {
			System.out.println(numero1 + " >= " + numero3 + " >= " + numero2);
		} else if (numero2 >= numero1 && numero1 >= numero3) {
			System.out.println(numero2 + " >= " + numero1 + " >= " + numero3);
		} else if (numero2 >= numero3 && numero3 >= numero1) {
			System.out.println(numero2 + " >= " + numero3 + " >= " + numero1);
		} else if (numero3 >= numero1 && numero1 >= numero2) {
			System.out.println(numero3 + " >= " + numero1 + " >= " + numero2);
		} else {
			System.out.println(numero3 + " >= " + numero2 + " >= " + numero1);
		}
	
	}

}