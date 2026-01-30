package org.example;

import java.util.List;
import java.util.ArrayList;

public class ReporteService {

    public double calcularTotalGenerado(List<Venta> ventas) {
        return ventas.stream()
                .mapToDouble(v -> v.calcularTotal())
                .sum();
    }

    public List<Venta> obtenerVentasMayoresA(List<Venta> ventas, double monto) {
        return ventas.stream()
                .filter(v -> v.calcularTotal() > monto)
                .toList();
    }

    public long contarVentasDeProducto(List<Venta> ventas, String nombreProducto) {
        return ventas.stream()
                .filter(v -> v.getProducto().equals(nombreProducto))
                .count();
    }
}
