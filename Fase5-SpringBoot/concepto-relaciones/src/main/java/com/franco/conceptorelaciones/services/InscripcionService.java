package com.franco.conceptorelaciones.services;

import com.franco.conceptorelaciones.model.Equipo;
import com.franco.conceptorelaciones.model.Inscripcion;
import com.franco.conceptorelaciones.model.Torneo;
import com.franco.conceptorelaciones.repository.InscripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class InscripcionService {

    @Autowired
    private InscripcionRepository inscripcionRepository;

    @Autowired
    private EquipoService equipoService;

    @Autowired
    private TorneoService torneoService;

    public Inscripcion inscribiEquipoEnTorneo (Long idEquipo, Long idTorneo, boolean pagoCuota) {
        Equipo equipo = equipoService.obtenerEquipoPorId(idEquipo);
        Torneo torneo = torneoService.obtenerTorneoPorId(idTorneo);

        Inscripcion nuevaInscripcion = new Inscripcion();
        nuevaInscripcion.setEquipo(equipo);
        nuevaInscripcion.setTorneo(torneo);
        nuevaInscripcion.setFechaInscripcion(LocalDate.now());
        nuevaInscripcion.setCuotaPagada(pagoCuota);

        return inscripcionRepository.save(nuevaInscripcion);
    }
}
