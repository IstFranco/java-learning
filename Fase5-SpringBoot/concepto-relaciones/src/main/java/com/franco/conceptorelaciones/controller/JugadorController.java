package com.franco.conceptorelaciones.controller;

import com.franco.conceptorelaciones.model.Jugador;
import com.franco.conceptorelaciones.repository.JugadorRepository;
import com.franco.conceptorelaciones.services.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jugador")
public class JugadorController {

    @Autowired
    private JugadorService jugadorService;

    @GetMapping
    public List<Jugador> listarJugadores() {
        return jugadorService.traerTodos();
    }

    @GetMapping("/{id}")
    public Jugador traerPorId(@PathVariable Long id) {
        return jugadorService.traerPorId(id);
    }

    @PostMapping
    public Jugador crearJugador(@RequestBody Jugador jugador) {
        return jugadorService.crearJugador(jugador);
    }

    @PutMapping("/{id}")
    public Jugador actualizarJugador(@PathVariable Long id, @RequestBody Jugador jugador) {
        return jugadorService.actualizarJugador(id, jugador);
    }

    @DeleteMapping("/{id}")
    public String eliminarJugador(@PathVariable Long id) {
        return jugadorService.eliminarJugador(id);
    }
}
