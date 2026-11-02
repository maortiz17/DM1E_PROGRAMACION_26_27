package es.maos17.cdr.programacion.ut04.ejercicios.arrays.ejercicio19;

public class Resultado {
	private String local;
	private String visitante;
	private char resultado;
	
	public Resultado(String local, String visitante, char resultado) {
		this.local = local;
		this.visitante = visitante;
		this.resultado = resultado;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getVisitante() {
		return visitante;
	}

	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}

	public char getResultado() {
		return resultado;
	}

	public void setResultado(char resultado) {
		this.resultado = resultado;
	}
	
	
}
