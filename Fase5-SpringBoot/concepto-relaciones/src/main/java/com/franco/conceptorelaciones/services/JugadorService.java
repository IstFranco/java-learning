package com.franco.conceptorelaciones.services;

import com.franco.conceptorelaciones.model.Jugador;
import com.franco.conceptorelaciones.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    public List<Jugador> traerTodos() {
        return jugadorRepository.findAll();
    }


    public Jugador traerPorId(Long id) {
        return jugadorRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("No se encontro jugador con ID: " + id));
    }

    public Jugador crearJugador(Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    public Jugador actualizarJugador(Long id, Jugador jugadorActualizado) {

        Jugador jugadorExistente = traerPorId(id);

        jugadorExistente.setNombre(jugadorActualizado.getNombre());
        jugadorExistente.setNumeroCamiseta(jugadorActualizado.getNumeroCamiseta());

        return jugadorRepository.save(jugadorExistente);
    }

    public String eliminarJugador(Long id) {
        if (!jugadorRepository.existsById(id)) {
            throw new IllegalArgumentException("No existe jugador con ID: " + id);
        }

        jugadorRepository.deleteById(id);

        return "Jugador con ID " + id + " eliminado correctametne";
    }

}
