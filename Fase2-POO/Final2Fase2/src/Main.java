public class Main {
    public static void main(String[] args) {
        Chofer c = new Chofer("Jorge", "random");
        Vehiculo auto = new Auto(c, "aaa111");

        System.out.println("--- VIAJE 1 (Tarifa Normal) ---");
        auto.calcularPrecioViaje(10.0); // 1000 + (10*50) = 1500

        // ACÁ ESTÁ LA MAGIA STATIC
        // No toco el objeto 'auto'. Toco la CLASE Vehiculo.
        System.out.println("\n--- 📈 INFLACIÓN REPENTINA ---");
        Vehiculo.tarifaBase = 5000.0;

        System.out.println("--- VIAJE 2 (Mismo auto, nueva tarifa) ---");
        // El auto "se enteró" del cambio sin que le dijéramos nada
        auto.calcularPrecioViaje(10.0); // 5000 + (10*50) = 5500

        //Ya lo probe y anda bien, pero agregue varias lineas de gpt para ver si se rompe
    }
}
