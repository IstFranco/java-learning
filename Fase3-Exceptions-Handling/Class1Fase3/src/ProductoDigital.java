public class ProductoDigital extends Producto {
    private Double tamañoArchivo;

    public ProductoDigital(String nombre, Double precio, Double tamañoArchivo)  {
        super(nombre, precio);
        this.tamañoArchivo = tamañoArchivo;
    }

    @Override
    public Double getPrecioVenta() {
        return getPrecio();
    }

    @Override
    public void enviar(String direccion) {
        System.out.println("Enviando paquete a " + direccion + "... Peso: " + this.tamañoArchivo);
    }
}
