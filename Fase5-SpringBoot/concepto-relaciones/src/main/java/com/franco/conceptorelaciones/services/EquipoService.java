package com.franco.conceptorelaciones.services;

import com.franco.conceptorelaciones.model.Equipo;
import com.franco.conceptorelaciones.model.Jugador;
import com.franco.conceptorelaciones.repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    public Equipo crearEquipoConJugadores(Equipo equipo) {
        //Recorremos la lista de jugadores que viene de postman
        if (equipo.getJugadores() != null) { //Si la lista no esta vacia la recorre
            for (Jugador jugador : equipo.getJugadores()) {
                // A cada jugador le seteamos el equipo, ya que el equipo conoce al jugador y el jugador al equipo.
                jugador.setEquipo(equipo);
            }
        }
        // como puse Cascade.ALL en equipo cuando hacemos save() Spring Boot automaticamente hace save() de los jugadores tambien.
        return equipoRepository.save(equipo);
    }

    public List<Equipo> obtenerEquipos() {
        return equipoRepository.findAll();
    }

    public Equipo obtenerEquipoPorId(Long id) {
        return equipoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("No se encontro equipo con ID: " + id));
    }

    public Equipo actualizarEquipo(Long id, Equipo equipoActualizado) {
        Equipo equipoExistente = obtenerEquipoPorId(id);

        equipoExistente.setNombre(equipoActualizado.getNombre());
        equipoExistente.setCiudad(equipoActualizado.getCiudad());

        return equipoRepository.save(equipoExistente);
    }

    public String eliminarEquipo(Long id) {
        if (!equipoRepository.existsById(id)) {
            throw new IllegalArgumentException("No existe equipo con ID: " + id);
        }

        equipoRepository.deleteById(id);
        return "Equipo con ID: " + id + " eliminado correctamente.";
    }
}
