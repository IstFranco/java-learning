public class Main {
    public static void main(String[] args) {
        Empresa globant = new Empresa();

        Empleado e1 = new Empleado("A001", "Franco", 750000.0);
        Empleado e2 = new Empleado("A002", "Messi", 650000.0);
        Empleado e3 = new Empleado("A003", "Pepe", 850000.0);

        globant.contratar(e1);
        globant.contratar(e2);
        globant.contratar(e3);

        System.out.println("Ficha de Messi: ");
        System.out.println(globant.verFicha("A002"));

        globant.despedir("A001");

        System.out.println("FICHA DE FRANCO (DESPEDIDO)");
        System.out.println(globant.verFicha("A001"));
    }
}
