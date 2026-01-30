public class Main {
    public static void main(String[] args) {
        Producto pf = new ProductoFisico("Teclado", 1000.0, 1.5);
        Producto pd = new ProductoDigital("E-Book Java", 500.0, 5.5);

        Carrito carrito = new Carrito();

        carrito.agregarProducto(pf);
        carrito.agregarProducto(pd);

        System.out.println("--- TOTAL A PAGAR ---");
        // Debería dar 1250 + 500 = 1750
        carrito.calcularTotal();

        System.out.println("\n--- DESPACHANDO PEDIDOS ---");
        pf.enviar("Calle Falsa 123");
        pd.enviar("franco@email.com");
    }
}
