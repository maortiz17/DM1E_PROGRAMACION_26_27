package es.maos17.cdr.programacion.ut04.ejercicios.arrays.ejercicio20;

public class NumeroBuscado {
	private int numeroUsuario;
	private boolean seEncontro;
	
	public NumeroBuscado(int numeroUsuario) {
		super();
		this.numeroUsuario = numeroUsuario;
		this.seEncontro = false; // Lo cambiaremos si se encuentra el número
	}

	public boolean seEncontro() {
		return seEncontro;
	}

	public void setSeEncontro(boolean seEncontro) {
		this.seEncontro = seEncontro;
	}

	public int getNumeroUsuario() {
		return numeroUsuario;
	}
}
