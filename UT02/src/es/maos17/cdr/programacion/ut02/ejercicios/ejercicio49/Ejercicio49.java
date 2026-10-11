package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio49;

public class Ejercicio49 {
	/*
	 * Ya hay métodos en la API de Java para hacer lo que hace el método del ejercicio
	 * 48. Y mejor, porque funciona con números negativos. Busca dos formas de hacer lo
	 * mismo, usando métodos de la API de Java, y comprueba si el resultado es el
	 * mismo.
	 */

	public static void main(String[] args) {
		// En la clase envoltorio Integer existen dos formas 
		// estándar de obtener la representación binaria
		
		// Integer.toBinaryString(int i): Diseñado específicamente para convertir un 
		// entero a su representación binaria como String en formato sin signo 
		// (en complemento a dos para negativos)
		System.out.println(Integer.toBinaryString(131));
		
		// Integer.toString(int i, int radix): Permite convertir un entero a 
		// cadena especificando la base deseada (en este caso, base 2)
		System.out.println(Integer.toString(131, 2));
	}

}
