package com.franco.gestortareas.model;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descripcion;
    @Enumerated(EnumType.STRING)
    private Prioridad prioridad;
    private Boolean finalizada;
    // TODO: private Boolean finalizadaEnTiempo;
    private LocalDate fechaLimite;
    private LocalDate fechaCreacion;
    private LocalDate fechaFinalizacion;
    // TODO: private Boolean cancelada;
    // TODO: private LocalDateTime fechaCancelacion;
}
