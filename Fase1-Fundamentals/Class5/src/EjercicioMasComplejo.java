public class EjercicioMasComplejo {
    public static void main(String[] args) {
        double[] ventas= {1200.50, 850.00, 2300.00, 1900.25, 450.00};
        double totalVendido = 0;
        double prom = 0;
        double ventaMax = 0; //ventaMax = ventas[0] -> Otra forma mejor (buena practica).

        for(int i=0; i<ventas.length;i++) {
            totalVendido = totalVendido + ventas[i];
            if(ventaMax < ventas[i]) {
                ventaMax = ventas[i];
            }
        }

        prom = totalVendido/ventas.length;

        System.out.println("Total vendido en el dia:" + totalVendido);
        System.out.println("Costo promodio: " + prom);
        System.out.println("Venta maxima: " + ventaMax);
    }
}
