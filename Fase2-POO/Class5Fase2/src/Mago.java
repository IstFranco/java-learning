public class Mago extends Personaje implements Atacante {

    public Mago(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void atacar() {
        System.out.println("El mago " + getNombre() + " lanza una bola de fuego!");
    }
}
