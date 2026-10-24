package es.maos17.cdr.programacion.ut03.ejercicios.enumerados.ejercicio3;

public class Paquete {
	// Constantes
	public static final double PESO_POR_DEFECTO = 0.5;
	public static final double COSTE_INICIAL = 5.0;
	public static final double COSTE_POR_KG = 1.2;
	public static final double RECARGO_EXPRESS = 25.0;

	// Atributos
	private String codSeguimiento;
	private String destinatario;
	private double peso;
	private Destino destino;
	private Modalidad modalidad;

	// Constructor
	public Paquete(String codSeguimiento, String destinatario, double peso, Destino destino, Modalidad modalidad) {
		setCodSeguimiento(codSeguimiento);
		setDestinatario(destinatario);
		setPeso(peso);
		setDestino(destino);
		setModalidad(modalidad);
	}

	// Métodos
	public double calcularCosteEnvio() {
		double tarifa = COSTE_INICIAL + (COSTE_POR_KG * peso);
		tarifa += destino.getRecargo(); // Aplicamos recargo según destino (definido en el enum)
		tarifa += (modalidad == Modalidad.EXPRESS) ? tarifa * RECARGO_EXPRESS / 100 : 0.0; // Aplicamos recargo EXPRESS si es necesario
		return tarifa;
	}

	/**
	 * Compara el coste de envío de dos paquetes
	 * 
	 * @param otro: Representa el otro paquete con el que comparamos
	 * @return: Devuelve -1 si este paquete es más económico, 0 si tienen el mismo
	 *          coste y 1 si este el más caro que el recibido por parámetro.
	 */
	public int compararEnvios(Paquete otro) {
		if (otro == null || calcularCosteEnvio() > otro.calcularCosteEnvio()) {
			return 1;
		}
		if (calcularCosteEnvio() < otro.calcularCosteEnvio()) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Código de seguimiento: ").append(codSeguimiento).append("\n").append("Destinatario: ")
				.append(destinatario).append("\n").append("Peso: ").append(String.format("%.2f", peso)).append(" kg\n")
				.append("Destino: ").append(destino).append("\n").append("Modalidad: ").append(modalidad).append("\n")
				.append("Coste de envío: ").append(String.format("%.2f €", calcularCosteEnvio()));
		return sb.toString();
	}

	// Getters y setters
	public String getCodSeguimiento() {
		return codSeguimiento;
	}

	public void setCodSeguimiento(String codSeguimiento) {
		this.codSeguimiento = codSeguimiento != null ? codSeguimiento : "";
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario != null ? destinatario : "";
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso <= 0) {
			peso = PESO_POR_DEFECTO;
		}
		this.peso = peso;
	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = (destino != null) ? destino : Destino.LOCAL;
	}

	public Modalidad getModalidad() {
		return modalidad;
	}

	public void setModalidad(Modalidad modalidad) {
		this.modalidad = (modalidad != null) ? modalidad : Modalidad.ESTANDAR;
	}

}
