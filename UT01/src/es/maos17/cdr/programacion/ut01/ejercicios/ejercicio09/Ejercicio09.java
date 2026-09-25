package es.maos17.cdr.programacion.ut01.ejercicios.ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {
	private final static double COMISION = 0.1;

	public static void main(String[] args) {
		/*
		 * Un vendedor recibe un sueldo base más un 10% extra por comisión de sus ventas
		(se incrementa su sueldo en un 10% de la cantidad vendida), el vendedor desea
		saber cuánto dinero obtendrá por concepto de comisiones por las tres ventas que
		realiza en el mes y el total que recibirá en el mes tomando en cuenta su sueldo
		base y comisiones.
		Haz un programa que pida:
		* Sueldo base
		* Ventas (tres ventas)
		Y calcule el sueldo final, aplicando el cálculo anteriormente descrito. Utiliza
		constantes para minimizar el uso de literales.
		 */
		
		Scanner scanner = new Scanner(System.in);

		double sueldoBase;
		double primeraVenta, segundaVenta, terceraVenta;

		System.out.print("Introduce el sueldo base: ");
		sueldoBase = scanner.nextDouble();
		System.out.print("Introduce primera venta: ");
		primeraVenta = scanner.nextDouble();
		System.out.print("Introduce segunda venta: ");
		segundaVenta = scanner.nextDouble();
		System.out.print("Introduce tercera venta: ");
		terceraVenta = scanner.nextDouble();

		double sueldoFinal = sueldoBase + ((primeraVenta + segundaVenta + terceraVenta) * COMISION);
		System.out.printf("El sueldo final es: %.2f\n", sueldoFinal);

	}
}
