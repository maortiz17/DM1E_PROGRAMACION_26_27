package es.maos17.cdr.programacion.ut01.ejercicios.ejercicio20;

public class Ejercicio20 {
	/*
	 * Crea un programa en Java que tenga sólo el método main, y en este método
 	 *  - Crea un String “cadenaLarga” y asígnale el valor que quieras, pero que sea una oración con varias palabras.
 	 *  - Usa el método length para obtener la longitud de la cadena, y partiendo de este número obtén la posición central de la cadena. Ojo, como la longitud
		  puede ser impar, usa división entera, porque no podemos usar decimales.
		  Muestra el valor de esta posición en la consola.
 	 *  - Consulta en la API de Java el método substring de la clase String, todas sus sobrecargas.
 	 *  - Usa la sobrecarga del método substring que te parezca más adecuada para obtener la primera mitad de la cadena. Muestra la primera mitad en la consola.
 	 *  - Usa una sobrecarga distinta de este método para obtener la segunda parte de la cadena. Muestra la segunda parte en la consola.
	 */
	
	public static void main(String[] args) {
		String cadena = "Esta es una oración con varias palabras";
		
		int posicionCentro = cadena.length() / 2;
		
		System.out.printf("La posición central es %d\n", posicionCentro);
		
		String cadenaIzquierda = cadena.substring(0, posicionCentro);
		String cadenaDerecha = cadena.substring(posicionCentro);
		
		
		System.out.println("La subcadena de la izquierda es: " + cadenaIzquierda);
		System.out.println("La subcadena de la derecha es: " + cadenaDerecha);
	}
	
}
