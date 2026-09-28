package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
	/*
	 * La asociación de vinicultores tiene como política fijar un precio inicial al
	 * kilo de uva, que se clasifica en tipos A y B, y además en tamaños 1 y 2.
	 * Cuando se realiza la venta del producto, esta es de un solo tipo y tamaño. Se
	 * requiere determinar cuánto recibirá de beneficios (o pérdidas) un productor
	 * por la uva que entrega en un embarque, considerando lo siguiente: 
	 * ● Si es de tipo A, se incrementa el precio por kilo: 
	 * 		○ 20 céntimos al precio inicial cuando es de tamaño 1 
	 * 		○ 30 céntimos si es de tamaño 2 
	 * ● Si es de tipo B, se rebaja el precio por kilo: 
	 * 		○ 30 céntimos cuando es de tamaño 1. 
	 * 		○ 50 céntimos cuando es de tamaño 2. 
	 * Realice un algoritmo para determinar la ganancia o pérdida obtenida en un embarque.
	 * 
	 */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Introduce los kilos de uva entregados: ");
        double kilos = sc.nextDouble();

        System.out.print("Introduce el precio inicial por kilo: ");
        double precioInicial = sc.nextDouble();

        System.out.print("Introduce el tipo de uva (A o B): ");
        char tipo = sc.next().toUpperCase().charAt(0);

        System.out.print("Introduce el tamaño de uva (1 o 2): ");
        int tamano = sc.nextInt();

        double precioFinalPorKilo = precioInicial;
        boolean datosValidos = true;

        // Ajuste de precio según tipo y tamaño (en euros: 20 céntimos = 0.20 €)
        if (tipo == 'A') {
            if (tamano == 1) {
                precioFinalPorKilo += 0.20;
            } else if (tamano == 2) {
                precioFinalPorKilo += 0.30;
            } else {
                datosValidos = false;
            }
        } else if (tipo == 'B') {
            if (tamano == 1) {
                precioFinalPorKilo -= 0.30;
            } else if (tamano == 2) {
                precioFinalPorKilo -= 0.50;
            } else {
                datosValidos = false;
            }
        } else {
            datosValidos = false;
        }

        // Cálculo e impresión de resultados
        if (!datosValidos) {
            System.out.println("Error: Tipo o tamaño no reconocidos.");
        } else if (kilos <= 0 || precioInicial < 0) {
            System.out.println("Error: Los kilos o el precio inicial no pueden ser negativos.");
        } else {
            double totalVenta = kilos * precioFinalPorKilo;
            double totalInicial = kilos * precioInicial;
            double beneficio = totalVenta - totalInicial; // Diferencia respecto al precio base

            System.out.printf("Precio final por kilo: %.2f €%n", precioFinalPorKilo);
            System.out.printf("Total obtenido por el embarque: %.2f €%n", totalVenta);

            if (beneficio > 0) {
                System.out.printf("Beneficio adicional obtenido: +%.2f €%n", beneficio);
            } else if (beneficio < 0) {
                System.out.printf("Pérdida respecto al precio base: %.2f €%n", beneficio);
            } else {
                System.out.println("No hay pérdida ni beneficio.");
            }
        }

    }
}
