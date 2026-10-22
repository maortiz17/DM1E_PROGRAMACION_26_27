package es.maos17.cdr.programacion.ut03.ejercicios.ejercicio01;

public class Programa {

	public static void main(String[] args) {
		Perro perro = new Perro();
		mostrarPerro(perro);
	}

	private static void mostrarPerro(Perro perro) {
		System.out.printf("Nombre: %s\n", perro.getNombre());
		System.out.printf("Raza: %s\n", perro.getRaza());
		System.out.printf("Propietario: %s\n", perro.getPropietario());
		System.out.printf("Edad: %02d\n", perro.getEdad());
		System.out.printf("Peso: %.2f\n", perro.getPesoKg());
	}

}
