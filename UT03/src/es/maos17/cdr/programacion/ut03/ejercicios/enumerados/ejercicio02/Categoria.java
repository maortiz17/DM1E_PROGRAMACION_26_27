package es.maos17.cdr.programacion.ut03.ejercicios.enumerados.ejercicio02;

public enum Categoria {
	UTILITARIO(30.0, "Utilitario"),
	COMPACTO(45.0, "Compacto"),
	SEDAN(65.0, "Sedán"),
	SUV(80.0, "SUV");
	
	private final double tarifaDiaria;
	private final String descripcion;
	
	private Categoria(double tarifaDiaria, String descripcion) {
		this.tarifaDiaria = tarifaDiaria;
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public double getTarifaDiaria() {
		return tarifaDiaria;
	}
}
