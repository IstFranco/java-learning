public class Usuario {
    private String email;
    private String nombre;
    private int edad;

    public Usuario(String email, String nombre, int edad) {
        this.email = email;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getEmail() { return email; }
    public String getNombre() {return nombre; }

    @Override
    public String toString() {
        return "Usuario: " + nombre + " (" + email + ")";
    }
}
