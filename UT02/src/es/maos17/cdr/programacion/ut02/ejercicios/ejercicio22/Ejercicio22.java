package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio22;

public class Ejercicio22 {

	private static final int MINIMO = 10;
	private static final int MAXIMO = 20;
	public static void main(String[] args) {
		/* Realiza un programa que use un bucle while y muestre todos 
		 * los números del 10 al 20, sin incluir el 20. Una línea por cada número.
		 */
		int num = MINIMO;
		
		while (num < MAXIMO) {
			System.out.println(num);
			num++;
		}

	}

}
