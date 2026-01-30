public class Main {
    public static void main(String[] args) {
        //La clase instancia de personaje la comento porq me tira error en new logicamente.
        // Personaje pers = new Personaje("Larry", 9);
        Guerrero guer = new Guerrero("Hercules", 45);
        Personaje guerrero = new Guerrero("Thor", 99);
        Mago maguito = new Mago("Dumbledore", 85);
        Personaje mago = new Mago("Doctor strange", 70);

        guer.mostrarDatos();
        guerrero.mostrarDatos();
        maguito.mostrarDatos();
        mago.mostrarDatos();
        System.out.println("-------------------");
        guer.atacar();
        guerrero.atacar();
        maguito.atacar();
        mago.atacar();
    }
}
