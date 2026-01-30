public class ControlAcceso {
    public static void main(String[] args) {
        String usuario = "Franco";
        String clave = "1234";
        boolean activo = true;

        if(!activo) {
            System.out.println("Cuenta bloqueada");
            return;//Aquí se termina el main.
        }
        if(usuario.equals("Franco") && clave.equals("1234")) {
            System.out.println("Bienvenido al sistema");
        } else {
            System.out.println("Credenciales incorrectas");
        }
    }
}
