public class cocina {
    // El método espera algo y lo bautiza temporalmente como "fruta"
    public static void licuar(String fruta) {
        System.out.println("Licuando la " + fruta + "...");
    }

    public static void main(String[] args) {
        String manzana = "Manzana Roja";
        String banana = "Banana";

        // Aquí se llama "manzana", pero al entrar al método se llamará "fruta"
        licuar(manzana);

        // Aquí se llama "banana", pero al entrar al método TAMBIÉN se llamará "fruta"
        licuar(banana);
    }
}
