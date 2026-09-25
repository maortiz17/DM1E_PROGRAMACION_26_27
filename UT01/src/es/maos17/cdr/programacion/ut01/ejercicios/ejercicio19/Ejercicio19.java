package es.maos17.cdr.programacion.ut01.ejercicios.ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		/*
		 * Crea un programa en Java que tenga sólo el método main, y en este método
		 *  - Crea un String “cadena” y asígnale el valor que quieras, pero que sea una oración con varias palabras, y algunas estén repetidas.
		 *  - Crea un String “palabra” con un valor inicial igual a una de las palabras que aparecían repetidas en la primera cadena.
		 *  - Usa el método indexOf de String para buscar la posición de la primera aparición de “palabra” dentro de “cadena”.
		 *  - Busca en la API de Java qué método podemos usar para buscar la posición de la última aparición de “palabra” en “cadena”. Úsalo para buscar
			  esa posición y muéstrala en consola.
		 *  - Busca en cadena la primera (o última, lo que prefieras) aparición de una cadena que no aparezca en “cadena”. 
		 *    Observa lo que devuelve el método y comprueba lo que significa en la API de Java, mirando la referencia del método utilizado.
		 */
		
		// Cadena con varias palabras y repeticiones
        String cadena = "el sol brilla y el viento sopla bajo el cielo azul";

        // Palabra repetida que se va a buscar
        String palabra = "el";

        // Primera aparición de la palabra
        int primeraPosicion = cadena.indexOf(palabra);
        System.out.println("Primera aparición (indexOf): " + primeraPosicion);

        // 4. Última aparición: en la API de Java el método es lastIndexOf()
        int ultimaPosicion = cadena.lastIndexOf(palabra);
        System.out.println("Última aparición (lastIndexOf): " + ultimaPosicion);

        // 5. Búsqueda de un término que no existe en la cadena
        String inexistente = "luna";
        int posicionInexistente = cadena.indexOf(inexistente);
        System.out.println("Posición de palabra que no existe: " + posicionInexistente);
		
		
	}

}
