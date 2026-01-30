public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(Double saldo, String cbu) {
        super(saldo, cbu);
    }

    @Override
    public void cobrarComision() {
        this.saldo -= 500;
        System.out.println("Comision por mantenimiento mensual cobrada.");
    }

    @Override
    public void transferir(Double monto, String aliasDestino) {

        Double comision = monto * 0.01;
        Double montoADescontar = monto+comision;

        if(this.saldo < montoADescontar){
            System.out.println("No tiene saldo suficiente");
            return;
        }

        this.saldo -= montoADescontar;
        System.out.println("Transferido $" + monto + " (Impuesto: $" + comision + ") a " + aliasDestino);
    }
}
