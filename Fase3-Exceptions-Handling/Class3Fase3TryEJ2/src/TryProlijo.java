public class TryProlijo {
    public static void main(String[] args) {
        try {
            int[] numeros = {10, 0};
            int resultado = numeros[0] / numeros[1];
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Te fuiste del rengo del array.");
        } catch (Exception e) {
            System.out.println("Ocurrio un error inesperado: " + e);
        }
    }
}
