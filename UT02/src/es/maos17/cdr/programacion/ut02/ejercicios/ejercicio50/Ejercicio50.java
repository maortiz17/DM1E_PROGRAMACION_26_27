package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio50;

import java.util.Scanner;

public class Ejercicio50 {
	/*
	 * Crea una aplicación que nos calcule el área de un círculo, cuadrado o un triángulo.
	 * Esta aplicación:
	 * ● Mostrará un menú con cuatro opciones:
	 * ○ 1 – Círculo
	 * ○ 2 – Cuadrado
	 * ○ 3 – Triángulo
	 * ○ 0 – Salir
	 * ● Si se elige 0, el programa terminará.
	 * ● Si se elige 1, el programa pedirá al usuario el radio del círculo, calculará su área y
	 *   mostrará el resultado.
	 * ● Si se elige 2, el programa pedirá al usuario el lado del cuadrado, calculará su área y
	 *   mostrará el resultado.
	 * ● Si se elige 3, el programa pedirá al usuario la base y la altura del triángulo, calculará
	 *   su área y mostrará el resultado.
	 * ● Seguirá preguntando hasta que el usuario introduzca un cero.
	 *   Hay que tener en cuenta que:
	 * ● Deben utilizarse métodos. Como mínimo (pueden crearse más):
	 *   ○ Método para mostrar el menú
	 *   ○ Método para calcular el área de un círculo: A = (R^2)*PI
	 *   ○ Método para calcular el área de un cuadrado: A = L^2;
	 *   ○ Método para calcular el área de un triángulo: A = (BxH)/2
	 */

	public static void main(String[] args) {
		menu();
	}

	private static void menu() {
		int opcion;

		Scanner sc = new Scanner(System.in);
		do {

			mostrarMenu();

			opcion = leerEntero("Introduzca una opción: ", sc);

			switch (opcion) {
			case 1:
				int radio = leerEntero("Introduzca el radio: ", sc);
				System.out.println("El área del círculo es " + areaCirculo(radio));
				break;
			case 2:
				int lado = leerEntero("Introduzca el lado: ", sc);
				System.out.println("El área del cuadrado es " + areaCuadrado(lado));
				break;
			case 3:
				int base = leerEntero("Introduzca la base: ", sc);
				int altura = leerEntero("Introduzca la altura: ", sc);
				System.out.println("El área del triángulo es " + areaTriangulo(base, altura));
				break;
			case 0:
				System.out.println("Fin del programa");
				break;
			default:
				System.out.println("Opción incorrecta");
			}

		} while (opcion != 0);
	}
	
	private static void mostrarMenu() {
		System.out.println("Menú de opciones");
		System.out.println("================");
		System.out.println("1 - Círculo");
		System.out.println("2 - Cuadrado");
		System.out.println("3 - Triángulo");
		System.out.println("0 - Salir");
	}
	
	private static int leerEntero(String mensaje, Scanner sc) {
		System.out.print(mensaje);
		return Integer.parseInt(sc.nextLine());
	}

	private static double areaCirculo(int radio) {
		return Math.PI * Math.pow(radio, 2);
	}

	private static double areaCuadrado(int lado) {
		return lado * lado;
	}

	private static double areaTriangulo(int base, int altura) {
		return (base * altura) / 2.0;
	}

}
