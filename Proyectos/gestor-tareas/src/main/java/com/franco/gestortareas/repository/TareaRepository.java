package com.franco.gestortareas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.franco.gestortareas.model.Tarea;

public interface TareaRepository extends JpaRepository<Tarea, Long> {
}
