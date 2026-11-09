package es.maos17.cdr.programacion.ut04.ejercicios.strings.ejercicio04;

public class Ejercicio04 {

	public static void main(String[] args) {
		System.out.println(invertirCadena2("murciélago"));

	}
	
	/**
	 * Invierte una cadena de caracteres. Para hacerlo usa arrays.
	 * 
	 * @param cadenaOriginal cadena que deseamos invertir
	 * @return la cadena invertida. Null si cadenaOriginal es null.
	 */
	private static String invertirCadena2(String cadena) {
		if (cadena == null) {
			return null;
		}
		
		char[] caracteres = cadena.toCharArray();
		int posInicio = 0;
		int posFinal = cadena.length() - 1;
		while (posInicio < posFinal) {
			char aux = caracteres[posInicio];
			caracteres[posInicio] = caracteres[posFinal];
			caracteres[posFinal] = aux;
			
			posInicio++;
			posFinal--;
		}
		
		return String.valueOf(caracteres);
	}

}
