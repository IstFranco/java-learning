package com.franco.conceptorelaciones.repository;

import com.franco.conceptorelaciones.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JugadorRepository extends JpaRepository<Jugador, Long> {
}
