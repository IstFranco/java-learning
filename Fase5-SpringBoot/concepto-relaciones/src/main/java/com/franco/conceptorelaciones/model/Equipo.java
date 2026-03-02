package com.franco.conceptorelaciones.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

import static jakarta.persistence.CascadeType.ALL;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String ciudad;

    // mappedBy = "equipo": Le dice a Java "No crees una tabla intermedia,
    // la relación ya la maneja el atributo 'equipo' en la otra clase".
    // cascade = CascadeType.ALL: Si borro el Equipo, se borran sus Jugadores (no es obligatorio, pero estoy probando cosas, asiq lo voy a poner).
    @OneToMany(mappedBy = "equipo", cascade = ALL)
    private List<Jugador> jugadores;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Tecnico_id") // Crea una FK en la tabla Equipo
    private Tecnico tecnico;

    @OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Inscripcion> inscripcions;
}
