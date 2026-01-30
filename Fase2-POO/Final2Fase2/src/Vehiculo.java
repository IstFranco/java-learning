public abstract class Vehiculo {
    protected Chofer chofer;
    protected String patente;
    protected static Double tarifaBase = 1000.0;

    public Vehiculo(Chofer chof, String pat) {
        this.chofer = chof;
        this.patente = pat;
    }

    public Chofer getChofer() {
        return this.chofer;
    }

    public String getPatente() {
        return this.patente;
    }

    public abstract Double calcularPrecioViaje(double km);
}
