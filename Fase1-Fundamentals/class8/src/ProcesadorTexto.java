public class ProcesadorTexto {
    public static void main(String[] args) {
        String nombreCompleto = " fRaNcO oYhEnArT ";
        //String nombreCorregido = nombreCompleto.trim().toUpperCase().substring(0, 6); asi queda harcodeado. Es mala practica claramente
        String nombreNormalizado = nombreCompleto.trim().toUpperCase();
        int posicionEspacio = nombreNormalizado.indexOf(" "); //En este caso devuelve 6 porq mi nombre tiene 6 letras.
        // Java cuenta: F(0) R(1) A(2) N(3) C(4) O(5) Espacio(6).
        String soloNombre = nombreNormalizado.substring(0, posicionEspacio);

        System.out.println("Nombre mal: " + nombreCompleto);
        System.out.println("Nombre corregido: " + soloNombre);

    }
}
