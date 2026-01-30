public class Cine {
    public static void main(String[] args) {
        String[] asientos = new String[5];
        String[] solicitudes = {"2", "0", "dos", null, "3", "2", "10"};
        for (int i = 0; i < solicitudes.length; i++) {
            System.out.println("\nCliente " + i + " solicita asiento: " + solicitudes[i]);
            try {
                int nroAsiento = Integer.parseInt(solicitudes[i]);
                if (asientos[nroAsiento] != null) {
                    throw new Exception("Ocupado por el cliente " + asientos[nroAsiento]);
                }
                asientos[nroAsiento] = String.valueOf(i);
                System.out.println("El cliente " + i + " reservo el asiento " + nroAsiento);
            } catch (NumberFormatException e) {
                System.out.println("Formato de peticion invalida, ingreso 'dos' en lugar de '2' por ejemplo");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Solo hay 5 asientos.");
            } catch(NullPointerException e) {
                System.out.println("Datos vacios.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("--Intento finalizado para la posicion [" + i + "]--");
            }
        }
        System.out.println("\n Resumen final");
        for (int i = 0; i < asientos.length; i++) {
            String estado = (asientos[i] == null) ? "[VACIO]" : "[OCUPADO por el ciente " + asientos[i] + "]";
            System.out.println("Butaca " + i + ": " + estado);
        }
        System.out.println("\n --- Fin del programa --- ");
    }
}
