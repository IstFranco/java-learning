package org.example;

import java.time.LocalDate;
import lombok.Data;
import lombok.AllArgsConstructor;

@Data //Esto me genera automaticamente el constructos, setters, getters y todo automaticamente en la compilacion, ocupa el mismo lugar en memoria pero no pierdo tiempo escribiendo todos los getters que no teien logica basicamente.
@AllArgsConstructor

public class Venta {
    private String id;
    private String producto;
    private Double precioUnitario;
    private int cantidad;
    private LocalDate fecha;

    // EL constructor y los getters (el toString y eso tambien) ya esta hecho en @Data.

    public double calcularTotal() {
        return precioUnitario * cantidad;
    }
}
