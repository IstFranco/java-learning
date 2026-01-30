public class CajaAhorro extends Cuenta{

    public CajaAhorro(Double saldo, String cbu) {
        super(saldo, cbu);
    }

    @Override
    public void cobrarComision() {
        System.out.println("En caja de ahorros no se cobran comisiones");
    }

    @Override
    public void transferir(Double monto, String aliasDestino) {
        if(saldo < monto) {
            System.out.println("No tiene suficiente saldo, " + aliasDestino + " no recibira el dinero");
            return;
        }
        this.saldo -= monto;
        System.out.println("Transferido a " + aliasDestino);
    }

}
