package es.maos17.cdr.programacion.ut04.ejercicios.arrays.ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Solicitamos el número de partidos
		System.out.print("¿Cuántos partidos hay esta jornada?: ");
		int numPartidos = Integer.parseInt(sc.nextLine());
		// Creamos los arrays
		String[] locales = new String[numPartidos];
		String[] visitantes = new String[numPartidos];
		char[] resultados = new char[numPartidos];
		// Rellenamos los arrays
		for (int i = 0; i < locales.length; i++) {
			System.out.print("Introduzca el equipo local: ");
			locales[i] = sc.nextLine();
			System.out.print("Introduzca el equipo visitante: ");
			visitantes[i] = sc.nextLine();
			System.out.print("Introduzca resultado (1-X-2): ");
			resultados[i] = sc.nextLine().charAt(0);
		}
		
		mostrarResultados(locales, visitantes, resultados);
	}
	
	private static void mostrarResultados(String[] locales, String[] visitantes, char[] resultados) {
		for (int i = 0; i < locales.length; i++) {
			System.out.printf("%s - %s - %c\n",  locales[i], visitantes[i], resultados[i]);
		}
	}

}
