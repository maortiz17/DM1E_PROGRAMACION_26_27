package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio23;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("Introduce número inicial: ");
		int inicial = sc.nextInt();
		
		System.out.print("Introduce número final: ");
		int fin = sc.nextInt();
		
		if (inicial > fin) {
			System.out.println("ERROR: inicial no puede ser mayor a final");
		} else {
			for (int i = inicial; i <= fin; i++) {
				System.out.print(i + " ");
			}
		}*/
		
		int inicial, fin;
		do {
			System.out.print("Introduce número inicial: ");
			inicial = sc.nextInt();
			
			System.out.print("Introduce número final: ");
			fin = sc.nextInt();
			
			if (inicial > fin) {
				System.out.println("ERROR: inicial no puede ser mayor a final");
			}
		} while (inicial > fin);
		
		for (int i = inicial; i <= fin; i++) {
			if (i < fin){
				System.out.print(i + " ");
			} else {
				System.out.print(i);
			}
		}
	}

}
