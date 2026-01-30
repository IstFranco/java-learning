public class CalculadoraFactura {
    public static void main(String[] args) {
        double precioBase = 250.50;
        double descuento = 15.00;
        double porcentajeIVA = 0.21;

        double precioFinal = (precioBase + (precioBase * porcentajeIVA)) - descuento;

        System.out.println("El precio final del producto es: " + precioFinal);
    }
}
