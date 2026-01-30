public class Main {
    public static void main(String[] args) {
        Reproducible miNetflix = new Pelicula("Toy Story", 90, "Pixar");

        miNetflix.reproducir();
        // miNetflix.verDetalle(); Esto no funciona ya que solo implementa los metodos de la interfaz
    }
}
