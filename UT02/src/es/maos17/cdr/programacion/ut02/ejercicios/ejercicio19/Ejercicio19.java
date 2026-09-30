package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {
	/*
	 * Una compañía de transporte internacional tiene servicio en algunos países de
	 * América del Norte, América Central, América del Sur, Europa y Asia. El costo
	 * por el servicio de transporte se basa en el peso del paquete y la zona a la
	 * que va dirigido. 
	 * Lo anterior se muestra en la tabla: 
	 * Zona Ubicación Costo/gramo 
	 * 1 América del Norte 24.00 euros 
	 * 2 América Central 20.00 euros 
	 * 3 América del Sur 21.00 euros 
	 * 4 Europa 10.00 euros 
	 * 5 Asia 18.00 euros 
	 * Parte de su política implica que los paquetes con un peso superior a 5 kg no son
	 * transportados, por cuestiones de logística y de seguridad. Realice un
	 * algoritmo para determinar el cobro por la entrega de un paquete o, en su
	 * caso, el rechazo de la entrega.
	 * 
	 */
	
	private static final double PRECIO_ZONA_1 = 24.00;
    private static final double PRECIO_ZONA_2 = 20.00;
    private static final double PRECIO_ZONA_3 = 21.00;
    private static final double PRECIO_ZONA_4 = 10.00;
    private static final double PRECIO_ZONA_5 = 18.00;
    private static final double PESO_MAXIMO_KG = 5.0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el peso del paquete en kg: ");
        double pesoKg = Double.parseDouble(sc.nextLine());

        if (pesoKg <= 0) {
            System.out.println("Error: El peso debe ser mayor que 0.");
            sc.close();
            return;
        }

        if (pesoKg > PESO_MAXIMO_KG) {
            System.out.println("Entrega rechazada: el paquete supera el límite permitido de 5 kg.");
            sc.close();
            return;
        }

        System.out.println("Zonas de destino disponibles:");
        System.out.println("1. América del Norte (24.00 €/g)");
        System.out.println("2. América Central   (20.00 €/g)");
        System.out.println("3. América del Sur   (21.00 €/g)");
        System.out.println("4. Europa            (10.00 €/g)");
        System.out.println("5. Asia              (18.00 €/g)");
        System.out.print("Selecciona la zona (1-5): ");
        int zona = Integer.parseInt(sc.nextLine());

        double precioPorGramo = switch (zona) {
            case 1 -> PRECIO_ZONA_1;
            case 2 -> PRECIO_ZONA_2;
            case 3 -> PRECIO_ZONA_3;
            case 4 -> PRECIO_ZONA_4;
            case 5 -> PRECIO_ZONA_5;
            default -> 0.0;
        };

        if (precioPorGramo == 0) {
            System.out.println("Error: Zona no válida.");
        } else {
            double pesoGramos = pesoKg * 1000.0;
            double costeTotal = pesoGramos * precioPorGramo;

            System.out.printf("%nPeso del paquete: %.2f kg (%.0f gramos)%n", pesoKg, pesoGramos);
            System.out.printf("Tarifa aplicada: %.2f €/g%n", precioPorGramo);
            System.out.printf("Coste total del transporte: %.2f €%n", costeTotal);
        }

    }
}
