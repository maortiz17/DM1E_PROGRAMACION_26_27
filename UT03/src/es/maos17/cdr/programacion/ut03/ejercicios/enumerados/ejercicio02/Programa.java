package es.maos17.cdr.programacion.ut03.ejercicios.enumerados.ejercicio02;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Contrato contrato = solicitarDatos(sc);

		System.out.println(contrato);
	}

	private static Contrato solicitarDatos(Scanner sc) {
		// Solicitamos los datos del contrato para crear la referencia al objeto
		System.out.print("Introduzca matrícula del vehículo: ");
		String matricula = sc.nextLine().trim();
		System.out.print("Introduzca nombre del cliente: ");
		String cliente = sc.nextLine().trim();
		System.out.print("Introduzca el número de días: ");
		int dias = Integer.parseInt(sc.nextLine());
		
		Categoria categoria = solicitarCategoria(sc);
		
		Tipo tipo = solicitarTipo(sc);
		
		return new Contrato(matricula, cliente, dias, categoria, tipo);
	}
	
	private static Categoria solicitarCategoria(Scanner sc) {
	    System.out.print("Introduzca categoría del vehículo (UTILITARIO, COMPACTO, SEDAN, SUV): ");
	    String entrada = sc.nextLine().trim().toUpperCase();
	    
	    return switch (entrada) {
	        case "UTILITARIO" -> Categoria.UTILITARIO;
	        case "COMPACTO" -> Categoria.COMPACTO;
	        case "SEDAN", "SEDÁN" -> Categoria.SEDAN;
	        case "SUV" -> Categoria.SUV;
	        default -> {
	            System.out.println("Aviso: Categoría no reconocida. Asignada COMPACTO por defecto.");
	            yield Categoria.COMPACTO;
	        }
	    };
	}
	
	private static Tipo solicitarTipo(Scanner sc) {
		// Aquí utilizamos un menú, por ver otro modo de hacerlo
		System.out.println("TIPOS DE VEHÍCULOS DISPONIBLES: ");
		System.out.println("1. GASOLINA");
		System.out.println("2. DIÉSEL");
		System.out.println("3. HÍBRIDO");
		System.out.println("4. ELÉCTRICO");
		System.out.println("Introduzca tipo del vehículo (1-4): ");
		int opcion = Integer.parseInt(sc.nextLine()); // Podemos forzar a que la respuesta sea un número válido
		
		switch (opcion) {
		case 2:
			return Tipo.DIESEL;
		case 3:
			return Tipo.HIBRIDO;
		case 4:
			return Tipo.ELECTRICO;
		default:
			return Tipo.GASOLINA;
		}
	}
}
