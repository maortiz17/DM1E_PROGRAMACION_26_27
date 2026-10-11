package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio51;

import java.util.Scanner;

public class Ejercicio51 {
	/*
	 * Crea un método “pedirNumero” que:
	 *   ● Recibe cuatro parámetros:
	 *     ○ Un objeto Scanner, para poder interactuar con el usuario.
	 *     ○ Un mensaje, que será la pregunta que se hará al usuario cada vez que tenga
	 *       que introducir el número.
	 *     ○ Un entero, límite inferior inclusivo.
	 *     ○ Un entero, límite superior exclusivo.
	 *   ● Devuelve un número entero, que siempre estará entre el límite inferior (incluido) y el
	 *     límite superior (excluido).
	 * Este método realizará el siguiente proceso:
	 *   ● Si los valores de los límites no son correctos (está mal si el inferior es mayor o igual
	 *     al superior), muestra un mensaje de error y devuelve cero.
	 *   ● Pedirá al usuario, usando el mensaje que ha recibido como parámetro, que
	 *     introduzca un número.
	 *   ● Si el número no está entre el límite inferior (incluido) y el exterior (excluido), mostrará
	 *     un mensaje de error del tipo “El número introducido no está entre xxx (incluido) y zzz
	 *     (excluido), y volverá a preguntar, hasta que el usuario introduzca le valor correcto.
	 *   ● Devolverá el valor correcto introducido por el usuario.
	 *     Haz un pequeño programa principal con pruebas para el caso en que los límites
	 *     sean incorrectos y para el caso en que sean correctos.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		numero = pedirNumero(sc, "Introduzca primer número: ", 5, 4);
		System.out.println(numero);
		
		numero = pedirNumero(sc, "Introduzca segundo número: ", 5, 5);
		System.out.println(numero);
		
		numero = pedirNumero(sc, "Introduzca tercer número: ", 5, 6);
		System.out.println(numero);
		
		numero = pedirNumero(sc, "Introduzca cuarto número: ", 1, 10);
		System.out.println(numero);
	}
	
	private static int pedirNumero(Scanner sc, String mensaje, int infInclusivo, int supExclusivo) {
		int numero = 0;
		if (infInclusivo >= supExclusivo) {
			System.out.println("El límite inferior debe ser menor al superior");
			return numero;
		}
		
		
		/* do {
			System.out.print(mensaje);
			numero = Integer.parseInt(sc.nextLine());
		
			if (numero < infInclusivo || numero >= supExclusivo) {
				System.out.printf("El número introducido no está entre %d (incluido) y %d (excluido)\n", infInclusivo, supExclusivo);
			}
		}while (numero < infInclusivo || numero >= supExclusivo);
		
		return numero;
		*/
		while (true) {
			System.out.print(mensaje);
			numero = Integer.parseInt(sc.nextLine());
			
			if (numero >= infInclusivo && numero < supExclusivo) {
				return numero;
			}
			System.out.printf("El número introducido no está entre %d (incluido) y %d (excluido)\n", infInclusivo, supExclusivo);
			
		}
	}

}
