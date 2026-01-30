package com.franco.primerapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data              // Crea Getters, Setters, toString, etc. automágicamente
@AllArgsConstructor// Crea el constructor con todos los argumentos
public class Producto {
    private int id;
    private String nombre;
    private double precio;
}
