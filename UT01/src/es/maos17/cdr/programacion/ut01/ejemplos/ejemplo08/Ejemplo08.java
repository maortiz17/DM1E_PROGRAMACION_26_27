package es.maos17.cdr.programacion.ut01.ejemplos.ejemplo08;

public class Ejemplo08 {

	public static void main(String[] args) {// Conversiones de tipos

		/*
		 * Este es un comentario multilínea esto también es un comentario
		 */

		long l = 1_000_000_000_000_000_000L;
		int i = (int) l; // <- la conversión de long a int exige un cast. En este caso no cabe y se
							// desborda el int (obtengo valor erróneo)
		System.out.println(i);

		double d = 5.6;
		i = (int) d; // <- La conversión de un real a un entero trunca la parte decimal del número
		System.out.println(i);

		// No se puede asignar directamente un String a un tipo numérico, por lo que no
		// compilará (ni siquiera con un cast)
		// int numero = "1500"; <- Esto no funciona
		// int numero = (int)"500"; <- Esto no funciona

		/*
		 * Para un String a un tipo numérico utilizamos el método parse de la clase
		 * wrapper correspondiente Repasa la API de Java (tienes un enlace en los
		 * apuntes
		 */

		int numeroInt = Integer.parseInt("1500");
		double numeroDouble = Double.parseDouble("10.55");
		System.out.println("Variable entera: " + numeroInt);
		System.out.println("Variable double: " + numeroDouble);
		/*
		 * numeroInt = Integer.parseInt("Hola"); <- OJO. Si el String no contiene un
		 * número válido se lanza error runtime. Hay que controlar esta posibilidad
		 */

		// String cadenaNumero = (String)numeroInt; <- Tampoco podemos convertir un
		// número en String directamente
		/*
		 * Para ello contamos con el método valueOf (sobrecargado) en la clase String.
		 * Revisa la documentación oficial
		 */
		String cadenaNumero = String.valueOf(numeroInt);
		System.out.println(cadenaNumero);
		long largo = 1000;
		String cadenaNumLargo = String.valueOf(largo);
		System.out.println(cadenaNumLargo);

	}

}
