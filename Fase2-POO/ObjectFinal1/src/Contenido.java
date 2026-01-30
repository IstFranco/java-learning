public abstract class Contenido implements Reproducible {
    protected String titulo;
    protected Integer duracionMin;

    public Contenido(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracionMin = duracion;
    }

    public abstract void verDetalle(); //metodo abstracto, para instanciarlo debera sobreescribirlo cada clase, asiq ni me esfuerzo en definirlo genericamente
    public void reproducir() {}
    //public void pausar() {} - con definirlo asi alcanza ya qque si o si tengo que implementar todos los metodos de la interfaz, aunque sea abstractos
    public void pausar() {
        System.out.println("Pausado");
    }
}
