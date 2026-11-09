package es.maos17.cdr.programacion.ut04.ejercicios.arrays2d.ejercicio06;

public class Cine {
	private static final double PRECIO_DEFECTO = 9.99;

	private static int numPeliculas = 1;
	private Butaca[][] butacas;
	private String pelicula;
	private double precio;

	public Cine(int filas, int butacasXFila, String pelicula, double precio) {
		if (pelicula == null || pelicula.trim().isEmpty()) {
			pelicula = "Desconocida";
		}
		this.butacas = new Butaca[filas][butacasXFila];
		inicializarButacas();
		this.pelicula = pelicula;
		
		if (precio <= 0) {
			precio = PRECIO_DEFECTO;
		}
		
		this.precio = precio;
	}

	public String getPelicula() {
		return pelicula;
	}

	public int setPelicula(String pelicula) {
		// Al modificar la pelicula se inicializan las butacas ocupadas
		this.pelicula = pelicula;
		inicializarButacas();
		return ++numPeliculas;
		
	}

	public static int getNumPeliculas() {
		return numPeliculas;
	}

	public Butaca[][] getButacas() {
		return butacas;
	}

	public double getPrecio() {
		return precio;
	}

	private void inicializarButacas() {
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				butacas[i][j] = Butaca.LIBRE;
			}
		}
	}
	
	public int getButacasDisponibles(int fila, int butaca) {
		fila--;
		butaca--;
		int butacasDisponibles = 0;
		for (int i = fila; i < butacas.length; i++) {
			for (int j = butaca; j < butacas[i].length; j++) {
				if (butacas[i][j] == Butaca.LIBRE) {
					butacasDisponibles++;
				}
			}
			butaca = 0;
		}
		return butacasDisponibles;
	}
	
	public double venderEntradas(int fila, int butaca, int cantidad) {
		if (cantidad > getButacasDisponibles(fila, butaca)) {
			return 0;
		}
		int butacasRestantes = cantidad;
		for (int i = fila - 1; i < butacas.length & butacasRestantes > 0; i++) {
			for (int j = butaca - 1; j < butacas[i].length && butacasRestantes > 0; j++) {
				if (butacas[i][j] == Butaca.LIBRE) {
					butacas[i][j] = Butaca.OCUPADO;
					butacasRestantes--;
				}
			}
			butaca = 1;
		}
		return precio * cantidad;
	}
}
