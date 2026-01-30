public class Producto {
    private String nombre;
    private Double precio;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getProducto() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }
}
