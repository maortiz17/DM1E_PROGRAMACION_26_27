package es.maos17.cdr.programacion.ut03.ejercicios.ejercicio09;

import java.util.Random;

public class CuentaBancaria {
	// Constantes
	private static final int NUM_CUENTA_MIN = 1_000_000;
	private static final int NUM_CUENTA_MAX = 9_999_999;
	private static final boolean ADMITE_DESCUBIERTO_DEFECTO = false;
	
	// Atributos
	private final int numCuenta;
	private final String nifTitular;
	private final String nombre;
	private final String apellido;
	private double saldo;
	private final boolean admiteDescubierto;
	
	// Constructores
	public CuentaBancaria(String nifTitular, String nombre, String apellido, double saldo, boolean admiteDescubierto) {
		this.nifTitular = nifTitular;
		this.nombre = nombre;
		this.apellido = apellido;
		this.saldo = saldo;
		numCuenta = generarCuentaAleatoria();
		this.admiteDescubierto = admiteDescubierto;
	}
	
	public CuentaBancaria(String nifTitular, String nombre, String apellido) {
		this(nifTitular, nombre, apellido, 0.0, ADMITE_DESCUBIERTO_DEFECTO);
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
		if (cantidad > 0) {
			if (cantidad <= saldo || admiteDescubierto) {
				saldo -= cantidad;
			} else {
				System.out.printf("No se ha retirado el dinero porque no se puede entrar en descubierto. Saldo actual %.2f €\n", saldo);
			}
		} else {
			System.out.println("La cantidad debe ser positiva");
		}
	}
	
	public void ingresar(double cantidad) {
		if (cantidad > 0) {
			saldo += cantidad;
		} else {
			System.out.println("La cantidad debe ser positiva");
		}
	}
	
	public double consultarSaldo() {
		return saldo;
	}
	
	public boolean estaEnNumerosRojos() {
		return saldo < 0;
	}
}
