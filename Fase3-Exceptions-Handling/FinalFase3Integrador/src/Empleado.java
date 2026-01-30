public class Empleado implements Trabajador {
    private String legajo;
    private String nombre;
    private Double sueldo;

    public Empleado(String legajo, String nombre, Double sueldo) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    @Override
    public String getLegajo() { return legajo; }
    @Override
    public String getNombre() { return nombre; }
    @Override
    public Double calcularSueldo() { return sueldo; }
}