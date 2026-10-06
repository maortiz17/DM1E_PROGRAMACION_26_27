package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio31;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio31 {
	private static final int NUMERO_MAXIMO = 99;
	private static final int INTENTOS_MAX  = 10;

	public static void main(String[] args) {
		/*Crea una aplicación que permita adivinar un número. 
		 * La aplicación genera un número aleatorio del 1 al 99. 
		 * A continuación, 
		 * va pidiendo números y va respondiendo 
		 * si el número a adivinar es mayor o menor que el introducido, 
		 * además de informarle de los intentos que le quedan 
		 * (tiene 10 intentos para acertarlo). 
		 * El programa termina cuando se acierta el número 
		 * (además te dice en cuantos intentos lo has acertado), 
		 * si se llega al límite de intentos te muestra el número que había generado.
		 */
		
		Random rnd = new Random(); // Este objeto tiene métodos para generar números aleatorios
		Scanner sc = new Scanner(System.in);
		boolean esCorrecto = false; // Testigo que se activa si se acierta el número
		int intentos = 0;
		
		// El método genera un número entre cero (incluido) y NUMERO_MAXIMO (excluido)
		// Como en nuestro caso es entre 1 y NUMERO_MAXIMO sumamos 1 
		int numeroAleatorio = rnd.nextInt(NUMERO_MAXIMO) + 1;
		
		do {
			System.out.printf("Te quedan %d intentos.\n", (INTENTOS_MAX - intentos));
			System.out.print("Introduzca entero (1-99); ");
			int entero = Integer.parseInt(sc.nextLine());
			intentos++;
			if (entero == numeroAleatorio) {
				esCorrecto = true;
			} else if (intentos < INTENTOS_MAX){
				if (numeroAleatorio < entero) {
					System.out.println("El número buscado es menor");
				} else {
					System.out.println("El número buscado es mayor");
				}
			}
		} while (!esCorrecto && intentos < INTENTOS_MAX);
		
		if (esCorrecto) { // Mensajes finales
			System.out.printf("Enhorabuena!! Lo adivinaste en %d intentos.\n", intentos);
		} else {
			System.out.printf("Lo siento. El número buscado era: %d\n", numeroAleatorio);
		}
	}

}
