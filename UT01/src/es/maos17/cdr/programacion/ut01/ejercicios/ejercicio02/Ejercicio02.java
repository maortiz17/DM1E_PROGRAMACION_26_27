package es.maos17.cdr.programacion.ut01.ejercicios.ejercicio02;

public class Ejercicio02 {
	public static void main(String[] args) {
		int origenEntero;
		double origenReal;
		int destinoEntero;
		double destinoReal;
		float destinoReal2;
		
		origenEntero = 6;
		origenReal = 22.55;
		
		// origenxxx y destinoxxx son del mismo tipo
		destinoEntero = origenEntero;
		destinoReal = origenReal;
		
		// destinoReal2 es más pequeña. Necesito cast explícito
		destinoReal2 = (float)origenReal;
	}
}
