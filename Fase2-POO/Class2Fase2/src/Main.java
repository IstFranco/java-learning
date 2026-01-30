public class Main {
    public static void main(String[] args) {
        System.out.println("-------Test 1---------");
        CuentaBancaria cb = new CuentaBancaria("Franco", 5000.0);
        cb.mostrarInfo();

        System.out.println("--------Test 2--------");
        cb.depositar(5.7);
        cb.retirar(7000.8);
        System.out.println("Saldo actual: $" + cb.getSaldo());
        cb.retirar(4000.3);
        System.out.println("Saldo actual: $" + cb.getSaldo());

        System.out.println("\n--- TEST 4: Constructor a prueba de balas ---");
        // Intentamos crear una cuenta con deuda inicial
        CuentaBancaria cuentaTramposa = new CuentaBancaria("Usuario Tramposo", -5000.0);
        // Si tu constructor valida, el saldo debería ser 0.0, no -5000
        cuentaTramposa.mostrarInfo();
    }
}
