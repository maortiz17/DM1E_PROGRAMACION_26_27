package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio30;

public class Ejercicio30 {

	public static void main(String[] args) {
		/* Haz un programa que muestre la tabla de multiplicar de los números 1,2,3,4 y 5.
		 * Hazlo usando un bucle anidado, un bucle dentro de otro. 
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.printf("%dx%d = %d\n", i, j, i*j);
			}
		}
	}

}
