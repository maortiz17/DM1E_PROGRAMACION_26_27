package es.maos17.cdr.programacion.ut04.ejercicios.arrays.ejercicio22;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Paciente {

    private final String nombre;
    private final NivelGravedad gravedad;
    private final LocalTime horaLlegada;

    private static final DateTimeFormatter FORMATEADOR = DateTimeFormatter.ofPattern("HH:mm:ss");

    public Paciente(String nombre, NivelGravedad gravedad) {
        // Validación de datos
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre.trim();
        } else {
            this.nombre = "";
        }

        if (gravedad != null) {
            this.gravedad = gravedad;
        } else {
            this.gravedad = NivelGravedad.BAJO;
        }

        this.horaLlegada = LocalTime.now();
    }

    public String getNombre() {
        return nombre;
    }

    public NivelGravedad getGravedad() {
        return gravedad;
    }

    public LocalTime getHoraLlegada() {
        return horaLlegada;
    }

    @Override
    public String toString() {
        return String.format("%-15s [Gravedad: %-5s | Llegada: %s]",
                nombre, gravedad, horaLlegada.format(FORMATEADOR));
    }
}