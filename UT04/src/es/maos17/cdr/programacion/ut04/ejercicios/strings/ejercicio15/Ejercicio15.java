package es.maos17.cdr.programacion.ut04.ejercicios.strings.ejercicio15;

public class Ejercicio15 {
	public static void main(String[] args) {

		System.out.println(eliminaCarcteresRepetidos("PermaNentemente"));
	}

	public static String eliminaCarcteresRepetidos(String original) {

		if (original == null) {
			return null;
		}

		StringBuilder sb = new StringBuilder();

		for (char caracter : original.toCharArray()) {
			if (sb.indexOf(String.valueOf(caracter)) == -1) { // Buscamos el carácter en el StringBuilder provisional
				sb.append(caracter);
			}
		}
		return sb.toString();
	}
}
