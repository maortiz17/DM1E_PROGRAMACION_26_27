package es.maos17.cdr.programacion.ut03.ejercicios.ejercicio08;

import java.util.Random;

public class CuentaBancaria {
	// Constantes
	private static final int NUM_CUENTA_MIN = 1_000_000;
	private static final int NUM_CUENTA_MAX = 9_999_999;
	
	// Atributos
	private final int numCuenta;
	private final String nifTitular;
	private final String nombre;
	private final String apellido;
	private double saldo;
	
	// Constructores
	public CuentaBancaria(String nifTitular, String nombre, String apellido, double saldo) {
		this.nifTitular = nifTitular;
		this.nombre = nombre;
		this.apellido = apellido;
		this.saldo = saldo;
		numCuenta = generarCuentaAleatoria();
	}
	
	public CuentaBancaria(String nifTitular, String nombre, String apellido) {
		this(nifTitular, nombre, apellido, 0.0);
	}

	// Métodos
	@Override
	public String toString() {
		return String.format("Cuenta: %07d. Saldo: %.2f €\nTitular: %s - %s %s", numCuenta, saldo, nifTitular, nombre, apellido);
	}
	
	private static int generarCuentaAleatoria() {
		return new Random().nextInt(NUM_CUENTA_MIN, NUM_CUENTA_MAX + 1);
	}
 	
	public void reembolsar(double cantidad) {
		saldo -= cantidad;
	}
	
	public void ingresar(double cantidad) {
		saldo += cantidad;
	}
	
	public double consultarSaldo() {
		return saldo;
	}
	
	public boolean estaEnNumerosRojos() {
		return saldo < 0;
	}
}
