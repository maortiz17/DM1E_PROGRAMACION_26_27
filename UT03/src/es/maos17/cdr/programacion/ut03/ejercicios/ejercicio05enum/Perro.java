package es.maos17.cdr.programacion.ut03.ejercicios.ejercicio05enum;

public class Perro {
	
	private static final int MAX_COMIDA_GR = 200;
	private static final int MIN_COMIDA_GR = 0;
	private static final int MAX_MINUTOS_JUEGO = 10;
	private static final int MIN_MINUTOS_JUEGO = 0;

	// Atributos
	private String nombre;
	private String raza;
	private String propietario;
	private int edad;
	private double pesoKg;
	private Posicion posicion = Posicion.SENTADO;

	// Métodos
	public void comer(int cantidadComidaGr) {
		if (cantidadComidaGr > MAX_COMIDA_GR) {
			cantidadComidaGr = MAX_COMIDA_GR;
		}
		if (cantidadComidaGr < MIN_COMIDA_GR) {
			cantidadComidaGr = MIN_COMIDA_GR;
		}
		System.out.printf("Soy %s y estoy comiendo %d gr de comida.\n", nombre, cantidadComidaGr);
		pesoKg += (cantidadComidaGr / 10) / 1000D;
	}

	public void jugar(int tiempoMinutos) {
		if (tiempoMinutos > MAX_MINUTOS_JUEGO) {
			tiempoMinutos = MAX_MINUTOS_JUEGO;
		}
		if (tiempoMinutos < MIN_MINUTOS_JUEGO) {
			tiempoMinutos = MIN_MINUTOS_JUEGO;
		}
		System.out.printf("Soy %s y estoy jugando %d minutos.\n", nombre, tiempoMinutos);
		pesoKg -= (tiempoMinutos / 7) / 1000D;
	}
	
	public void sentar() {
		if (posicion.equals(Posicion.SENTADO)) {
			System.out.println("Ya estoy sentado");
		} else {
			posicion = Posicion.SENTADO;
		}
	}
	
	public void ponerseDePie() {
		switch (posicion) {
		case TUMBADO:
			System.out.printf("Soy %s y no puedo ponerme de pie porque estoy tumbado.\n", nombre);
			break;
		case DE_PIE:
			System.out.println("Ya estoy de pie");
			break;
		default:
			posicion = Posicion.DE_PIE;
		}
	}
	
	public void tumbarse() {
		switch (posicion) {
		case DE_PIE:
			System.out.printf("Soy %s y no puedo tumbarme porque estoy de pie.\n", nombre);
			break;
		case TUMBADO:
			System.out.println("Ya estoy tumbado");
			break;
		default:
			posicion = Posicion.TUMBADO;
		}
	}

	// getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPesoKg() {
		return pesoKg;
	}

	public void setPesoKg(double pesoKg) {
		this.pesoKg = pesoKg;
	}
	
	public Posicion getPosicion() {
		return posicion;
	}

}
