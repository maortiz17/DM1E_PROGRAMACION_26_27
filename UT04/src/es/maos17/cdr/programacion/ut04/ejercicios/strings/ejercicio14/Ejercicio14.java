package es.maos17.cdr.programacion.ut04.ejercicios.strings.ejercicio14;

public class Ejercicio14 {
	public static void main(String[] args) {
		System.out.println(buscaYPasaMayusculas("Este es mi amigo Juan", "amigo"));

	}

	public static String buscaYPasaMayusculas(String cadena, String buscada) {
		if (cadena == null) {
			return null;
		}
		if (buscada == null || buscada.isEmpty()) {
			return cadena;
		}

		StringBuilder sb = new StringBuilder(cadena);

		int posicionBuscada = sb.indexOf(buscada);
		while (posicionBuscada >= 0) {
			// Reemplazar los caracteres "originales" en cadena por su equivalente en mayúsculas
			sb.replace(posicionBuscada, posicionBuscada + buscada.length(), buscada.toUpperCase());
			// Otra alternativa es eliminar la buscada e insertarla en mayúsculas
			//sb.delete(posicionBuscada, posicionBuscada + buscada.length());
			//sb.insert(posicionBuscada, buscada.toUpperCase());
			posicionBuscada = sb.indexOf(buscada, posicionBuscada + buscada.length());
		}

		return sb.toString();
	}
}
