package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio45A;

import java.util.Scanner;

public class Ejercicio45 {
	/*
	 * Crea un método “factorial” que reciba un número entero (n) y devuelva su factorial
	 * (n!). El método recibirá un int pero devolverá un long, porque los factoriales pueden
	 * ser números muy grandes.
	 * El factorial sólo se puede calcular para números negativos, y se define como la
	 * multiplicación de un número por todos los que son inferiores a él, excepto el cero.
	 * 3! = 3x2x1 = 6 5! = 5x4x3x2x1 = 120 10! = 10x9x…x2x1 = 3628800
	 * El factorial de cero es 1.
	 */

	public static void main(String[] args) {
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		numero = sc.nextInt();
		
		System.out.printf("El factorial de %d es %d", numero, factorial(numero));
	}

	private static long factorial(int numero) {
		long factorial = 1;
		
		for (int i = numero; i > 1; i--) {
			factorial *= i;
		}
		
		return factorial;
	}
}
