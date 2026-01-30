public class Moto extends Vehiculo {

    public Moto(Chofer cho, String patente) {
        super(cho, patente);
    }

    @Override
    public Double calcularPrecioViaje(double km) {
        Double precio = tarifaBase + (km * 20);
        System.out.println(precio);
        return precio;
    }
}
