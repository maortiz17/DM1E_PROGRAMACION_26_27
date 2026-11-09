package es.maos17.cdr.programacion.ut04.ejercicios.strings.ejercicio05;

public class Ejercicio05 {

	public static void main(String[] args) {
		String[] cadenas = {"cactus", null, "arenera", "Yo hago yoga hoy"};
		
		for (String cadena : cadenas) {
			System.out.printf("\"%s\" %ses un palíndromo.\n", cadena, esPalindromo(cadena) ? "" : "no ");
		}
	}
	
	private static boolean esPalindromo(String cadena) {

		if (cadena == null) {
			return false;
		}

		String cadenaSinEspacios = quitarEspacios(cadena).toLowerCase();

		for (int izq = 0, dch = cadenaSinEspacios.length() - 1; izq < dch; izq++, dch--) {
			// Extraer los caracteres a la izq y a la dch
			char charIzq = cadenaSinEspacios.charAt(izq);
			char charDch = cadenaSinEspacios.charAt(dch);

			// Comparar si son diferentes
			if (charIzq != charDch) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean esPalindromo2(String cadena) {
		if (cadena == null) {
			return false;
		}

		cadena = quitarEspacios(cadena);
		
		// El método replace de la clase String puede hacer lo mismo
		// cadena = cadena.replace(" ", "");

		return cadena.equalsIgnoreCase(invertirCadena2(cadena));
	}
	
	private static String quitarEspacios(String cadena) {
		String cadenaSinEspacios = "";
		for (int i = 0; i <= cadena.length() - 1; i++) {
			if (!(cadena.charAt(i) == ' ')) {
				cadenaSinEspacios += cadena.charAt(i);
			}
		}
		
		return cadenaSinEspacios;
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
