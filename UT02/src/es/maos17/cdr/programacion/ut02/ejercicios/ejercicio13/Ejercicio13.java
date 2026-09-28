package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
	/*
	 * El director de una escuela está organizando un viaje de estudios, y requiere
	 * determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía
	 * de viajes por el servicio. La forma de cobrar es la siguiente: si son 100
	 * alumnos o más, el costo por cada alumno es de 65 euros; de 50 a 99 alumnos,
	 * el costo es de 70 euros, de 30 a 49, de 95 euros, y si son menos de 30, el
	 * costo de la renta del autobús es de 4000 euros, sin importar el número de
	 * alumnos. Realice un algoritmo que permita determinar el pago a la compañía de
	 * autobuses y lo que debe pagar cada alumno por el viaje.
	 * 
	 */
	private static final double POR_ALUMNO_MAS_100   = 65.0;
	private static final double POR_ALUMNO_50_A_99   = 70.0;
	private static final double POR_ALUMNO_30_A_49   = 95.0;
	private static final double COSTE_TOTAL_MENOS_30 = 4000.0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double costeTotal = 0;
		double costePorAlumno = 0;
		int numAlumnos = 0;
		boolean error = false;
		
		System.out.print("Indique el número de alumnos: ");
		numAlumnos = scanner.nextInt();
		
		if (numAlumnos >= 100) {
			costeTotal = numAlumnos * POR_ALUMNO_MAS_100;
		} else if (numAlumnos >= 50) {
			costeTotal = numAlumnos * POR_ALUMNO_50_A_99;
		} else if (numAlumnos >= 30) {
			costeTotal = numAlumnos * POR_ALUMNO_30_A_49;
		} else if (numAlumnos > 0) {
			costeTotal = COSTE_TOTAL_MENOS_30;
		} else {
			error = true;
		}
		
		if (!error) {
			costePorAlumno = costeTotal / numAlumnos;
			System.out.printf("Abono compañía autobuses : %.2f € (%.2f € por alumno).\n", costeTotal, costePorAlumno);
		} else {
			System.out.println("Número de alumnos incorrecto.");
		}
	}
}
