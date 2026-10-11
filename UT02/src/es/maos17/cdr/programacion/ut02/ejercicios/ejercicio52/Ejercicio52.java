package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio52;

import java.util.Scanner;

public class Ejercicio52 {
	private static final String PREGUNTA = "¿Deseas jugar otra partida? (S/N): ";
	/*
	 * Crea un método “pedirConfirmacion” que:
	 * ● Recibe dos parámetros:
	 *   ○ Un objeto Scanner, para poder interactuar con el usuario.
	 *   ○ Un mensaje, que será la pregunta a la que el usuario tiene que responder “S” o “N”.
	 * ● Devuelve un boolean, true si ha respondido “S” y false si ha respondido “N”
	 * Este método realizará el siguiente proceso:
	 * ● Pedirá al usuario, usando el mensaje que ha recibido como parámetro, que
	 *   responda a la pregunta.
	 * ● Si el usuario responde con cualquier cosa distinta a “S”, “s”, “N” o “n”, mostrará un
	 *   mensaje de error del tipo “El valor introducido no es válido. Sólo puede responder S/N”.
	 * ● Devolverá el valor adecuado en función de lo que haya introducido el usuario.
	 * Haz un pequeño programa principal para poder probar el método.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Has respondido %s\n", pedirConfirmacion(sc, PREGUNTA) ? "sí" : "no");
	}
	
	private static boolean pedirConfirmacion(Scanner sc, String mensaje) {
		while(true) {
			System.out.print(mensaje);
			String respuesta = sc.nextLine().trim();
			if (respuesta.equalsIgnoreCase("S")) {
				return true;
			}
			if (respuesta.equalsIgnoreCase("N")) {
				return false;
			}
			System.out.println("El valor introducido no es válido. Sólo puede responder S/N");
		}
	}
}
