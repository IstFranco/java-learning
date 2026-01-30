package org.example;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ReporteServiceTest {

    private ReporteService reporteService;
    private List<Venta> ventasDePrueba;
    private Faker faker;

    @BeforeEach
    void setUp() {
        reporteService = new ReporteService();
        faker = new Faker();
        ventasDePrueba = new ArrayList<>();

        // Venta 1: "Mouse" barato (Total: 10 * 100 = 1000)
        ventasDePrueba.add(new Venta(
                faker.idNumber().valid(), // ID random (no importa)
                "Mouse",
                100.0,
                10,
                LocalDate.now()
        ));

        // Venta 2: "Teclado" caro (Total: 1 * 5000 = 5000)
        ventasDePrueba.add(new Venta(
                faker.idNumber().valid(),
                "Teclado",
                5000.0,
                1,
                LocalDate.now()
        ));

        // Venta 3: Otro "Mouse" (Total: 2 * 100 = 200)
        ventasDePrueba.add(new Venta(
                faker.idNumber().valid(),
                "Mouse",
                100.0,
                2,
                LocalDate.now()
        ));
    }

    @Test
    void testCalcularTotalGenerado() {
        double resultado = reporteService.calcularTotalGenerado(ventasDePrueba);
        assertEquals(6200, resultado, "El resultado deberia ser 6200");
    }

    @Test
    void testObtenerVentasMayonesA() {
        List<Venta> resultado = reporteService.obtenerVentasMayoresA(ventasDePrueba, 2000);
        assertEquals(1, resultado.size());
        assertEquals("Teclado", resultado.get(0).getProducto());
    }

    @Test
    void testContarVentasDeProducto() {
        long cantidad = reporteService.contarVentasDeProducto(ventasDePrueba, "Mouse");
        assertEquals(2, cantidad);
    }
}
