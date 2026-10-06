package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio35;

import java.util.Scanner;

public class Ejercicio35 {
	/* Realizar un ejemplo de menú, donde podemos escoger las distintas opciones hasta que 
	 * seleccionamos la opción de “Salir”. El menú podría ser algo similar a esto:
	1. Opción A
	2. Opción B
	3. Opción C
	4. Opción D
	9. Salir
	Cuando el usuario elige una opción, el programa mostrará “Se ha elegido A“, o “Se ha elegido B”, etc. Cuando elija la opción “Salir” el programa mostrará “Gracias por usar este menú sin utilidad”.
	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opcion;
		
		do {
			System.out.println("1. Opción A");
			System.out.println("2. Opción B");
			System.out.println("3. Opción C");
			System.out.println("4. Opción D");
			System.out.println("9. Salir");
			opcion = sc.nextLine();
			
			switch(opcion) {
			case "1":
				//Ejecutamos método opcion1();
				System.out.println("Has seleccionado la opción A.");
				break;
			case "2":
				//Ejecutamos método opcion2();
				System.out.println("Has seleccionado la opción B.");
				break;
			case "3":
				//Ejecutamos método opcion3();
				System.out.println("Has seleccionado la opción C.");
				break;
			case "4":
				//Ejecutamos método opcion4();
				System.out.println("Has seleccionado la opción D.");
				break;
			case "9":
				System.out.println("Hasta pronto!!");
				break;
			default:
				System.out.println("Opción incorrecta");
			}
		}while (!opcion.equals("9"));
	}
}
