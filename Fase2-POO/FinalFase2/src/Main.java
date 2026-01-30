public class Main {
    public static void main(String[] args) {
        System.out.println("=== 🏦 BIENVENIDO A BANCO JAVA 🏦 ===\n");

        // 1. POLIMORFISMO: Declaro tipo 'Cuenta', instancio hijos distintos.
        Cuenta cuentaFranco = new CajaAhorro(10000.0, "FRANCO.CA");
        Cuenta cuentaCarolina = new CuentaCorriente(10000.0, "CAROLINA.CC");

        System.out.println("--- 💸 TEST DE TRANSFERENCIA ---");

        // CAJA AHORRO: Debería descontar solo 1000
        System.out.println("\nFranco transfiere $1000:");
        cuentaFranco.transferir(1000.0, "DESTINO.X");

        System.out.println("\nFranco quiere tranferir $50.000");
        cuentaFranco.transferir(50000.0, "Patricio");

        // CUENTA CORRIENTE: Debería descontar 1000 + 10 (impuesto) = 1010
        System.out.println("\nCarolina transfiere $1000:");
        cuentaCarolina.transferir(1000.0, "DESTINO.X");

        System.out.println("\n--- 📉 TEST DE MANTENIMIENTO ---");

        System.out.println("\nCobrando a Franco:");
        cuentaFranco.cobrarComision(); // Imprime que es gratis

        System.out.println("\nCobrando a Carolina:");
        cuentaCarolina.cobrarComision();   // Resta 500

        System.out.println("\nFranco ingresa $500");
        cuentaFranco.depositar(500.0);

        System.out.println("\n--- 📊 SALDOS FINALES ---");
        // Franco: 10000 - 1000 + 500 = 9500
        System.out.println("Saldo Franco: $" + cuentaFranco.getSaldo());
        // Carolina: 10000 - 1010 - 500 = 8490
        System.out.println("Saldo Caronina: $" + cuentaCarolina.getSaldo());
    }
}