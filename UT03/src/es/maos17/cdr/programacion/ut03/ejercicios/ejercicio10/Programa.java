package es.maos17.cdr.programacion.ut03.ejercicios.ejercicio10;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Rectangulo r1 = crearRectangulo(sc);
		System.out.println();
		Rectangulo r2 = crearRectangulo(sc);
		
		System.out.printf("Rectángulo 1. Area: %d. Perímetro: %d\n", r1.getArea(), r1.getPerimetro());
		System.out.printf("Rectángulo 2. Area: %d. Perímetro: %d\n", r2.getArea(), r2.getPerimetro());
		
		System.out.println();
		if (r1.esMasAlto(r2)) {
		    System.out.println("El más alto es: r1");
		} else if (r2.esMasAlto(r1)) {
		    System.out.println("El más alto es: r2");
		} else {
		    System.out.println("Ambos tienen la misma altura");
		}

		if (r1.esMasAncho(r2)) {
		    System.out.println("El más ancho es: r1");
		} else if (r2.esMasAncho(r1)) {
		    System.out.println("El más ancho es: r2");
		} else {
		    System.out.println("Ambos tienen la misma anchura");
		}
		switch(r1.compararArea(r2)) {
		case -1:
			System.out.println("r2 es más grande");
			break;
		case 0: 
			System.out.println("Son iguales");
			break;
		case 1: 
			System.out.println("r1 es más grande");
			break;
		}
	}
	
	private static Rectangulo crearRectangulo(Scanner sc) {
		int base, altura;
		System.out.print("Introduce la base de un rectángulo: ");
		base = Integer.parseInt(sc.nextLine());
		System.out.print("Introduce la altura de un rectángulo: ");
		altura = Integer.parseInt(sc.nextLine());
		
		return new Rectangulo(base, altura);
	}

}
