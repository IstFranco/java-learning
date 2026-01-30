public class GestorVentas {
    public static double calcularPromedio(double[] ventas) {
        double total=0;
        for(int i=0; i<ventas.length; i++) {
            total = total + ventas[i];
        }
        //for(double venta : ventas) {
        //    total += venta
        // }
        return total/ventas.length;
    }

    public static double obtenerMax(double[] ventas) {
        double maxNum = ventas[0];
        for (int i=0; i<ventas.length; i++) {
            if(maxNum < ventas[i]) {
                maxNum = ventas[i];
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        double[] ventas = {1200.50, 850.00, 2300.00, 1900.25, 450.00};

        double promedio = calcularPromedio(ventas);
        double max = obtenerMax(ventas);

        System.out.println("Promedio de ventas: " + promedio + ". Venta maxima: " + max);
    }
}
