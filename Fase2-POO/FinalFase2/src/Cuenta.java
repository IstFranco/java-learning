public abstract class Cuenta implements Transaccionable {
    protected Double saldo;
    protected String cbu;

    public Cuenta(Double saldo, String cbu) {
        this.saldo = saldo;
        this.cbu = cbu;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public String getCbu(){
        return this.cbu;
    }

    public void depositar(double monto) {
        this.saldo += monto;
    }

    public abstract void cobrarComision();

    public void retirar(Double monto) {
        if(this.saldo < monto) {
            System.out.println("No tiene saldo suficiente");
            return;
        }

        this.saldo = this.saldo - monto;
    }

    public abstract void transferir(Double monto, String aliasDestino);
}
