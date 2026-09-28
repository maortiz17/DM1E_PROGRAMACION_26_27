package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio01;

import java.util.Scanner;

/*
 * Escribir un programa que pida dos números e indique si el primero es mayor que el
 * segundo o no.
 */
public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		System.out.print("Introduce un número: ");
		num1 = sc.nextInt();
		System.out.print("Introduce otro número: ");
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("Primer número mayor que el segundo");
		}else {
			System.out.println("Primer número es menor o igual que el segundo");
		}
	}
}