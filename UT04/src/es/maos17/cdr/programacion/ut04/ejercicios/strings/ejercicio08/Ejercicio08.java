package es.maos17.cdr.programacion.ut04.ejercicios.strings.ejercicio08;

public class Ejercicio08 {

	public static void main(String[] args) {

		String[] cadenas = {"nosotros somos seres luminosos", "cáspita", null};

		for (String cadena : cadenas) {
			System.out.println(invertirPorPalabras(cadena));
		}

	}
	
	private static String invertirPorPalabras(String cadena) {
		if (cadena == null) {
			return null;
		}
		String[] partes = cadena.split(" "); // Este método hace un array de Strings buscando un espacio como separador

		StringBuilder sb = new StringBuilder();
		for (int i = partes.length - 1; i >= 0; i--) {
			sb.append(partes[i]);
			if (i > 0) {
				sb.append(" ");
			}

		}
		return sb.toString();
	}

}
