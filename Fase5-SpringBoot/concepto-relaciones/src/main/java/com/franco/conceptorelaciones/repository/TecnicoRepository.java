package com.franco.conceptorelaciones.repository;
import com.franco.conceptorelaciones.model.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoRepository extends JpaRepository<Tecnico, Long> {
}
