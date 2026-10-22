package es.maos17.cdr.programacion.ut03.ejercicios.ejercicio06;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nombre;
		String dni;
		int edad;
		char sexo;
		double pesoKg;
		int alturaCm;

		System.out.print("Introduce el nombre: ");
		nombre = sc.nextLine();
		System.out.print("Introduce el DNI: ");
		dni = sc.nextLine();
		System.out.print("Introduce la edad: ");
		edad = Integer.parseInt(sc.nextLine());
		System.out.print("Introduce el sexo: ");
		String lineaSexo = sc.nextLine().trim();
		sexo = lineaSexo.isEmpty() ? Persona.SEXO_M : lineaSexo.charAt(0);
		System.out.print("Introduce el peso en kg: ");
		pesoKg = Double.parseDouble(sc.nextLine());
		System.out.print("Introduce la altura en cm: ");
		alturaCm = Integer.parseInt(sc.nextLine());

		Persona p1 = new Persona(dni, nombre, edad, sexo, pesoKg, alturaCm);
		Persona p2 = new Persona(dni, nombre, edad, sexo);
		Persona p3 = new Persona();
		p3.setNombre("Marta");
		p3.setEdad(16);
		p3.setSexo('M');
		p3.setAlturaCm(169);
		p3.setPesoKg(54);

		System.out.printf("%s %s\n", p1.getNombre(), mensajeImc(p1.calcularIMC()));
		System.out.printf("%s %s\n", p2.getNombre(), mensajeImc(p2.calcularIMC()));
		System.out.printf("%s %s\n", p3.getNombre(), mensajeImc(p3.calcularIMC()));
		
		System.out.println();
		
		System.out.printf("%s %s es mayor de edad\n", p1.getNombre(), p1.esMayorDeEdad() ? "sí" : "no");
		System.out.printf("%s %s es mayor de edad\n", p2.getNombre(), p2.esMayorDeEdad() ? "sí" : "no");
		System.out.printf("%s %s es mayor de edad\n", p3.getNombre(), p3.esMayorDeEdad() ? "sí" : "no");
		
		System.out.println();
		System.out.println(p1);
		System.out.println();
		System.out.println(p2);
		System.out.println();
		System.out.println(p3);
	}

	private static String mensajeImc(int imc) {
		return switch (imc) {
			case Persona.PESO_BAJO -> "está por debajo de su peso ideal";
			case Persona.PESO_ALTO -> "está por encima de su peso ideal";
			default -> "está en su peso ideal";
		};
	}

}
