public class ConexionBaseDatos {
    public static void main(String[] args) {
        int intentosMaximos = 3;
        boolean conectado = false;

        int i = 1; //empieza desde 1 y no desde cero para que se imprima bien
        while(i <= intentosMaximos && !conectado){
            System.out.println("Intento de conexion: #" + i);

            if(conectado){
                System.out.println("Exito");
                break;
            }
            else{
               System.out.println("Fallo... reintentando");
            }
            i += 1; // i++
        }
        System.out.println("Numero maximo de intentos alcanzados");

        //for(i=0;i<intentosMaximos;i++){
        //    System.out.println("Intento de conexion: #" + i+1);

        //    if(conectado) {
        //        System.out.println("Exito");
        //        break;
        //    } else {
        //        System.out.println("Fallo... reintentando");
        //    }
        //}
    }
}
