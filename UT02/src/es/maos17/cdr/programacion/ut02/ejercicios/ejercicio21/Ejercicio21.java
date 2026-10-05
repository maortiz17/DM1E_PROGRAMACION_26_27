package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio21;

public class Ejercicio21 {
	private static final int MINIMO = 10;
	private static final int MAXIMO = 20;
	
	public static void main(String[] args) {
		/* Realiza un programa que use un bucle for y muestre todos 
		 * los números del 10 al 20, sin incluir el 20. Una línea por cada número.
		 */
		for (int num = MINIMO; num < MAXIMO; num++) {
			System.out.println(num);
		}
	}

}
