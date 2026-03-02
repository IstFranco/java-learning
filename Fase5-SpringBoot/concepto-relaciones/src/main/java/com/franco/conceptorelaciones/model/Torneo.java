package com.franco.conceptorelaciones.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Torneo {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String paisSede;
    private Integer premio;
    private Integer cantidadMaxEquipos;

    @OneToMany(mappedBy = "torneo", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Inscripcion> inscripciones;

}
