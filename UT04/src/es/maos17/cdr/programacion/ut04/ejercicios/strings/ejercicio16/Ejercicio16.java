package es.maos17.cdr.programacion.ut04.ejercicios.strings.ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

	private static final int NUMERO_MAX_MENSAJES = 10;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Mensaje[] tablon = new Mensaje[NUMERO_MAX_MENSAJES];

		int opcion;
		do {
			mostrarMenu();
			opcion = leerEntero(sc, "Seleccione una opción: ");

			switch (opcion) {
			case 1:
				mostrarTablon(tablon);
				break;
			case 2:
				anadirMensaje(tablon, sc);
				break;
			case 3:
				descifrarMensaje(tablon, sc);
				break;
			case 4:
				System.out.println("Destruyendo mensajes...");
				break;
			default:
				System.out.println("Opción no válida");
			}
		} while (opcion != 4);
		sc.close();
	}

	// Método auxiliar para leer números enteros
	public static int leerEntero(Scanner sc, String mensaje) {
		System.out.print(mensaje);
		return Integer.parseInt(sc.nextLine());

	}

	public static void mostrarMenu() {
		System.out.println("\n1. Revisar tablón\n2. Añadir mensaje\n3. Leer Mensaje\n4. Salir");
	}
	
	private static void mostrarTablon(Mensaje[] tablon) {
		if (tablon != null) {
			for (int i = 0; i < tablon.length; i++) {
				if (tablon[i] != null) {
					System.out.printf("%d. %s\n", i + 1,  tablon[i]);
				} else {
					System.out.printf("%d. Hueco vacío\n", i + 1);
				}
			}
		}
	}

	public static Mensaje crearMensaje(Scanner sc) {
		System.out.print("Mensaje secreto: ");
		String texto = sc.nextLine();
		System.out.print("Remitente: ");
		String rem = sc.nextLine();
		int codigo = leerEntero(sc, "Código numérico de cifrado: ");

		return new Mensaje(texto, rem, codigo);
	}
	
	public static void anadirMensaje(Mensaje[] tablon, Scanner sc) {
		Mensaje nuevoMensaje = crearMensaje(sc);
		
        // Buscamos el primer hueco null
        for (int i = 0; i < tablon.length; i++) {
            if (tablon[i] == null) {
                tablon[i] = nuevoMensaje;
                return; // Trabajo hecho, salimos
            }
        }

        // Si llegamos aquí, NO había huecos (array lleno).
        // Toca desplazar todo a la izquierda para borrar el más antiguo (FIFO)
        desplazarYAnadir(tablon, nuevoMensaje);
    }
	
	private static void desplazarYAnadir(Mensaje[] tablon, Mensaje nuevo) {
        // Desplazamos: El 1 pasa al 0, el 2 al 1...
        for (int i = 0; i < tablon.length - 1; i++) {
            tablon[i] = tablon[i + 1];
        }
        // El último hueco queda libre para el nuevo
        tablon[tablon.length - 1] = nuevo;
    }


	public static void descifrarMensaje(Mensaje[] tablon, Scanner sc) {
		int idx = leerEntero(sc, "¿Qué número de mensaje quieres leer?: ");
		if (idx < 1 || idx > tablon.length) {
	        System.out.println("Índice fuera de rango. Debe ser entre 1 y " + tablon.length + ".");
	        return;
	    }

	    Mensaje m = tablon[idx - 1];

		if (m != null) {
			int pass = leerEntero(sc, "Introduce el código para descifrar: ");
			System.out.println("\n-----------------------------------");
			System.out.println(m.descifrar(pass));
			System.out.println("-----------------------------------");
		} else {
			System.out.println("Mensaje no encontrado.");
		}
	}
}