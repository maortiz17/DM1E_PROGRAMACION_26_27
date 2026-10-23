package es.maos17.cdr.programacion.ut03.ejercicios.enumerados.ejercicio01;

public class Programa {

    public static void main(String[] args) {
        // 1. Instanciación con códigos generados automáticamente
        Incidencia inc1 = new Incidencia("Fallo en la pasarela de pagos al tramitar pedidos", Prioridad.CRITICA);
        Incidencia inc2 = new Incidencia("Ajuste menor en el logotipo del encabezado web", Prioridad.MEDIA);

        System.out.println("--- ESTADO INICIAL DE LAS INCIDENCIAS ---");
        System.out.println(inc1);
        System.out.println();
        System.out.println(inc2);
        System.out.println();

        // 2. Intento de salto ilegal a EN_RESOLUCION sin técnico asignado
        System.out.println("--- PRUEBA: INTENTO DE AVANCE INDEBIDO ---");
        inc1.setEstado(Estado.EN_RESOLUCION);
        System.out.println();

        // 3. Flujo completo en la primera incidencia
        System.out.println("--- FLUJO COMPLETO EN LA INCIDENCIA 1 ---");
        inc1.setTecnico("Laura Gómez");
        System.out.printf("Técnico asignado. Estado actual: %s (Técnico: %s)\n", inc1.getEstado(), inc1.getTecnico());

        inc1.setEstado(Estado.EN_RESOLUCION);
        System.out.printf("Paso a resolución. Estado actual: %s\n", inc1.getEstado());

        inc1.setEstado(Estado.CERRADA);
        System.out.printf("Cierre completado. Estado actual: %s\n", inc1.getEstado());
        System.out.println();

        // 4. Mostrar información final de ambas incidencias
        System.out.println("--- FICHA FINAL DE AMBAS INCIDENCIAS ---");
        System.out.println(inc1);
        System.out.println();
        System.out.println(inc2);
        
        // 5. No se puede cerrar directamente una incidencia sin pasar por estado EN_RESOLUCION
        inc2.setTecnico("Miguel Ángel Ortiz");
        inc2.setEstado(Estado.CERRADA);
    }
}