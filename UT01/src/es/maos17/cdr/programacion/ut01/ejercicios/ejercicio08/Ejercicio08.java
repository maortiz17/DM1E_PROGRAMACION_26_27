package es.maos17.cdr.programacion.ut01.ejercicios.ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {
	static final int MINUTOS_POR_HORA = 60;
	public static void main(String[] args) {
		/* Realiza un programa que reciba una cantidad de minutos y muestre por pantalla
			a cuántas horas y minutos corresponde. Por ejemplo: 1000 minutos son 16 horas
			y 40 minutos. Utiliza constantes para minimizar el uso de literales.
			Pista: división entera y resto de división entera. */
		
		int minutosTotales = 0;
		int horas = 0;
		int minutos = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce los minutos a convertir: ");
		minutosTotales = sc.nextInt();
		
		horas = minutosTotales / MINUTOS_POR_HORA;
		minutos = minutosTotales % MINUTOS_POR_HORA;
		
		System.out.printf("%d minutos son %d horas y %d minutos", minutosTotales, horas, minutos);
		
	}
}
