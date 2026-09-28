package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
	/*
	 * Programa que pida los puntos centrales x1, y1, x2, y2 y los radios r1, r2 de
	 * dos circunferencias y las clasifique en uno de estos estados:
	 * 
	 * ● exteriores
	 * ● tangentes exteriores
	 * ● secantes
	 * ● tangentes interiores
	 * ● interiores
	 * ● concéntricas
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Entrada de datos de la primera circunferencia
		System.out.println("--- Circunferencia 1 ---");
		System.out.print("Introduce x1: ");
		double x1 = sc.nextDouble();
		System.out.print("Introduce y1: ");
		double y1 = sc.nextDouble();
		System.out.print("Introduce radio r1: ");
		double r1 = sc.nextDouble();

		// Entrada de datos de la segunda circunferencia
		System.out.println("--- Circunferencia 2 ---");
		System.out.print("Introduce x2: ");
		double x2 = sc.nextDouble();
		System.out.print("Introduce y2: ");
		double y2 = sc.nextDouble();
		System.out.print("Introduce radio r2: ");
		double r2 = sc.nextDouble();

		// Distancia euclídea entre los centros (x1, y1) y (x2, y2)
		double distancia = Math.hypot(x2 - x1, y2 - y1);
		double sumaRadios = r1 + r2;
		double difRadios = Math.abs(r1 - r2);

		// Clasificación de la posición relativa
		if (distancia == 0 && r1 == r2) {
			System.out.println("Las circunferencias son coincidentes (misma circunferencia).");
		} else if (distancia == 0) {
			System.out.println("Las circunferencias son concéntricas.");
		} else if (distancia > sumaRadios) {
			System.out.println("Las circunferencias son exteriores.");
		} else if (distancia == sumaRadios) {
			System.out.println("Las circunferencias son tangentes exteriores.");
		} else if (distancia == difRadios) {
			System.out.println("Las circunferencias son tangentes interiores.");
		} else if (distancia < difRadios) {
			System.out.println("Las circunferencias son interiores.");
		} else {
			// Se cumple: difRadios < distancia < sumaRadios
			System.out.println("Las circunferencias son secantes.");
		}

	}
}
