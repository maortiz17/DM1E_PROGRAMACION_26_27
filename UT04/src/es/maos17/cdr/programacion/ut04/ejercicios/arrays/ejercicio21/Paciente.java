package es.maos17.cdr.programacion.ut04.ejercicios.arrays.ejercicio21;

public class Paciente {

    private final String nombre;
    private final NivelGravedad gravedad;

    public Paciente(String nombre, NivelGravedad gravedad) {
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
    }

    public String getNombre() {
        return nombre;
    }

    public NivelGravedad getGravedad() {
        return gravedad;
    }

    @Override
    public String toString() {
        return String.format("%-15s [Gravedad: %-5s]", nombre, gravedad);
    }
}