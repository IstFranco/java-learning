package com.franco.conceptorelaciones.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Integer numeroCamiseta;

    // @ManyToOne: Muchos jugadores pertenecen a un equipo.
    // @JoinColumn: Así se va a llamar la columna en la base de datos (equipo_id).
    @ManyToOne
    @JoinColumn(name = "equipo_id")
    @JsonIgnore //Esto evita un bucle, hya que se va a devolver el equipo con los jugadores, cada juagdor del equipo, el equipo con sus jugadores y asi sucesivamente.
    private Equipo equipo;
}
