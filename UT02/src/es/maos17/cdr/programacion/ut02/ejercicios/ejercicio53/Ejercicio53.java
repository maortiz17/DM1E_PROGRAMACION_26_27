package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio53;

import java.util.Scanner;

public class Ejercicio53 {
	private static final int LIMITE_INF_INC = 0;
	private static final int LIMITE_SUP_EXC = 11;
	
	/*
	 * Crea un método “mostrarTablaMultiplicar” que:
	 * ● Recibe un parámetro “número”.
	 * ● No devuelve ningún valor.
	 * Mostrará en la consola la tabla de multiplicar del número (multiplicado del 1 al 10)
	 * Utilizando este método y el método del ejercicio 51, crea un programa principal que:
	 * ● Pida al usuario que introduzca valores entre 0 y 10, ambos incluidos, usando el
	 * método del ejercicio 51.
	 * ● Si el valor es mayor que cero, muestra la tabla de multiplicar (usando el método
	 * previamente descrito) y vuelve a preguntar.
	 * ● Cuando el usuario introduzca un cero, el programa termina
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		do {
			numero = pedirNumero(sc, String.format("Introduce un número de %d a %d: ", LIMITE_INF_INC, LIMITE_SUP_EXC - 1), LIMITE_INF_INC, LIMITE_SUP_EXC);
			if (numero > 0) {
				mostrarTablaMultiplicar(numero);
				System.out.println();
			}
		} while (numero > 0);
		System.out.println("Fin del programa.");
	}
	
	private static void mostrarTablaMultiplicar(int numero) {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %2d = %3d\n", numero, i, numero * i);
		}
	}
	
	private static int pedirNumero(Scanner sc, String mensaje, int infInclusivo, int supExclusivo) {
		int numero = 0;
		if (infInclusivo >= supExclusivo) {
			System.out.println("El límite inferior debe ser menor al superior");
			return numero;
		}
		
		
		while (true) {
			System.out.print(mensaje);
			numero = Integer.parseInt(sc.nextLine());
			
			if (numero >= infInclusivo && numero < supExclusivo) {
				return numero;
			}
			System.out.printf("El número introducido no está entre %d (incluido) y %d (excluido)\n", infInclusivo, supExclusivo);
			
		}
	}
}
