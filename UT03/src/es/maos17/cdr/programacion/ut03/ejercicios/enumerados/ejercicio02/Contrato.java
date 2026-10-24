package es.maos17.cdr.programacion.ut03.ejercicios.enumerados.ejercicio02;

public class Contrato {
	// Constantes
	public static final double PORCENTAJE_DESCUENTO_ELECTRICO = 15.0;
	public static final int DIAS_CONTRATO_LARGO = 7;
	public static final double DESCUENTO_CONTRATO_LARGO = 25.00;
	
	// Atributos
	private String matricula;
	private String cliente;
	private int dias;
	private Categoria categoria;
	private Tipo tipo;

	// Constructor
	public Contrato(String matricula, String cliente, int dias, Categoria categoria, Tipo tipo) {
		setMatricula(matricula);
		setCliente(cliente);
		setDias(dias);
		this.categoria = categoria;
		this.tipo = tipo;
	}

	// Métodos
	public double calcularPrecio() {
		double precio= dias * categoria.getTarifaDiaria();
		// Descuento del 15% para vehículos eléctricos
		if (tipo == Tipo.ELECTRICO) {
			precio *= ((100 - PORCENTAJE_DESCUENTO_ELECTRICO) / 100);
		}
		if (dias > DIAS_CONTRATO_LARGO) {
			precio -= DESCUENTO_CONTRATO_LARGO;
		}
		return precio;
	}
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("=========================================\n");
	    sb.append("      FACTURA ALQUILER DE VEHÍCULO       \n");
	    sb.append("=========================================\n");
	    sb.append("Cliente:         ").append(cliente).append("\n");
	    sb.append("Matrícula:       ").append(matricula).append("\n");
	    sb.append("Categoría:       ").append(categoria.getDescripcion())
	      .append(" (").append(String.format("%.2f", categoria.getTarifaDiaria())).append(" €/día)\n");
	    sb.append("Motorización:    ").append(tipo).append("\n");
	    sb.append("Duración:        ").append(dias).append(" día(s)\n");
	    sb.append("-----------------------------------------\n");
	    sb.append("Precio final:    ").append(String.format("%.2f", calcularPrecio())).append(" €\n");
	    sb.append("=========================================");
	    return sb.toString();
	}
	
	// Getters y setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula != null ? matricula : "";
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente != null ? cliente : "";
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		if (dias < 1) {
			dias = 1;
		}
		this.dias = dias;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	
}
