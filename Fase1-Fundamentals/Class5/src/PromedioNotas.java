public class PromedioNotas {
    public static void main(String[] args) {

        double[] notas = {8.5, 9.0, 7.5, 10.0, 6.0};
        double sumaTotal = 0;

        for(int i=0;i<notas.length;i++) {
            sumaTotal = sumaTotal + notas[i];
        }

        double promedio = sumaTotal/notas.length;

        System.out.println("El promedio final es: " + promedio);
    }
}
