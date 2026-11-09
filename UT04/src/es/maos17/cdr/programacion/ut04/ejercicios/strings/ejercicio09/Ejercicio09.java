package es.maos17.cdr.programacion.ut04.ejercicios.strings.ejercicio09;

public class Ejercicio09 {

	public static void main(String[] args) {

		System.out.println(insertarGuionesCadena3("101 Dálmatas"));

	}

	private static String insertarGuionesCadena3(String cadena) {
		if (cadena == null)
			return null;
		StringBuilder sb = new StringBuilder(cadena);
		for (int i = sb.length() - 1; i > 0; i--)
			sb.insert(i, "-");
		
		return (sb.toString());
	}
}
