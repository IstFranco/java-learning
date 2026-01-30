import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();

        System.out.println("--- Generando datos falsos ---");

        String nombre = faker.name().fullName();
        String calle = faker.address().streetName();
        String comida = faker.food().dish();
        String chuck = faker.chuckNorris().fact();

        System.out.println("Cliente: " + nombre);
        System.out.println("Dirección: " + calle);
        System.out.println("Pedido: " + comida);
        System.out.println("\nSabías que... " + chuck);
    }
}
