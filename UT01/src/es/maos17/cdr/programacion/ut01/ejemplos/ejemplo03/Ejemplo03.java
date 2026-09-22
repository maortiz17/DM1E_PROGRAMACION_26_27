package es.maos17.cdr.programacion.ut01.ejemplos.ejemplo03;

public class Ejemplo03 {

	public static void main(String[] args) {
		char letra = 'a'; // char siempre con comillas simples ''
		//letra = "a"; Error de compilación. Comillas dobles para tipo String
		
		/* String s = "texto") y 
		 * el operador new (String s = new String("texto")) 
		 * en Java está en cómo y dónde se almacena la memoria.
		 * 
		 * En general siempre utilizamos la primera por eficiencia
		 */
		
		String cadena1 = "Hola mundo!!"; // Más aconsejable
		
		String cadena2 = new String("Hola mundo!!"); // Siempre crea un nuevo objeto
		
		System.out.println(cadena1);
		System.out.println(cadena2);
		
		// String letra2 = 'a'; <- String siempre con comillas dobles ""
	}

}
