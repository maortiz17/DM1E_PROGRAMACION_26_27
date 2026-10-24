package es.maos17.cdr.programacion.ut03.ejercicios.enumerados.ejercicio3;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Paquete pk1 = new Paquete("ENV-101", "Miguel", 3.2, Destino.PENINSULAR, Modalidad.ESTANDAR);
		Paquete pk2 = solicitarPaquete(sc);
		
		System.out.println("== DATOS DEL PAQUETE 1 ==");
		System.out.println(pk1);
		System.out.println();
		System.out.println("== DATOS DEL PAQUETE 2 ==");
		System.out.println(pk2);
		
		switch(pk1.compararEnvios(pk2)) {
		case 1:
			System.out.println("El paquete 1 es más caro");
			break;
		case -1:
			System.out.println("El paquete 2 es más caro");
			break;
		default:
			System.out.println("Ambos paquetes tienen el mismo coste");
		}
	}
	
	private static Paquete solicitarPaquete(Scanner sc) {
		System.out.print("Código de seguimiento del paquete: ");
		String codSeguimiento = sc.nextLine().trim();
		
		System.out.print("Destinatario del paquete: ");
		String destinatario = sc.nextLine().trim();
		
		System.out.print("Peso del paquete: ");
		double peso = Double.parseDouble(sc.nextLine());
		
		Destino destino = solicitarDestino(sc);
		
		Modalidad modalidad = solicitarModalidad(sc);
		
		return new Paquete(codSeguimiento, destinatario, peso, destino, modalidad);
	}
	
	private static Destino solicitarDestino(Scanner sc) {
		System.out.println("SELECCIÓN DE DESTINO: ");
		System.out.println("1.- LOCAL");
		System.out.println("2.- PROVINCIAL");
		System.out.println("3.- PENINSULAR");
		System.out.println("4.- BALEARES Y CANARIAS");
		switch(solicitarEnteroLimites(sc, 1, 4)) {
		case 1:
			return Destino.LOCAL;
		case 2:
			return Destino.PROVINCIAL;
		case 3:
			return Destino.PENINSULAR;
		default:
			return Destino.BALEARES_CANARIAS;
		}
	}
	
	private static Modalidad solicitarModalidad(Scanner sc) {
		System.out.println("SELECCIÓN DE MODALIDAD: ");
		System.out.println("1.- ESTANDAR");
		System.out.println("2.- EXPRESS");
		switch(solicitarEnteroLimites(sc, 1, 2)) {
		case 1:
			return Modalidad.ESTANDAR;
		default:
			return Modalidad.EXPRESS;
		}
	}
	
	private static int solicitarEnteroLimites(Scanner sc, int min, int max) {
		int entero;
		do {
			System.out.printf("Introduzca un número entero (%d-%d): ", min, max);
			entero = Integer.parseInt(sc.nextLine());
			if (entero >= min && entero <= max) {
				return entero;
			}
			System.out.println("Entero fuera de rango.");
		}while (true);
	}
}
