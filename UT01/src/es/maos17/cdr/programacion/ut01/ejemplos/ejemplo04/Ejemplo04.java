package es.maos17.cdr.programacion.ut01.ejemplos.ejemplo04;

public class Ejemplo04 {

	public static void main(String[] args) {
		// Trabajo con ámbitos

		/*
		 * Estas dos variables están declaradas en el ámbito del método main, por lo que
		 * están disponibles en cualquier bloque que se cree dentro
		 */
		int n1 = 1;
		int n2 = 2;

		{
			System.out.println("En el primer subbloque");
			int n3 = 3; // <- Esta variable es local a este bloque
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
		} // <- Aquí la variable n3 es destruida

		System.out.println("Vuelta al principal");
		System.out.println(n1);
		System.out.println(n2);
		// System.out.println(n3); <- Esta variable aquí no existe

		{
			System.out.println("En el segundo subbloque");
			int n3 = 3; // <- Esta variable es local a este bloque. Es distinta a la n3 anterior, que ya
						// no existe
			// int n1 = 1; // <- Error!! Ya existe una variable con este nombre que viene
			// del ámbito superior
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
		}
	}
}
