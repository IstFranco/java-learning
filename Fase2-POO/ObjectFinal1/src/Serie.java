public class Serie extends Contenido {

    private Integer temporadas;

    public Serie (String titulo, int duracion, int temporadas) {
        super(titulo, duracion);
        this.temporadas = temporadas;
    }

    @Override
    public void verDetalle() {
        System.out.println("Serie: " + this.titulo + " - " + this.temporadas + " temporadas.");
    }


    @Override
    public void reproducir() {
        System.out.println("Reproduciondo serie... santando intro.");
    }
}
