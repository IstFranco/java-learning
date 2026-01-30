public class Main {
    public static void main(String[] args) {
        Empresa miEmpresa = new Empresa();

        System.out.println("--- Contratando personal ---");
        miEmpresa.contratar(new Empleado("E001", "Franco", 5000.0));
        miEmpresa.contratar(new Freelancer("F001", "Carolina", 7500.0, 20.0));
        miEmpresa.contratar(new Empleado("E002", "Messi", 10000.0));

        System.out.println("\n--- Exportando base de datos a TXT ---");
        miEmpresa.exportarEmpleados();

        System.out.println("Proceso terminado. Revisa el archivo empleados.txt");
    }
}
