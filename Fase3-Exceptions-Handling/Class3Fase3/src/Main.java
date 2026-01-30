import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();

        Usuario u1 = new Usuario("u1@gmail.com", "u1", 20);
        Usuario u2 = new Usuario("elon@tesla.com", "elon", 50);

        plataforma.registrarUsuario(u1);
        plataforma.registrarUsuario(u2);

        Usuario encontrado = plataforma.buscarPorEmail("u1@gmail.com");
        System.out.println("Usuario encontrado: " + encontrado);

        Usuario falso = plataforma.buscarPorEmail("falso@gmail.com");
        System.out.println("Buscando fantasma: " + falso);
    }
}
