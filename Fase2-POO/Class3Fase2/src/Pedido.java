public class Pedido {
    private Usuario cliente;
    private Producto item;

    public Pedido(Usuario cliente, Producto item) {
        this.cliente = cliente;
        this.item = item;
    }

    public void facturar() {
        System.out.println("Boleta para: " + this.cliente.getNombre() + " | Compro: " + this.item.getProducto() + " | Total: $" + this.item.getPrecio());
    }

    public void facturarPro() {
        // El facturar normal solo me deja cargar un producto. Este pro me permite concatenar Strings
        StringBuilder sb = new StringBuilder();

        sb.append("Boleto para: ").append(this.cliente.getNombre());
        sb.append(" | Compro: ").append(this.item.getProducto());
        sb.append(" | Costo: $").append(this.item.getPrecio());

        System.out.println(sb.toString());
    }
}
