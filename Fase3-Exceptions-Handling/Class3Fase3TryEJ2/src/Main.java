public class Main {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;

        System.out.println("Dividiendo...");

        try {
            int resultado = n1 / n2;
            System.out.println("El resultado es: " + resultado);
        }
        catch (Exception e) {
            System.out.println("Error matematico detectado!");
            System.out.println("Reporte tecnico: " + e);
        }

        System.out.println("Fin del programa.");
    }
}
