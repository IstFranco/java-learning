package com.franco.conceptorelaciones.repository;

import com.franco.conceptorelaciones.model.Torneo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TorneoRepository extends JpaRepository<Torneo, Long> {
}
