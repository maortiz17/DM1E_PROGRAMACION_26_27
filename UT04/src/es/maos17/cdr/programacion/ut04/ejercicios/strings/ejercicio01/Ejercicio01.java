package es.maos17.cdr.programacion.ut04.ejercicios.strings.ejercicio01;

public class Ejercicio01 {
	public static void main(String[] args) {
		
		System.out.println(insertarGuionesCadena("101 Dálmatas"));

	}
	
	private static String insertarGuionesCadena(String cadena) {
		if (cadena == null)
			return null;
		String cadenaConGuiones = "";
		for (int i = 0; i < cadena.length(); i++) {
			cadenaConGuiones += cadena.charAt(i);
			if (i != (cadena.length() - 1))
				cadenaConGuiones += "-";
		}
		return cadenaConGuiones;
	}
	

}
