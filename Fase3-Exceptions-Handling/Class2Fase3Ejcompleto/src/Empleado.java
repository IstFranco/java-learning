public class Empleado implements Trabajador{
    private String legajo;
    private String nombre;
    private Double sueldo;

    public Empleado(String legajo, String nombre, Double sueldo) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getLegajo() { return legajo; }
    public String getNombre() { return nombre; }
    public Double getSueldo() { return sueldo; }

    @Override
    public String toString() {
        return nombre + " [" + legajo + "] - $" + sueldo;
    }

    @Override
    public Double calcularSueldo() {
        return sueldo;
    }
}
