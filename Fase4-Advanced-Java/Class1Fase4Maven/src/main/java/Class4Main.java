import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;

public class Class4Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        List<Persona> listaPersonas = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            listaPersonas.add(new Persona(
                    faker.name().firstName(),
                    faker.number().numberBetween(1, 90)
            ));
        }

        System.out.println("Total de personas generadas: " + listaPersonas.size());

        //Busco guardar en una lista aparte el nombre de las personas menores de 18 años.
        List<String> nombresMenores = new ArrayList<>();

        for (int i = 0; i < listaPersonas.size(); i++) {
            Persona p = listaPersonas.get(i);
            if (p.getEdad() < 18) {
                nombresMenores.add(p.getNombre());
            }
        } // -> Este era el metodo viejo. Ahora existen los Java Streams que tienen sintaxis mas simplle y es lo que se usa hoy en dia.

        System.out.println("Cantidad de menores: " + nombresMenores.size());

        System.out.println("\n --- MODO STRAM ---");

        List<String> nombresMenoresStream = listaPersonas.stream()
                .filter(p -> p.getEdad() < 18) //Filtrar: Solo deja pasar los menores
                .map(p -> p.getNombre()) //Trasformar: De la persona me quedo con el nombre
                .toList();  //Empaquetar: Guarda todo en la lista nueva

        System.out.println("Menores encontrados (Stream): " + nombresMenoresStream.size());
        nombresMenoresStream.forEach(System.out::println); //FORMA RAPIDA DE IMPRIMIR
    }
}
