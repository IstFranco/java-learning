import java.util.ArrayList;
import java.util.List;

public class Carrito {
    //private Producto prod1;
    //private Producto prod2;
    //private Producto prod3;
    List<Producto> productos;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    int i = 0;
    public void agregarProducto(Producto p) {
        //if (prod1 == null) {
        //    prod1 = p;
        //} else if (prod2 == null) {
        //    prod2 = p;
        //} else if (prod3 == null) {
        //    prod3 = p;
        //} else {
        //    System.out.println("Carrito lleno");
        productos.add(p);
        System.out.println("Agregando: " + p.toString() + " | En la posicion " + i);
        i += 1;
    }

    public Double calcularTotal() {
        Double precioFinal = 0.0;
        //if( prod1 != null ) {
        //    precioFinal = precioFinal + prod1.getPrecioVenta();
        //}
        //if( prod2 != null ) {
        //   precioFinal = precioFinal + prod2.getPrecioVenta();
        //}
        //if( prod3 != null ) {
        //    precioFinal = precioFinal + prod3.getPrecioVenta();
        //}
        for(Producto producto : productos) {
            precioFinal = precioFinal + producto.getPrecioVenta();
        }
        System.out.println(precioFinal);
        return precioFinal;
    }

    public void quitarProducto(int indice){
        productos.remove(indice);
        System.out.println("Objeto en la posicion " + indice + " eliminado del carrito");
    }
}
