public class Vehiculo {
    private String marca;

    public Vehiculo(String marcaParametro) {
        this.marca = marcaParametro; //Si yo pongo un nombre distinto de parametro no hace falta poner this., pero lo voy a dejar para naturalizarlo.
    }

    public String getMarca() {
        return marca;
    }

    public void acelerar() {
        System.out.println("El vehiculo " + this.marca + " esta acelerando");
    } // Aca la mejor practica es poner this.marca ya que evitamos cualquier tipo de problema y como getMarca() es de instancia no lo podemos llamar aca. Los Getters van en los hijos.
}
