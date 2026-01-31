package com.franco.primerapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data              // Crea Getters, Setters, toString, etc. automágicamente
@AllArgsConstructor// Crea el constructor con todos los argumentos
@NoArgsConstructor
public class Producto {
    private Integer id;
    private String nombre;
    private double precio;
}
