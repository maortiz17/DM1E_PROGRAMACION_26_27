package es.maos17.cdr.programacion.ut04.ejercicios.strings.ejercicio10;

public class Ejercicio10 {

	public static void main(String[] args) {
		System.out.println(invertirCadena3("murciélago"));
	}
	
	/**
	 * Invierte una cadena de caracteres. Para hacerlo usa un objeto StringBuilder.
	 * 
	 * @param cadenaOriginal cadena que deseamos invertir
	 * @return la cadena invertida. Null si cadenaOriginal es null.
	 */
	public static String invertirCadena3(String cadenaOriginal) {
		if (cadenaOriginal == null)
			return null;

		StringBuilder sb = new StringBuilder(cadenaOriginal);
		sb.reverse();
		return sb.toString();
	}

}
