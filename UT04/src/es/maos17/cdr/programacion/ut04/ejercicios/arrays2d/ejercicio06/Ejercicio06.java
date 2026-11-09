package es.maos17.cdr.programacion.ut04.ejercicios.arrays2d.ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Cine cine = inicializarSala(scanner);

		int opcion;
		do {
			mostrarOpciones();
			opcion = leerEntero("Introduzca una opción: ", 1, 4, scanner);
			switch (opcion) {
			case 1:
				verSala(cine);
				break;
			case 2:
				venderEntradas(cine, scanner);
				break;
			case 3:
				cambiarPelicula(cine, scanner);
				break;
			case 4:
				System.out.println("Hasta pronto");
				break;
			default:
				System.out.println("Opción no válida");
			}
		} while (opcion != 4);
	}

	private static Cine inicializarSala(Scanner scanner) {
		int filas = leerEntero("Introduzca el número de filas: ", 1, Integer.MAX_VALUE, scanner);

		int butacasXFila = leerEntero("Introduzca el número de butacas por fila: ", 1, Integer.MAX_VALUE, scanner);

		System.out.print("Introduzca el nombre de la película: ");
		String pelicula = scanner.nextLine();

		System.out.print("Introduzca el precio de la entrada: ");
		double precio = Double.parseDouble(scanner.nextLine());

		return new Cine(filas, butacasXFila, pelicula, precio);
	}

	private static void mostrarOpciones() {
		System.out.println("\n== MENÚ DE OPCIONES ==");
		System.out.println("======================");
		System.out.println("1. Ver sala");
		System.out.println("2. Vender entradas");
		System.out.println("3. Cambiar película");
		System.out.println("4. Salir");
	}

	private static void verSala(Cine cine) {
		System.out.printf("----PANTALLA---- Película: %s\n", cine.getPelicula());
		Butaca[][] butacas = cine.getButacas();
		for (int i = 0; i < butacas.length; i++) {
			System.out.printf("Fila %02d: ", i + 1);
			for (int j = 0; j < butacas[i].length; j++) {
				switch (butacas[i][j]) {
				case LIBRE:
					System.out.print("[L]");
					break;
				case OCUPADO:
					System.out.print("[O]");
					break;
				}
			}
			System.out.println();
		}
	}

	private static void venderEntradas(Cine cine, Scanner scanner) {
		int entradasDisponibles = cine.getButacasDisponibles(1, 1);
		System.out.printf("Quedan %d disponibles: \n", entradasDisponibles);
		int numEntradas = leerEntero("Número de entradas deseadas: ", 1, entradasDisponibles, scanner);

		int filaInicial = leerEntero("Fila inicial deseada: ", 1, cine.getButacas().length, scanner);
		int butacaInicial = leerEntero("Butaca inicial deseada: ", 1, cine.getButacas()[filaInicial - 1].length,
				scanner);
		double precio = cine.venderEntradas(filaInicial, butacaInicial, numEntradas);

		if (precio == 0) {
			System.out.println("No hay suficientes butacas desde la solicitada");
		} else {
			System.out.printf("\nImporte a abonar: %.2f€\n", precio);
		}
	}

	private static void cambiarPelicula(Cine cine, Scanner scanner) {
		System.out.print("Introduzca la nueva película: ");
		String pelicula = scanner.nextLine();
		System.out.printf("Película modificada y sala inicializada. Películas emitidas: %d\n",
				cine.setPelicula(pelicula));
	}

	private static int leerEntero(String mensaje, int min, int max, Scanner scanner) {
		int numero;
		do {
			System.out.print(mensaje);
			numero = Integer.parseInt(scanner.nextLine());
			if (numero < min || numero > max) {
				System.out.printf("El valor debe estar entre %d y %d\n", min, max);
			}
		} while (numero < min || numero > max);
		return numero;
	}
}
