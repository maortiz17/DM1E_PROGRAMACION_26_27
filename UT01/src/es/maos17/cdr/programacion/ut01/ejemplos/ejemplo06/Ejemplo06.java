package es.maos17.cdr.programacion.ut01.ejemplos.ejemplo06;

public class Ejemplo06 {

	public static void main(String[] args) {// Caracteres de escape, comienzan con \
		
		String saludo = "Hola a todos\nBienvenidos!!"; // <- \n salto de línea
		
		// String comillasMal = "Texto entre "comillas""; <- Error!! Hay que escapar caracteres especiales
		String comillas = "Texto entre \"comillas\""; // <- \" comilla doble
		
		String comillasSimples = "Texto entre \'comillas simples\'"; // <- \' comilla simple
		
		String barra = "C:\\Usuarios\\carpeta"; // <- Para la \ hay que escribirla doble
		
		System.out.println(saludo);
		System.out.println(comillas);
		System.out.println(comillasSimples);
		System.out.println(barra);
	}

}
