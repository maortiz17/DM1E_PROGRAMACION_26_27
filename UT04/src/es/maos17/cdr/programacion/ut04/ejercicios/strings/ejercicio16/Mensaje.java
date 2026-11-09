package es.maos17.cdr.programacion.ut04.ejercicios.strings.ejercicio16;

public class Mensaje {
	private String contenido;
	private String remitente;

	public Mensaje(String textoReal, String remitente, int codigo) {
		this.remitente = remitente;
		// Ciframos inmediatamente al construir
		this.contenido = cifrar(textoReal, codigo);
	}

	public String getContenidoCifrado() {
		return contenido;
	}

	public String getRemitente() {
		return remitente;
	}

	/**
	 * Intenta descifrar el mensaje. Si el código es incorrecto, devolverá
	 * caracteres sin sentido.
	 */
	public String descifrar(int codigo) {
		StringBuilder sb = new StringBuilder();
		char[] caracteres = this.contenido.toCharArray();

		for (int i = 0; i < caracteres.length; i++) {
			// El desplazamiento depende del código y de la posición (i)
			int desplazamiento = codigo + i;

			char c = (char) (caracteres[i] - desplazamiento);
			sb.append(c);
		}
		return sb.toString();
	}

	/**
	 * Algoritmo de cifrado posicional
	 **/
	private String cifrar(String texto, int codigo) {
		StringBuilder sb = new StringBuilder();
		char[] caracteres = texto.toCharArray();

		for (int i = 0; i < caracteres.length; i++) {
			// El desplazamiento depende del código Y de la posición (i)
			int desplazamiento = codigo + i;

			char c = (char) (caracteres[i] + desplazamiento);
			sb.append(c);
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		// Devolvemos el remitente y el mensaje cifrado
		return "[" + remitente + "]: " + contenido;
	}
}
