public class Tienda {
    public static void main(String[] args) {
        Producto laptop = new Producto();
        laptop.titulo = "Lenovo Legion";
        laptop.precio = 100.50;
        laptop.stock = 10;

        Producto mouse = new Producto();
        mouse.titulo = "Logitech G";
        mouse.precio = 15.0;
        mouse.stock = 45;

        laptop.aplicarDescuento(15.0);
        mouse.aplicarDescuento(20.0);

        System.out.println("---------------------------");
        laptop.mostrarInfo();
        mouse.mostrarInfo();
        System.out.println("---------------------------");

        Double totalLaptop = laptop.calcularPrecioFinal(5);
        System.out.println("Precio de 5 laptops: $" + totalLaptop);
        System.out.println("Precio de 5 mouses: $" + mouse.calcularPrecioFinal(5));
        System.out.println("---------------------------");
    }
}
