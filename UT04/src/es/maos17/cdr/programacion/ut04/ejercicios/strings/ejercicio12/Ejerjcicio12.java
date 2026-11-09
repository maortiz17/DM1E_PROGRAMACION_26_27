package es.maos17.cdr.programacion.ut04.ejercicios.strings.ejercicio12;

public class Ejerjcicio12 {
	public static void main(String[] args) {
		String[] cadenas = {"año", "bicicleta"};

		for (String cadena : cadenas) {
			System.out.println(espejo3(cadena));
		}
	}

	public static String espejo2(String original) {
		if (original == null) {
			return null;
		}

		StringBuilder copia = new StringBuilder(original);

		// Eliminar el último y luego invertir
		if (copia.length() > 0) {
			copia.deleteCharAt(copia.length() - 1);
		}
		copia.reverse();

		return original + copia.toString();

	}

	public static String espejo3(String original) {
		StringBuilder copia = new StringBuilder(original.substring(0, original.length() - 1));
		return original + copia.reverse().toString();
	}
}
