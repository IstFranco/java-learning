public class main {
    public static void main(String[] args) {
        Usuario user = new Usuario("Franco", "fcrack@gmail.com");
        Producto prod = new Producto("Teclado mecanico", 1500.25);

        Pedido pedido1 = new Pedido(user, prod);

        pedido1.facturar();

        pedido1.facturarPro();
    }
}
