package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio48;

public class Ejercicio48 {
	/*
	 * Crea un método que reciba un número entero mayor o igual a cero y devuelva una
	 * cadena (String) que represente el número en binario.
	 * Para convertir el número a binario tienes que hacer una serie de divisiones
	 * sucesivas por 2 (la base del sistema binario). Ejemplo: transformar el número
	 * decimal 131 en binario:
	 * ● 131 dividido entre 2 da 65 con resto igual a 1
	 * ● 65 dividido entre 2 da 32 con resto igual a 1
	 * ● 32 dividido entre 2 da 16 con resto igual a 0
	 * ● 16 dividido entre 2 da 8 con resto igual a 0
	 * ● 8 dividido entre 2 da 4 con resto igual a 0
	 * ● 4 dividido entre 2 da 2 con resto igual a 0
	 * ● 2 dividido entre 2 da 1 con resto igual a 0
	 * ● el último cociente es 1
	 * ● Se ordenan los restos, del último al primero: 10000011. En sistema binario, 131 se
	 *   escribe 10000011.
	 */

	public static void main(String[] args) {
		System.out.println(convertirBinario(131));
	}
	
	private static String convertirBinario(int numero) {
		if (numero == 0) {
			return "0";
		}
		String binario = "";
		while (numero > 0) {
			binario = (numero % 2) + binario;
			numero /= 2;
		}
		return binario;
	}

}
