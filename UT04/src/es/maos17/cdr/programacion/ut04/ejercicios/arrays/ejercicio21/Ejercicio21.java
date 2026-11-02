package es.maos17.cdr.programacion.ut04.ejercicios.arrays.ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {

    private static final int CAPACIDAD_SALA = 20;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	
    	Paciente[] pacientes = new Paciente[CAPACIDAD_SALA];

        gestionarMenu(pacientes, sc);
        
    }
    
    private static void gestionarMenu(Paciente[] pacientes, Scanner sc) {
        int opcion = 0;
    	do {

    		mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ", 1, 4, sc);

            switch (opcion) {
                case 1:
                    recibirPaciente(pacientes, sc);
                    break;
                case 2:
                    atenderPaciente(pacientes);
                    break;
                case 3:
                	mostrarPacientes(pacientes);
                	break;
                case 4:
                    System.out.println("\nSaliendo del sistema de urgencias. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("\nOpción incorrecta. Debe introducir 1, 2 o 3.");
            }

        } while (opcion != 4);

    }

    private static void mostrarMenu() {
        System.out.println("\n MENÚ DE OPCIONES");
        System.out.println("=====================");
        System.out.println("1.- Recibir paciente");
        System.out.println("2.- Atender paciente");
        System.out.println("3.- Listado de pacientes en sala de espera");
        System.out.println("4.- Salir");
    }

    /**
     * Comprueba si hay sitio libre en el array. Si hay hueco, solicita los datos
     * y crea el objeto en el primer índice con valor null.
     */
    private static void recibirPaciente(Paciente[] pacientes, Scanner sc) {
        int indiceLibre = buscarPrimerHuecoLibre(pacientes);

        if (indiceLibre == -1) {
            System.out.println("\nSala de espera llena. No se registra el paciente");
            return;
        }

        pacientes[indiceLibre] = crearPaciente(sc);
        System.out.printf("%nPaciente ubicado en el asiento %02d.\n", indiceLibre + 1);
        mostrarPacientes(pacientes);
    }
    
    private static Paciente crearPaciente(Scanner sc) {
    	System.out.print("\nIntroduzca el nombre del paciente: ");
        String nombre = sc.nextLine().trim();
        while (nombre.isEmpty()) {
            System.out.print("El nombre no puede estar en blanco. Inténtelo de nuevo: ");
            nombre = sc.nextLine().trim();
        }

        NivelGravedad gravedad = pedirGravedad(sc);

        return new Paciente(nombre, gravedad);
    }

    private static NivelGravedad pedirGravedad(Scanner sc) {
    	NivelGravedad[] niveles = NivelGravedad.values();
        System.out.println("Seleccione el nivel de gravedad:");
        for (int i = 0; i < niveles.length; i++) {
        	System.out.printf("%d. %s\n", i + 1, niveles[i].name());
        }

            int opcion = leerEntero("Gravedad (1-3): ", 1, 3, sc);

        switch (opcion) {
            case 2:
                return NivelGravedad.MEDIO;
            case 3:
                return NivelGravedad.ALTO;
            default:
                return NivelGravedad.BAJO;

        }
    }

    /**
     * Busca al paciente más grave. En caso de empate, el recorrido desde el
     * índice 0 y la comparación estricta (>) garantiza la prioridad del que llegó antes.
     * Desplaza los asientos posteriores hacia la izquierda para eliminar el hueco.
     */
    private static void atenderPaciente(Paciente[] pacientes) {
        int indiceAtendido = buscarIndiceMasGrave(pacientes);

        if (indiceAtendido == -1) {
            System.out.println("\nLa sala de espera está vacía");
            return;
        }

        Paciente atendido = pacientes[indiceAtendido];
        System.out.printf("\n PASA A CONSULTA: %s\n", atendido);


        // Desplazamiento a la izquierda para compactar el array
        for (int i = indiceAtendido; i < pacientes.length - 1; i++) {
            pacientes[i] = pacientes[i + 1];
        }

        // Se limpia la última posición del array para no dejar referencias duplicadas
        pacientes[pacientes.length - 1] = null;
        
        mostrarPacientes(pacientes);
    }

    private static int buscarPrimerHuecoLibre(Paciente[] pacientes) {
        for (int i = 0; i < pacientes.length; i++) {
            if (pacientes[i] == null) {
                return i;
            }
        }
        return -1; // Sala de espera llena
    }

    /**
     * Recorre el listado de pacientes y devuelve el índice del primero más grave
     */
    private static int buscarIndiceMasGrave(Paciente[] pacientes) {
    	
    	int indiceMax = -1;

        for (int i = 0; i < pacientes.length; i++) {
            if (pacientes[i] != null) {
                if (indiceMax == -1) {
                    indiceMax = i;
                } else if (pacientes[i].getGravedad().ordinal() > pacientes[indiceMax].getGravedad().ordinal()) {
                    indiceMax = i;
                }
            }
        }

        return indiceMax;
    }

    private static int leerEntero(String mensaje, int min, int max, Scanner sc) {
    	while (true) {
    		System.out.print(mensaje);
    		int numero = Integer.parseInt(sc.nextLine().trim());
    		if (numero >= min && numero <= max) {
    			return numero;
    		}
    		System.out.printf("El número debe estar entre %d y %d", min, max);
    	}
    }
    
    private static void mostrarPacientes(Paciente[] pacientes) {
        System.out.println("\nPacientes en sala de espera: ");
        for (Paciente paciente : pacientes) {
        	if (paciente != null) {
        		System.out.println(paciente);
        	}
        }
    }
}