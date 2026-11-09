package es.maos17.cdr.programacion.ut04.ejercicios.strings.ejercicio03;

public class Ejercicio03 {

	public static void main(String[] args) {
		System.out.println(invertirCadena("murciélago"));
	}

	/**
	 * Invierte una cadena de caracteres. Para hacerlo usa sólo objetos y métodos de
	 * la clase String
	 * 
	 * @param cadenaOriginal cadena que deseamos invertir
	 * @return la cadena invertida. Null si cadenaOriginal es null.
	 */
	private static String invertirCadena(String cadena) {
		if (cadena == null) {
			return null;
		}
		
		String cadenaInvertida = "";
		
		for (int i = cadena.length() - 1; i >= 0; i--) {
			cadenaInvertida += cadena.charAt(i);
		}
		
		return cadenaInvertida;
	}
}
