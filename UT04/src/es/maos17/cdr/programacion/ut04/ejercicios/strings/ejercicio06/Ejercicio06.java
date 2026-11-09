package es.maos17.cdr.programacion.ut04.ejercicios.strings.ejercicio06;

public class Ejercicio06 {

	public static void main(String[] args) {
		String[] cadenas = {"año", "bicicleta"};

		for (String cadena : cadenas) {
			System.out.println(espejo(cadena));
		}
	}

	private static String espejo(String cadena) {
		for (int i = cadena.length() - 2; i >= 0; i --) {
			cadena += cadena.charAt(i);
		}
		
		return cadena;
	}
	
	private static String espejo2(String cadena) {
		return cadena + invertirCadena2(cadena.substring(0, cadena.length() - 1));
	}

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
