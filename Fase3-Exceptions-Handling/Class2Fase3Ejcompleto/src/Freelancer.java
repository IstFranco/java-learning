public class Freelancer implements Trabajador{
    private String legajo;
    private String nombre;
    private Double valorHora;
    private Double horasTrabajadas;

    public Freelancer(String legajo, String nombre, Double valorHora, Double horasTrabajadas) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String getLegajo() {
        return legajo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public Double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    @Override
    public Double calcularSueldo() {
        return valorHora * horasTrabajadas;
    }
}
