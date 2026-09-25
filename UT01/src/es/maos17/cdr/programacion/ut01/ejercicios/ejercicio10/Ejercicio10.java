package es.maos17.cdr.programacion.ut01.ejercicios.ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
	private final static double DESCUENTO = 0.15;

	public static void main(String[] args) {
		/**
		 Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente
		desea saber cuánto deberá pagar finalmente por su compra.
		Crea un programa que ayude al usuaro a realizar el cálculo. Utiliza constantes
		para minimizar el uso de literales
		 */
		
		Scanner scanner = new Scanner(System.in);

		double totalBruto;
		
		System.out.print("Introduzca precio sin descuento: ");
		totalBruto = Double.parseDouble(scanner.nextLine());
		
		double totalNeto = totalBruto * (1 - DESCUENTO);
		System.out.printf("El precio final es: %.2f €\n", totalNeto);

	}

}

