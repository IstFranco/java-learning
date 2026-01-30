import java.util.HashMap;
import java.util.Map;

public class Plataforma {

    private Map<String, Usuario> baseDeDatos;

    public Plataforma() {
        this.baseDeDatos = new HashMap<>();
        System.out.println("Sistema iniciado. Base de datos vacia lista.");
    }

    public void registrarUsuario(Usuario u) {
        baseDeDatos.put(u.getEmail(), u);
        System.out.println("Usuario: " + u.getNombre() + " guardado exitosamente");
    }

    public Usuario buscarPorEmail(String email) {
        // O(1) -> Busca directo el mail que le pasamos, no itera sobre la colleccion de usuarios, entonces es instantaneo.
        return baseDeDatos.get(email);
    }

    //TODO: funcion eliminarUsuario(String email) {
    // }

    //TODO: funcion listar todos los usuarios
}
