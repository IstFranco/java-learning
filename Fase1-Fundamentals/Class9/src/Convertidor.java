public class Convertidor {
    public static void main(String[] args) {
        String numA = "50";
        String numB = "20.5";

        int numeroA = Integer.parseInt(numA);
        double numeroB = Double.parseDouble(numB);

        double total = numeroA + numeroB;

        System.out.println("La suma es: " + total);

        String totalS = String.valueOf(total);
        int logitud = totalS.length();
    }
}
