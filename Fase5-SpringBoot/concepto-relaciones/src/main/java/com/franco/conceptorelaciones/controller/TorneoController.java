package com.franco.conceptorelaciones.controller;

import com.franco.conceptorelaciones.model.Torneo;
import com.franco.conceptorelaciones.services.TorneoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/torneo")
public class TorneoController {
    @Autowired
    private TorneoService torneoService;

    @PostMapping
    public Torneo crearTorneo(@RequestBody Torneo torneo) {
        return torneoService.crearTorneo(torneo);
    }

    @GetMapping
    public Torneo obtenerTorneoPorId(@PathVariable Long idTorneo) {
        return torneoService.obtenerTorneoPorId(idTorneo);
    }
}