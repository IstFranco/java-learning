public class Carrito {
    private Producto prod1;
    private Producto prod2;
    private Producto prod3;

    public Carrito() {}

    public void agregarProducto(Producto p) {
        if (prod1 == null) {
            prod1 = p;
        } else if (prod2 == null) {
            prod2 = p;
        } else if (prod3 == null) {
            prod3 = p;
        } else {
            System.out.println("Carrito lleno");
        }
    }

    public Double calcularTotal() {
        Double precioFinal = 0.0;
        if( prod1 != null ) {
            precioFinal = precioFinal + prod1.getPrecioVenta();
        }
        if( prod2 != null ) {
            precioFinal = precioFinal + prod2.getPrecioVenta();
        }
        if( prod3 != null ) {
            precioFinal = precioFinal + prod3.getPrecioVenta();
        }
        System.out.println(precioFinal);
        return precioFinal;
    }
}
