import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LectorArchivos {
     public static void main(String[] args) {
         File archivo = new File("datos.txt");

         try {
             Scanner lector = new Scanner(archivo);
             while (lector.hasNextLine()) {
                 String linea = lector.nextLine();
                 System.out.println("Leido: " + linea);
             }
             Scanner lectorSimple = new Scanner(archivo);
             String linea1 = lectorSimple.nextLine();
             System.out.println(linea1);

             lector.close();
         } catch (FileNotFoundException e) {
             System.out.println("Error: No se encontro el archivo.");
         }
     }
}
