package com.franco.gestorcontactos.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    @Column(unique = true, nullable = false)
    private String dni;

    @Column(unique = true, nullable = false)
    private String email;
    @Column(unique = true, nullable = false)
    private String telefono;

    private String calle;
    private String nro;
}
