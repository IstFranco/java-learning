public abstract class Producto implements Enviable {
    protected String nombre;
    protected Double precio;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public abstract Double getPrecioVenta();

    @Override
    public String toString(){
        return "Producto: " + this.nombre + " | Precio base: $" + this.precio;
    }
}
