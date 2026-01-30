public class ValidadorBancario {
    public static Double procesarSaldo(String entrada) {
        // split("|") -> entrada[0]="1;DEPOSITO;100.00", entrada[2]="2;RETIRO;50.00" ...
        String[] entradasDivididas = entrada.split("\\|");
        Double saldo = 0.0;

        for(int i=0; i<entradasDivididas.length; i++) {
            try{
                //split(";")
                //iteracion 1: datosDiv[0]=1, datosDiv[1]=Deposito, datosDiv[2]=100.00
                //iteracion 2: datosDiv[0]=2, datosDiv[1]=Retiro, datosDiv[2]=50.00
                //iterancion n: ...
                String[] datosDiv = entradasDivididas[i].split(";");
                int id = Integer.parseInt(datosDiv[0].trim());
                String tipoOpe = datosDiv[1].trim();
                Double monto = Double.parseDouble(datosDiv[2].trim());
                if(id!=1){
                    continue;
                }
                if(tipoOpe.equals("DEPOSITO")) {
                    saldo += monto;
                } else if(tipoOpe.equals("RETIRO")) {
                    saldo -= monto;
                }
            }
            catch(NumberFormatException e) {
                System.out.println("Error de operacion (" + entradasDivididas[i] + "), saltando a la siguiente");
            }
        }

        System.out.println("El saldo del cliente 1 es: $" + saldo);

        return saldo;
    }

    public static void main(String[] args) {
        String entrada = "1;DEPOSITO;100.00|2;RETIRO;50.00|1;RETIRO;30.00|3;ERROR;XX|1;DEPOSITO;20.50";

        procesarSaldo(entrada);
    }
}
