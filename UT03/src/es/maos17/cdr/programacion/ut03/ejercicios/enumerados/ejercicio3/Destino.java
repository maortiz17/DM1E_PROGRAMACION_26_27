package es.maos17.cdr.programacion.ut03.ejercicios.enumerados.ejercicio3;

public enum Destino {
	LOCAL(0.0),
	PROVINCIAL(3.5),
	PENINSULAR(6.0),
	BALEARES_CANARIAS(14.0);
	
	private final double recargo;
	
	private Destino(double recargo) {
		this.recargo = recargo;
	}

	public double getRecargo() {
		return recargo;
	}
}
