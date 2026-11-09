package es.maos17.cdr.programacion.ut04.ejercicios.strings.ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		String[] cadenas = { "cactus", null, "arenera", "Yo hago yoga hoy" };

		for (String cadena : cadenas) {
			System.out.printf("\"%s\" %ses un palíndromo.\n", cadena, esPalindromo2(cadena) ? "" : "no ");
		}

	}

	private static boolean esPalindromo2(String cadena) {
		if (cadena == null) {
			return false;
		}
		cadena = cadena.toLowerCase().replace(" ", "");
		return new StringBuilder(cadena).reverse().toString().equals(cadena);

	}

}
