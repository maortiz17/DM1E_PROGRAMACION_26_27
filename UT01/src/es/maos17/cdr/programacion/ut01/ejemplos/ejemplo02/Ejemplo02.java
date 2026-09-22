package es.maos17.cdr.programacion.ut01.ejemplos.ejemplo02;

public class Ejemplo02 {
	public static void main(String[] args) {
		// Aquí va el código de mi programa (la ejecución comienza en el método main)

		int numeroEntero = 0;

		numeroEntero = 20;

		System.out.println(numeroEntero);

		// numeroEntero = 20L; <- No puedo guardar un long en un int
		numeroEntero = (int) 20L; // Con un cast sí puedo
		System.out.println(numeroEntero);
		numeroEntero = (int) 1000000000000000L; // OJO con las pérdidas de información
		System.out.println(numeroEntero);

		// float numeroComaFlotante = 20.1; <- Por defecto el número el double.
		float numeroComaFlotante = 20.1F; // Forzamos que el literal sea de tipo float
		numeroComaFlotante = (float) 20.1; // La forma anterior es más natural y eficiente.

		numeroEntero = (int) 20.99;
		System.out.println(numeroEntero); // De nuevo hay pérdida de información con la conversión

		// Tipos por defecto
		System.out.println(5 / 2); // <- El resultado se trata como int luego no hay decimales
		System.out.println(5F / 2F); // <- El resultado se trata como float
		System.out.println(5.0 / 2); // <- El resultado se trata como double
		System.out.println(5 / 2.0); // <- El resultado se trata como double
	}
}
