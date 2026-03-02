package com.franco.conceptorelaciones.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inscripcion {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    //---------------------------------
    // FOREING KEYS DE TABLA INTERMEDIA
    @ManyToOne
    @JoinColumn(name = "equipo_id")
    private Equipo equipo;

    @ManyToOne
    @JoinColumn(name = "torneo_id")
    private Torneo torneo;
    // FIN FOREING KEYS
    //----------------------------------

    private LocalDate fechaInscripcion;
    private boolean cuotaPagada;
}
