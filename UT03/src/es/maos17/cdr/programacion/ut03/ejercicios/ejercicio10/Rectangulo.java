package es.maos17.cdr.programacion.ut03.ejercicios.ejercicio10;

public class Rectangulo {
	// Constantes
	private static final int ALTURA_POR_DEFECTO = 1;
	private static final int BASE_POR_DEFECTO = 1;
	
	// Atributos (inmodificables después de crear el objeto)
	private final int base;
	private final int altura;
	
	// Constructores
	public Rectangulo (int base, int altura){
		if (base <= 0) {
			System.err.println("La base debe ser positiva. Se inicializa a 1.");
			base = BASE_POR_DEFECTO;
		}
		if (altura <= 0) {
			System.err.println("La altura debe ser positiva. Se inicializa a 1.");
			altura = ALTURA_POR_DEFECTO;
		}
		this.base = base;
		this.altura = altura;
	}
	
	public Rectangulo(int lado){
		this(lado, lado);
	}
	
	// Getters
	public int getBase() {
		return base;
	}

	public int getAltura() {
		return altura;
	}
	
	// Métodos
	public int getPerimetro() {
		return 2 * (base + altura);
	}
	
	public int getArea() {
		return base * altura;
	}
	
	public boolean esMasAlto(Rectangulo otro) {
		if (otro == null) {
			return true;
		}
		return altura > otro.getAltura();
	}
	
	public boolean esMasAncho(Rectangulo otro) {
		if (otro == null) {
			return true;
		}
		return base > otro.getBase();
	}
	
	public int compararArea(Rectangulo otro) {
		if (otro == null) {
			return 1;
		}
		if (getArea() < otro.getArea()) {
			return -1;
		} else if (getArea() == otro.getArea()) {
			return 0;
		}
		return 1;
	}
}
