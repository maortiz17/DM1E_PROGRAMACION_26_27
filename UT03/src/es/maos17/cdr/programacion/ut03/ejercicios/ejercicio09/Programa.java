package es.maos17.cdr.programacion.ut03.ejercicios.ejercicio09;

public class Programa {

	public static void main(String[] args) {
		// Cuenta A: saldo inicial 0€ y sin descubierto por defecto
        CuentaBancaria cuentaA = new CuentaBancaria("323123D", "Miguel Ángel", "Ortiz");
        System.out.println(cuentaA);
        
        System.out.println("\n--- Pruebas Cuenta A ---");
        cuentaA.ingresar(-100);                  // Prueba cantidad negativa
        cuentaA.reembolsar(100);                 // Denegado por descubierto
        System.out.printf("Saldo consultado: %.2f €\n", cuentaA.consultarSaldo());
        System.out.printf("¿La cuenta A está en números rojos? %s\n", cuentaA.estaEnNumerosRojos());

        // Cuenta B: saldo inicial 300€ y con descubierto permitido
        System.out.println("\n-------------------------------------------");
        CuentaBancaria cuentaB = new CuentaBancaria("2431123D", "Martina", "Martín", 300.0, true);
        System.out.println(cuentaB);
        
        System.out.println("\n--- Pruebas Cuenta B ---");
        cuentaB.ingresar(20.0);
        System.out.printf("Saldo tras ingreso: %.2f €\n", cuentaB.consultarSaldo());
        
        cuentaB.reembolsar(500.0);               // Permitido: saldo pasa a -180.00 €
        System.out.printf("Saldo tras reembolso: %.2f €\n", cuentaB.consultarSaldo());
        System.out.printf("¿La cuenta B está en números rojos? %s\n", cuentaB.estaEnNumerosRojos());
        
        System.out.println("\n--- Estado final de las cuentas ---");
        System.out.println(cuentaA);
        System.out.println();
        System.out.println(cuentaB);
	}

}
