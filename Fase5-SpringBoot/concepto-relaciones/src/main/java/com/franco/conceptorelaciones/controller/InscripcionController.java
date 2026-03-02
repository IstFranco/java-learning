package com.franco.conceptorelaciones.controller;

import com.franco.conceptorelaciones.model.Inscripcion;
import com.franco.conceptorelaciones.repository.InscripcionRepository;
import com.franco.conceptorelaciones.services.InscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Inscripcion")
public class InscripcionController {

    @Autowired
    private InscripcionService inscripcionService;

    @PostMapping("/equipo/{idEquipo}/torneo/{idTorneo}")
    public Inscripcion anotarEquipo(@PathVariable Long idEquipo, @PathVariable Long idTorneo, @RequestParam boolean pagoCuota) {
        return  inscripcionService.inscribiEquipoEnTorneo(idEquipo, idTorneo, pagoCuota);
    }
}
