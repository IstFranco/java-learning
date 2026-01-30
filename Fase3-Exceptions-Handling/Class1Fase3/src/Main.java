public class Main {
    public static void main(String[] args) {
        System.out.println("=== 🛒 INICIANDO COMPRAS DINÁMICAS ===\n");

        // 1. Creación de Productos
        Producto teclado = new ProductoFisico("Teclado Gamer", 1000.0, 1.5);
        Producto mouse   = new ProductoFisico("Mouse Pro", 500.0, 0.2); // Liviano, envio barato
        Producto monitor = new ProductoFisico("Monitor 24", 2000.0, 5.0); // Pesado, envio caro
        Producto ebook   = new ProductoDigital("Aprende Java en 21 dias", 300.0, 10.0);
        Producto curso   = new ProductoDigital("Curso Spring Boot", 1500.0, 500.0);

        // 2. Llenamos el carrito sin miedo al límite
        Carrito carrito = new Carrito();

        carrito.agregarProducto(teclado); // índice 0
        carrito.agregarProducto(mouse);   // índice 1
        carrito.agregarProducto(monitor); // índice 2
        carrito.agregarProducto(ebook);   // índice 3
        carrito.agregarProducto(curso);   // índice 4 (¡Antes esto rompía todo!)

        // 3. Primer cálculo
        System.out.println("\n--- 💰 TOTAL PARCIAL ---");
        System.out.println("Total: $" + carrito.calcularTotal());

        // 4. Probando el Remove
        System.out.println("\n--- ❌ ARREPENTIMIENTO ---");
        // Vamos a sacar el Monitor (que está en el índice 2) porque es muy caro
        carrito.quitarProducto(2);

        // 5. Verificamos que todo siga funcionando
        System.out.println("\n--- 💰 TOTAL FINAL ---");
        System.out.println("Total actualizado: $" + carrito.calcularTotal());

        System.out.println("\n--- 🚚 FINALIZANDO COMPRA ---");
        // Tip: Si quisieras enviar todos, podrías hacer un método en Carrito 'enviarTodo()'
        // Pero por ahora lo hacemos manual para cerrar el ejercicio.
        teclado.enviar("Casa de Franco");
        curso.enviar("franco@email.com");
    }
}
