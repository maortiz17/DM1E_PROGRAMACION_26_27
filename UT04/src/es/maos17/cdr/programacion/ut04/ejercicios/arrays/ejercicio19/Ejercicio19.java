package es.maos17.cdr.programacion.ut04.ejercicios.arrays.ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Solicitamos el número de partidos
		System.out.print("¿Cuántos partidos hay esta jornada?: ");
		int numPartidos = Integer.parseInt(sc.nextLine());
		// Creamos el arrays
		Resultado[] resultados = new Resultado[numPartidos];
		
		// Rellenamos el array
		for (int i = 0; i < resultados.length; i++) {
			System.out.print("Introduzca el equipo local: ");
			String local = sc.nextLine();
			System.out.print("Introduzca el equipo visitante: ");
			String visitante = sc.nextLine();
			System.out.print("Introduzca resultado (1-X-2): ");
			char resultado = sc.nextLine().charAt(0);
			resultados[i] = new Resultado(local, visitante, resultado);
		}
		
		mostrarResultados(resultados);
	}
	
	private static void mostrarResultados(Resultado[] resultados) {
		for (Resultado resultado : resultados) {
			System.out.printf("%s - %s - %c\n",  resultado.getLocal(), resultado.getVisitante(), resultado.getResultado());
		}
	}
}
