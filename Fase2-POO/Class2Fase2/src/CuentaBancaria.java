public class CuentaBancaria {
    private String titular;
    private Double saldo;

    public CuentaBancaria(String titular, Double saldo) {
        this.titular = titular;
        if(saldo<0.0) {
            this.saldo = 0.0;
            return;
        }
        this.saldo = saldo;

    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(Double monto) {
        if(monto < 0){
            System.out.println("No puede depositar montos negativos, intente nuevamente");
            return;
        }
        saldo += monto;
    }

    public void retirar(Double monto) {
        if(monto < 0) {
            System.out.println("No puede retirar montos negativos, intente nuevamente");
            return;
        }
        if(saldo<monto){
            System.out.println("No tiene tanto saldo");
            return;
        }
        saldo -= monto;

    }

    public void mostrarInfo() {
        System.out.println("Titular: " + titular + "Tiene $" + saldo + " de saldo");
    }
}
