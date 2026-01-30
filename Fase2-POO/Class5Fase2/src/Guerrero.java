public class Guerrero extends Personaje{

    public Guerrero(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void atacar() {
        System.out.println("El gerrero " + getNombre() + " ataca con espada!");
    }
}
