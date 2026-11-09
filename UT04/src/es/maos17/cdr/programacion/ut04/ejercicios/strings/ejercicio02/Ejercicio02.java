package es.maos17.cdr.programacion.ut04.ejercicios.strings.ejercicio02;

public class Ejercicio02 {
	public static void main(String[] args) {
		
		System.out.println(insertarGuionesCadena2("101 Dálmatas"));

	}
	
	private static String insertarGuionesCadena2(String cadena) {
		if (cadena == null)
			return null;
		char[] caracteresOriginal = cadena.toCharArray();
		char[] caracteresModificado = new char[caracteresOriginal.length * 2 - 1];
		for (int i = 0; i < cadena.length(); i++) {
			caracteresModificado[i * 2] = caracteresOriginal[i];
			if (i != (cadena.length() - 1))
				caracteresModificado[i * 2 + 1] = '-';
		}
		
		return new String(caracteresModificado);
	}
	
}
