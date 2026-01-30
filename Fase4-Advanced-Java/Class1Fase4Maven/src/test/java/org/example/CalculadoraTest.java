package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calcu;

    @BeforeEach
    void setUp() {
        calcu = new Calculadora();
    }

    @Test
    void testSuma() {
        // 1. GIVEN (Dado): Preparamos el escenario
        //Calculadora calcu = new Calculadora(); -> Si en algun momento el contructor cambia debemos cambiar todos las lineas estas, por eso lo declaro arriba.
        // 2. WHEN (Cuando): Ejecutamos la acción
        int resultado = calcu.sumar(2, 3);
        // 3. THEN (Entonces): Validamos el resultado
        // assertEquals(LO_QUE_ESPERO, LO_QUE_DIO);
        assertEquals(5, resultado, "La suma de 2 + 3 deberia dar 5");
    }

    @Test
    void testResta() {
        //Calculadora c = new Calculadora();

        int res = calcu.restar(2, 3);

        assertEquals("-1", res, "-1 falla porq lo paso como string en este caso");
    }
    // Lo tengo mal a proposito.

    //NEGATIVE TEST
    @Test
    void testDivision() {
        //Calculadora c = new Calculadora();
        assertThrows(ArithmeticException.class, () -> {
            calcu.dividir(10, 0);
        });
    }
}
