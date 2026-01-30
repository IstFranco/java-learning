import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorArchivos {
    public static void main(String[] args) {
        try {// El 'true' activa el modo APPEND (no borra lo anterior), sin el true pisamos todo lo que ya teniamos. MUY IMPORTANTE
            FileWriter escritor = new FileWriter("datos.txt", true);

            escritor.write("\n Franco estuvo aqui programando en java.");
            System.out.println("Escritura exitosa");

            escritor.close();
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
        //try (FileWriter escritor = new FileWriter("datos.txt", true)) {
        //
        //    escritor.write("\nFranco estuvo aqui programando en Java");
        //    System.out.println("Escritura exitosa.");
        //
        //} catch (IOException e) {
        //    System.out.println("Error al escribir: " + e.getMessage());
        //}


        //FileWriter escritor = null; // Declarar afuera
        //try {
        //    escritor = new FileWriter("datos.txt", true);
        //    escritor.write("Texto");
        //} catch (IOException e) {
        //    e.printStackTrace();
        //} finally {
        //    // ESTO OCURRE SIEMPRE: Éxito o Error.
        //    try {
        //        if (escritor != null) escritor.close();
        //    } catch (IOException e) {
        //        // Manejo de error al cerrar
        //    }
        //}
    }
}
