public class Pelicula extends Contenido {

    private String estudio;

    public Pelicula(String titulo, int duracion, String estudio) {
        super(titulo, duracion);
        this.estudio = estudio;

    }

    @Override
    public void verDetalle() {
        System.out.println("Pelicula: " + this.titulo + " - Hecha por " + this.estudio);
    }

    @Override
    public void reproducir() {
        System.out.println("Iniciando pelicula... agarra los pochoclos!");
    }
}
