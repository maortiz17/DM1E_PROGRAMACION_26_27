package es.maos17.cdr.programacion.ut04.ejercicios.arrays.ejercicio11;

import java.util.Scanner;

import es.maos17.cdr.programacion.ut04.ejercicios.arrays.utilidades.Utilidades;

public class Ejercicio11 {
	private static final int CANTIDAD = 100;
	private static final int MIN = 1000;
	private static final int MAX = 2000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = Utilidades.generarNumeros(CANTIDAD, MIN, MAX);
		
		Utilidades.mostrarNumeros(numeros, " ");
		
		System.out.printf("Introduce un número entre %d y %d ambos incluidos: ", MIN, MAX);
		int numeroBuscado = Integer.parseInt(sc.nextLine());
		
		System.out.printf("El número %d aparece %d veces en los números generados\n", numeroBuscado,
				contarApariciones(numeros, numeroBuscado));
	}
	
	public static int contarApariciones(int[] numeros, int numeroBuscado) {
		int contador = 0;
		for (int numero : numeros) {
			if (numero == numeroBuscado) {
				contador++;
			}
		}
		return contador;
	}
}
