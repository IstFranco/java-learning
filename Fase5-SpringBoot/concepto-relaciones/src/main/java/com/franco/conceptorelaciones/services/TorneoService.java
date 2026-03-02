package com.franco.conceptorelaciones.services;

import com.franco.conceptorelaciones.model.Torneo;
import com.franco.conceptorelaciones.repository.TorneoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TorneoService {
    @Autowired
    private TorneoRepository torneoRepository;

    public Torneo crearTorneo(Torneo torneo) {
        return torneoRepository.save(torneo);
    }

    public Torneo obtenerTorneoPorId(Long idTorneo) {
        return torneoRepository.findById(idTorneo).orElseThrow( () -> new IllegalArgumentException("No se encontro torneo con ese id."));
    }
}