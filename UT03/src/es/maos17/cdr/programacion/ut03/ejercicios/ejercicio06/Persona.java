package es.maos17.cdr.programacion.ut03.ejercicios.ejercicio06;

import java.util.Random;

public class Persona {
	// Constantes
	public static final char SEXO_M = 'M';
	public static final char SEXO_H = 'H';
	
	public static final double IMC_BAJO = 20;
	public static final double IMC_ALTO = 25;
	public static final int PESO_BAJO = -1;
	public static final int PESO_IDEAL = 0;
	public static final int PESO_ALTO = 1;
	
	public static final int MAYORIA_EDAD = 18;
	
	private static final String LETRAS_NIF = "TRWAGMYFPDXBNJZSQVHLCKE";
	
	// Atributos
	private String nombre = "";
	private int edad = 0;
	private String dni;
	private char sexo = SEXO_M;
	private double pesoKg = 0.0;
	private int alturaCm = 0;
	
	// Constructores
	public Persona() {
		dni = generaDni();
	}
	
	public Persona(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	
	public Persona(String dni, String nombre, int edad, char sexo) {
		this(dni, nombre);
		this.edad = edad;
		setSexo(sexo);
	}
	
	public Persona(String dni, String nombre, int edad, char sexo, double pesoKg, int alturaCm) {
		this(dni, nombre, edad, sexo);
		this.pesoKg = pesoKg;
		this.alturaCm = alturaCm;
	}
	
	// Métodos
	public int calcularIMC() {
		double imc = 0;
		if (alturaCm != 0) {
			imc = pesoKg / Math.pow((alturaCm / 100D), 2);
		}
		if (imc < IMC_BAJO) {
			return PESO_BAJO;
		}
		if (imc >= IMC_BAJO && imc <= IMC_ALTO) {
			return PESO_IDEAL;
		}
		return PESO_ALTO;
	}
	
	public boolean esMayorDeEdad() {
		return edad >= MAYORIA_EDAD;
	}
	
	private static char comprobarSexo(char sexo) {
		sexo = Character.toUpperCase(sexo);
		if (sexo == SEXO_M || sexo == SEXO_H) {
			return sexo;
		}
		return SEXO_M;
	}
	
	@Override
	public String toString() {
		return String.format("Nombre: %s\nDNI: %s\nEdad: %d años\nSexo: %c\nPeso: %.2f Kg\nAltura: %d cm", nombre, dni, edad, sexo, pesoKg, alturaCm);
	}
	
	private static String generaDni() {
		Random rnd = new Random();
		
		int numero = rnd.nextInt(100_000_000);
		
		// char letra = (char)rnd.nextInt('A', 'Z' + 1);
		char letra = LETRAS_NIF.charAt(rnd.nextInt(LETRAS_NIF.length()));
		
		return String.format("%08d%c", numero, letra);
	}
	
	// Getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = comprobarSexo(sexo);
	}

	public double getPesoKg() {
		return pesoKg;
	}

	public void setPesoKg(double pesoKg) {
		this.pesoKg = pesoKg;
	}

	public int getAlturaCm() {
		return alturaCm;
	}

	public void setAlturaCm(int alturaCm) {
		this.alturaCm = alturaCm;
	}

	public String getDni() {
		return dni;
	}
	
}
