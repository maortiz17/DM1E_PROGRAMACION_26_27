package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio14B;

import java.util.Scanner;

public class Ejercicio14 {

	/*
	 * La política de cobro de una compañía telefónica es: cuando se realiza una
	 * llamada, el cobro es por el tiempo que ésta dura, de tal forma que los
	 * primeros cinco minutos cuestan 1 euro cada minuto, los siguientes tres, 80
	 * céntimos, los siguientes dos minutos, 70 céntimos, y a partir del décimo
	 * minuto, 50 céntimos. Además, se carga un impuesto de 3 % cuando es domingo, y
	 * si es otro día, en turno de mañana, 15 %, y en turno de tarde, 10 %. Realice
	 * un algoritmo para determinar cuánto debe pagar por cada concepto una persona
	 * que realiza una llamada.
	 * 
	 */
	// Constantes con valores globales
	private static final int TRAMO1 = 5;
	private static final int TRAMO2 = 3;
	private static final int TRAMO3 = 2;

	private static final double COSTE_TRAMO1 = 1.0;
	private static final double COSTE_TRAMO2 = 0.8;
	private static final double COSTE_TRAMO3 = 0.7;
	private static final double COSTE_TRAMO4 = 0.5;

	private static final double IMPUESTO_DOMINGO = 1.03; // 3%
	private static final double IMPUESTO_MANIANA = 1.15; // 15%
	private static final double IMPUESTO_TARDE = 1.10; // 10%

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int duracionLlamada = 0;
		int diaSemana = 0;
		char manyanaTarde;

		double precioTramo1 = 0.0;
		double precioTramo2 = 0.0;
		double precioTramo3 = 0.0;
		double precioTramo4 = 0.0;
		double precioFinal = 0.0;
		double subtotal = 0.0;
		double impuesto = 0.0;

		System.out.print("Duración de la llamada: ");
		duracionLlamada = Integer.parseInt(scanner.nextLine());
		System.out.print("Día de la semana (1-7): ");
		diaSemana = Integer.parseInt(scanner.nextLine());

		switch (diaSemana) {
		case 1, 2, 3, 4, 5, 6:
			System.out.print("Mañana/tarde(M/T): ");
			manyanaTarde = scanner.nextLine().toUpperCase().charAt(0);
			if (manyanaTarde == 'M') {
				impuesto = IMPUESTO_MANIANA;
			} else if (manyanaTarde == 'T') {
				impuesto = IMPUESTO_TARDE;
			} else {
				System.out.println("Turno erróneo");
				return;
			}
			break;
		case 7:
			impuesto = IMPUESTO_DOMINGO;
			break;
		default:
			System.out.println("Día de la semana erróneo");
			return;
		}

		if (duracionLlamada <= 0) {
			System.out.println("Duración errónea");
			return;
		} else {
			if (duracionLlamada >= (TRAMO1 + TRAMO2 + TRAMO3)) {
				precioTramo1 = TRAMO1 * COSTE_TRAMO1;
				precioTramo2 = TRAMO2 * COSTE_TRAMO2;
				precioTramo3 = TRAMO3 * COSTE_TRAMO3;
				precioTramo4 = (duracionLlamada - (TRAMO1 + TRAMO2 + TRAMO3)) * COSTE_TRAMO4;
			} else if (duracionLlamada >= (TRAMO1 + TRAMO2)) {
				precioTramo1 = TRAMO1 * COSTE_TRAMO1;
				precioTramo2 = TRAMO2 * COSTE_TRAMO2;
				precioTramo3 = (duracionLlamada - (TRAMO1 + TRAMO2)) * COSTE_TRAMO3;
			} else if (duracionLlamada >= TRAMO1) {
				precioTramo1 = TRAMO1 * COSTE_TRAMO1;
				precioTramo2 = (duracionLlamada - TRAMO1) * COSTE_TRAMO2;
			} else {
				precioTramo1 = duracionLlamada * COSTE_TRAMO1;
			}
		}

		System.out.printf("Coste del tramo 1: %.2f €\n", precioTramo1);
		System.out.printf("Coste del tramo 2: %.2f €\n", precioTramo2);
		System.out.printf("Coste del tramo 3: %.2f €\n", precioTramo3);
		System.out.printf("Coste del tramo 4: %.2f €\n", precioTramo4);
		subtotal = precioTramo1 + precioTramo2 + precioTramo3 + precioTramo4;
		precioFinal = subtotal * impuesto;
		System.out.printf("El coste de la llamada sin impuestos es de %.2f €\n", subtotal);
		System.out.printf("El coste de la llamada con impuestos es de %.2f €\n", precioFinal);
		System.out.printf("Impuestos: %.2f €\n", precioFinal - subtotal);
	}

}
