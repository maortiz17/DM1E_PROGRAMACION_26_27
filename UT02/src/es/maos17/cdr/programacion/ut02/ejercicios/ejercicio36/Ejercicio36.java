package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio36;

import java.util.Scanner;

public class Ejercicio36 {
	/*
	 * Escribe un programa que pida el límite inferior y superior de un intervalo
	 * (números enteros). Si el límite inferior es mayor que el superior lo tiene
	 * que volver a pedir, y seguir haciéndolo hasta que el usuario lo haga
	 * correctamente. A continuación, se van introduciendo números enteros hasta que
	 * introduzcamos el 0. Entonces, el programa dará las siguientes informaciones:
	 *    La suma de los números que están dentro del intervalo. Intervalo abierto, no
	 * incluye los límites. 
	 *    Cuántos números están fuera del intervalo. Como el intervalo es abierto, 
	 * los números fuera del intervalo incluyen los límites.
	 * Informa si hemos introducido algún número igual a los límites del intervalo
	 * (sólo si ha habido alguno o no).
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int limiteInferior, limiteSuperior;
		int numero;
		int suma = 0;
		int numerosFuera = 0;
		boolean esLimite = false;

		do {
			System.out.print("Introduce límite inferior: ");
			limiteInferior = sc.nextInt();
			System.out.print("Introduce límite superior: ");
			limiteSuperior = sc.nextInt();
		} while (limiteInferior > limiteSuperior); // Pedimos los límites mientras haya un error de datos

		do {
			System.out.print("Introduzca un número (0 para terminar): ");
			numero = sc.nextInt();
			if (numero > limiteInferior && numero < limiteSuperior) {
				suma += numero;
			} else {
				numerosFuera++;
			}
			if (numero == limiteInferior || numero == limiteSuperior) {
				esLimite = true;
			}
		} while (numero != 0);

		System.out.println("La suma de los límites en el intervalo es " + suma);
		System.out.printf("Has introducido %d números fuera del intervalo\n", numerosFuera);
		System.out.println(
				esLimite ? "Has introducido un valor en el límite" : "No has introducido ningún valor en el límite");
	}

}
