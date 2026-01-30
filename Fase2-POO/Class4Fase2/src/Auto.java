public class Auto extends Vehiculo {

    public Auto(String marca) {
        super(marca);
    }

    @Override
    public void acelerar() {
        System.out.println("El auto " + getMarca() + " acelera pisando el pedal");
    } //Java agrega un this. invisible adelante de getMarca() para decir que ese metodo es de la clase hija, ya que heredo el metodo
}
