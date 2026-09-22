package es.maos17.cdr.programacion.ut01.ejemplos.ejemplo07;

public class Ejemplo07 {

	static final int MAYOR_EDAD = 18; // Constante a nivel de clase

	public static void main(String[] args) {
		// Trabajando con operadores
		int a = 1;

		// Operadores unarios
		System.out.println("\nTrabajando con operador incremento");
		System.out.println(a++); // <- Primero accedo a la variable y luego sumo. Escribe 1 pero la variable vale 2
		System.out.println(a); // <- Comprobamos que vale 2
		System.out.println(++a); // <- Primero incremento y luego utilizo. Vale 3 e imprime 3.
		System.out.println(a); // <- El valor no se modifica porque lo hizo antes de imprimirse

		// Operador ternario
		System.out.println("\nTrabajando con operador comparación");
		int tuEdad = 17;
		String mayorDeEdad = (tuEdad >= MAYOR_EDAD) ? "Eres mayor de edad" : "Eres menor de edad";
		System.out.println(mayorDeEdad);

		int num1 = 15;
		int num2 = 10;

		int menor = (num1 <= num2) ? num1 : num2;
		System.out.println("El menor es " + menor);

		// Concatenando Strings
		System.out.println("\n\"Sumando\" Strings");

		System.out.println("Tu edad es " + tuEdad + " años"); // <- Puedo concatenar Strings con otros tipos

		// Realizando comparaciones
		System.out.println("\nHaciendo comparaciones");

		boolean resultado;

		resultado = (num1 < num2);
		System.out.println(resultado);
		resultado = !(num1 < num2);
		System.out.println(resultado);
		num2 = 15;
		resultado = (num1 < num2);
		System.out.println(resultado);
		resultado = (num1 <= num2);
		System.out.println(resultado);
		int precio = 10;
		int ahorros = 12;
		boolean esVerano = false;
		boolean estaLloviendo = false;
		resultado = (ahorros >= precio) && (esVerano || !estaLloviendo);
		System.out.println(resultado ? "Voy al cine" : "Veo Netflix");

		// Problema al operar con reales
		double d1 = 0.1;
		double d2 = 0.2;
		double sumaD = d1 + d2;
		System.out.println(sumaD);
		System.out.println(Math.PI); // <- La clase Math está especializada en cálculos matemáticos
	}

}
