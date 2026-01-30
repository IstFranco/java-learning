public class Main {
    public static void main(String[] args) {
        String[] numeros = {"10", "5", "0", "dos", null, "32"}; //Aca no va privatre porq esta dentro del main
        for (int i = 0; i < numeros.length; i++) {
            try {
                // Esto sí daría NullPointerException si numeros[i] es null
                // porque intentas medir la longitud de la nada.
                int largo = numeros[i].length();
                int numero = Integer.parseInt(numeros[i]);
                Integer resultado = 100 / numero; // o int es lo mismo.
                //Double resultado = 100.0 / numero -> Da infinito porq es 0.0, esto no se puede hacer

                System.out.println("Procesando: 100 / " + numero + " = " + resultado);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Fuera de rango.");
            } catch (NumberFormatException e) {
                System.out.println("No es un numero. Posicion: " + i);
            } catch (NullPointerException e) {
                System.out.println("Valor nulo. Posicion: " + i);
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir por 0. Posicion: " + i);
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e);
            } finally {
                System.out.println("--Intento finalizado para la posicion [" + i + "]--");
            }
        }
    }
}
//try {
//        // 1. Chequeo de nulo (sigue igual)
//        // Si es null, explota aquí con NullPointerException
//        if (numeros[i] == null) {
//        throw new NullPointerException();
// Ojo: Podrías dejar que length() lo atrape,
// pero parseDouble a veces tira null como error de formato.
// Para este ej, asumamos que si entra null, salta la excepción.
//                }
//
// 2. Convertimos a DOUBLE para tener precisión (3.125)
//double numero = Double.parseDouble(numeros[i]);

// 3. EL SEMÁFORO MANUAL 🛑
// Como double no explota con el 0, lo hacemos explotar nosotros.
//                if (numero == 0) {
        // Aquí creamos el error artificialmente para que caiga en el catch de abajo
 //       throw new ArithmeticException();
   //             }

// 4. La división precisa
//double resultado = 100.0 / numero;

//                System.out.println("Procesando: 100 / " + numero + " = " + resultado);

//           }

// ESTO SERIA UNA VERSION QUE ACEPTA DOUBLE SIN TIRAR INFINITO EN LA DIVISION POR CERO YA QUE SE HACE DE MANERA MANUAL
