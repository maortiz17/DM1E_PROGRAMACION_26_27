package es.maos17.cdr.programacion.ut01.ejercicios.ejercicio01;

public class Ejercicio01 {
	public static void main(String[] args) {
		int numeroEntero = 12;
		double numeroDecimal = 423.323;
		String nombre = "Miguel";
		boolean esEstudiante = false;

		double resultado = numeroEntero * numeroDecimal;

		System.out.println("Valor de numeroEntero: " + numeroEntero);

		System.out.println("Valores de dos numeros: " + (4 + 7));

		System.out.println("Valor de numeroDecimal: " + numeroDecimal);
		
		System.out.println("Hola " + nombre);

		System.out.println("Valor de esEstudiante: " + esEstudiante);

		/*
		 * Utiliza el operador ternario para determinar el mayor de dos números enteros.
		 * Si son iguales hay que indicarlo.
		 */
		int num1 = 100;
		int num2 = 15;
		System.out.println(num1 > num2 ? num1 + " es mayor que " + num2
				: num1 == num2 ? "Son iguales" : num2 + " es mayor que " + num1);

		/*
		 * Partimos de tres números enteros que asumimos que son diferentes. Indicar el
		 * mayor de los tres.
		 */
		int num3 = 500;
		System.out.println(num1 > num2 && num1 > num3 ? num1 + " es el mayor"
				: num2 > num3 ? num2 + " es el mayor" : num3 + " es el mayor");

		/*
		 * El precio del abono transporte es 30€. Tiene un descuento del 50% para
		 * menores de 18 años y para mayores de 65 y para miembros de una famila
		 * numerosa. Calcula su precio en función de un entero con la edad y un boolean
		 * para familias numerosas
		 */
		final int PRECIO_OFICIAL = 30;
		int edad = 65;
		boolean esNumerosa = false;
		double precio = (edad < 18 || edad >= 65 || esNumerosa ? PRECIO_OFICIAL * 0.5 : PRECIO_OFICIAL);
		System.out.println("Tu abono cuesta " + precio);
	}
}
