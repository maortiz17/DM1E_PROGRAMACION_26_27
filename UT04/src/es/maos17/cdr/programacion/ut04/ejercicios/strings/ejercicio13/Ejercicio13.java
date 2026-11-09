package es.maos17.cdr.programacion.ut04.ejercicios.strings.ejercicio13;

public class Ejercicio13 {
	public static void main(String[] args) {
		System.out.println(aniadirSeparadores(323423443));
		System.out.println(aniadirSeparadores(22));
		System.out.println(aniadirSeparadores(322));
		System.out.println(aniadirSeparadores(433422));
		System.out.println(aniadirSeparadores(-22));
		System.out.println(aniadirSeparadores(-333622));
		System.out.println(aniadirSeparadores(-3422));

	}

	public static String aniadirSeparadores(int numero) {

		boolean esNegativo = false;
		if (numero < 0) {
			numero = -numero;
			esNegativo = true;
		}
		StringBuilder sb = new StringBuilder(String.valueOf(numero));

		for (int posicionPunto = sb.length() - 3; posicionPunto > 0; posicionPunto -= 3) {
			sb.insert(posicionPunto, '.');
		}

		// return esNegativo ? "-" + sb.toString() : sb.toString();
		return (esNegativo ? "-" : "") + sb.toString();
	}
}
