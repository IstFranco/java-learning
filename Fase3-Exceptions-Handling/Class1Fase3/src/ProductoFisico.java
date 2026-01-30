public class ProductoFisico extends Producto {
    private Double peso;

    public ProductoFisico(String nombre, Double precio, Double peso) {
        super(nombre, precio);
        this.peso = peso;
    }

    @Override
    public Double getPrecioVenta() {
        if (peso < 0.0) {
            System.out.println("El peso no puede ser negativo");
            return 1.0;
        }
        if (peso < 2.0) {
            Double costoEnvio = 250.0;
            return getPrecio() + costoEnvio;
        } else {
            Double costoEnvio = 500.0;
            return getPrecio() + costoEnvio;
        }
    }

    @Override
    public void enviar(String direccion) {
        System.out.println("Enviando paquete a " + direccion + "... Peso: " + this.peso);
    }
}
