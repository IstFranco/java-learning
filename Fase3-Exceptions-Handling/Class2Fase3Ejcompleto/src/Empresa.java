import java.util.HashMap;
import java.util.Map;

public class Empresa {
    private Map<String, Empleado> baseDeDatos;

    public Empresa() {
        this.baseDeDatos = new HashMap<>();
        System.out.println("Base de datos vacia iniciada");
    }

    public void contratar(Empleado e) {
        baseDeDatos.put(e.getLegajo(), e);
        System.out.println(e.getNombre() + " contratado exitosamente.");
    }

    public void despedir(String legajo) {
        baseDeDatos.remove(legajo);
        System.out.println(legajo + " despedido");
    }

    public Empleado verFicha(String legajo) {
        return baseDeDatos.get(legajo);
    }
}
