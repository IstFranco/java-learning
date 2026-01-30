import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Empresa {
    private Map<String, Trabajador> staff;

    public Empresa() {
        this.staff = new HashMap<>();
    }

    public void contratar(Trabajador t) {
        staff.put(t.getLegajo(), t);
        System.out.println("Contratado: " + t.getNombre() + "\n");
    }

    public void exportarEmpleados() {
        try (FileWriter escritor = new FileWriter("empleados.txt")) {
            for(Trabajador t : this.staff.values()) {
                escritor.write("Nuevo trabajador: " + t.getNombre() + ", legajo: " + t.getLegajo() + ", sueldo: " + t.calcularSueldo() + "\n");
                System.out.println("Datos guardados en empleados.txt");
            }
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
