package es.maos17.cdr.programacion.ut02.ejemplos.ejemplo04;

import java.util.Scanner;

public class Ejemplo04Switch {

	public static void main(String[] args) {

		int diaSemana;

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el día de la semana: ");
		diaSemana = sc.nextInt();

		switch (diaSemana) {
		case 1, 2, 3, 4:
			System.out.println("Otro día en la oficina");
			break;
		case 5:
			System.out.println("Ya es viernes!");
			break;
		case 6:
			System.out.println("Saturday night!!");
			break;
		case 7:
			System.out.println("Relájate que es domingo");
			break;
		default:
			System.out.println("Día incorrecto");
		}

	}

}
