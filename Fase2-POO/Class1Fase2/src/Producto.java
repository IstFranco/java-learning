public class Producto {
    String titulo;
    Double precio;
    int stock;

    public void mostrarInfo() {
        System.out.println("Producto: " + titulo + "| Precio (con descuento): $" + precio + "| Stock: " + stock);
    }

    public void aplicarDescuento(Double porcentaje) {
        precio = precio - (precio*(porcentaje/100));
    }

    public Double calcularPrecioFinal(int cantidad) {
        Double precioFinal = 0.0;

        precioFinal = precio*cantidad;

        return precioFinal;
    }
}
