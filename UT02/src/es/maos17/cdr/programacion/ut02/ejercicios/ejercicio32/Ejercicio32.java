package es.maos17.cdr.programacion.ut02.ejercicios.ejercicio32;

public class Ejercicio32 {
	private static final int NUMERO_MESES = 20;
	public static void main(String[] args) {
		/*Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó 10€, 
		 * el segundo 20 €, el tercero 40 € y así sucesivamente (cada mes, 
		 * el doble que el mes anterior). 
		 * Realizar un algoritmo para determinar cuánto debe pagar
		 * mensualmente y el total de lo que pagará después de los 20 meses.
		 * 
		 */
		
		int pago = 10; // Importe del mes inicial
		long acumulado = 0;
		
		for (int i = 1; i <= NUMERO_MESES; i++) {
			System.out.printf("Mes %d: %d €\n", i, pago);
			acumulado += pago;
			pago *= 2;
		}
		
		System.out.println("Total pagado: " + acumulado + "€");
	}

}
