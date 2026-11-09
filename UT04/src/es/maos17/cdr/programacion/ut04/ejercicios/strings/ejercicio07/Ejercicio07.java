package es.maos17.cdr.programacion.ut04.ejercicios.strings.ejercicio07;

public class Ejercicio07 {

	public static void main(String[] args) {
		System.out.println(contarOcurrencias("a", "Albacete"));
		System.out.println(contarOcurrencias("i", "Albacete"));
		System.out.println(contarOcurrencias("parte", "La parte contratante de la primera parte"));
		System.out.println(contarOcurrencias(null, "cadena"));
		System.out.println(contarOcurrencias("palabra", null));

	}

	public static int contarOcurrencias(String buscada, String buscarEn) {
		if (buscada == null || buscarEn == null) {
			return 0;
		}

		buscada = buscada.toUpperCase();
		buscarEn = buscarEn.toUpperCase();

		int contador = 0;
		int posicionBusqueda = 0;
		int posicionEncontrada = buscarEn.indexOf(buscada);

		while (posicionEncontrada != -1) {
			contador++;
			posicionBusqueda = posicionEncontrada + 1;
			posicionEncontrada = buscarEn.indexOf(buscada, posicionBusqueda);
		}

		return contador;

	}

}
