package es.maos17.cdr.programacion.ut03.ejercicios.ejercicio07;

public class Programa {

	public static void main(String[] args) {
		CuentaBancaria cuentaA = new CuentaBancaria("323123D", "Miguel Ángel", "Ortiz");
		System.out.println(cuentaA);
		
		System.out.println();
		
		CuentaBancaria cuentaB = new CuentaBancaria("2431123D", "Martina", "Martín", 300);
		System.out.println(cuentaB);

	}

}
