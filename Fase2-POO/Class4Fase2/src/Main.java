public class Main {
    public static void main(String[] args) {
        //Creo un auto y una moto
        Auto auto = new Auto("Ferrari");
        Moto moto = new Moto("Zanella");

        //Creo un vehiculo generico. Esto lo puedo hacer porq no es abstracta. Eso lo veo en la siguiente clase.
        Vehiculo v = new Vehiculo("Generico");
        //En la vida real no puedo instanciar un vehiculo, solo puedo instanciar los hijos.

        //Invoco los metodos
        auto.acelerar();
        moto.acelerar();
        v.acelerar();
    }
}
