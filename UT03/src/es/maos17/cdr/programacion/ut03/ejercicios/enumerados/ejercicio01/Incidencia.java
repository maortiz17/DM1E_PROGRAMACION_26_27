package es.maos17.cdr.programacion.ut03.ejercicios.enumerados.ejercicio01;

public class Incidencia {
	// Atributos
	private static int proximoId = 1; // Estático, porque controla el identificador de la incidencia
	
	private final int id;
	private String descripcion;
	private String tecnico;
	private Prioridad prioridad;
	private Estado estado;
	
	public Incidencia(String descripcion, Prioridad prioridad) {
		this.id = proximoId++;
		this.descripcion = (descripcion != null) ? descripcion.trim() : "";
		this.tecnico = "";
		this.prioridad = (prioridad != null) ? prioridad : Prioridad.MEDIA;
		this.estado = Estado.REGISTRADA;
	}
	
	public void setTecnico(String tecnico) {
		if (estado == Estado.CERRADA) {
			System.out.println("La incidencia se encuentra CERRADA");
			return;
		}
		if (tecnico != null && !tecnico.trim().isEmpty()) {
			this.tecnico = tecnico.trim();
			if (estado == Estado.REGISTRADA) {
				estado = Estado.ASIGNADA;
			}
		} else {
			System.out.println("Nombre del técnico no válido");
		}
	}
	
	public void setEstado(Estado estado) {
		if ((tecnico.isEmpty())) {
			System.out.println("No hay técnico asignado. No se permite el cambio de estado.");
			return;
		}
		
		if ((estado == Estado.EN_RESOLUCION && this.estado == Estado.ASIGNADA) || 
			 (estado == Estado.CERRADA && this.estado == Estado.EN_RESOLUCION))	{
			this.estado = estado;
			return;
		}
		System.out.println("Cambio de estado no permitido.");
	}
	
	@Override
	public String toString() {
		return String.format("Incidencia (id: %d): %s\nTécnico: %s\nEstado: %s\nPrioridad: %s%s", id, descripcion, tecnico, estado, prioridad, prioridad == Prioridad.CRITICA ? " [REQUIERE ATENCIÓN INMEDIATA]" : "");
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Prioridad getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Prioridad prioridad) {
		this.prioridad = prioridad;
	}

	public int getId() {
		return id;
	}

	public String getTecnico() {
		return tecnico;
	}

	public Estado getEstado() {
		return estado;
	}
	
	
}
