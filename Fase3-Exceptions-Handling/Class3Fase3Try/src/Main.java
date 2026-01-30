import java.awt.desktop.SystemSleepEvent;

public class Main {
    public static void main(String[] args) {
        int[] idsEmpleados = {101, 102, 103};
        System.out.println("Iniciando busqueda...");

        try {
            int idBuscado = idsEmpleados[5];

            System.out.println("El ID encontrado es: " + idBuscado);
        }
        catch (Exception e) {
            System.out.println("Alerta!!! No existe tal indice...");
            System.out.println("Reporte tecnico: " + e);
        }

        System.out.println("Fin del programa.");
    }
}
