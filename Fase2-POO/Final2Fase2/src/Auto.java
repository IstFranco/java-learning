public class Auto extends Vehiculo {

    public Auto(Chofer chofer, String pat) {
        super(chofer, pat);
    }

    @Override
    public Double calcularPrecioViaje(double km) {
        Double precio = tarifaBase + (km * 50);
        System.out.println(precio);
        return precio;
    }
}
