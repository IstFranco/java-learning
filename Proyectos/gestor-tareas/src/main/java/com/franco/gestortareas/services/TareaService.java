package com.franco.gestortareas.services;

import com.franco.gestortareas.model.Tarea;
import com.franco.gestortareas.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

@Service
public class TareaService {

    @Autowired
    private TareaRepository tareaRepository;

    public List<Tarea> mostrarTareas() {
        List<Tarea> lista = tareaRepository.findAll();

        lista.sort(Comparator.comparing(Tarea::getPrioridad));
        // Comparator.comparating compara en el orden que yo agregue los atributos a la enumeratica, ya que la enumerativa se ordena automaticamente por numero o alfabeticamente y no quiero eso.

        return lista;
    }

    public Tarea traerTareaPorId(Long id) {
        return tareaRepository.findById(id).orElse(null);
    }

    public Tarea crearTarea(Tarea t) {

        if (t.getFechaLimite() != null && t.getFechaLimite().isBefore(LocalDate.now())) {
            throw new RuntimeException("La fecha limite no puede ser anterior a hoy");
        }

        t.setFechaCreacion(LocalDate.now());

        t.setFechaFinalizacion(null);
        t.setFinalizada(false);

        return tareaRepository.save(t);
    }

    public String eliminarTarea(Long id) {
        if (tareaRepository.existsById(id)) {
            tareaRepository.deleteById(id);
            return "El elemento con id " + id + " fue eliminado correctamente.";
        }

        return "No existe elemento en la base de datos con id: " + id;
    }

    public Tarea modificarTarea(Long id, Tarea tarea) {
        Tarea tareaVieja = tareaRepository.findById(id).orElse(null);

        if (tareaVieja == null) {
            return null;
        }
        if (tarea.getTitulo() != null) {
            tareaVieja.setTitulo(tarea.getTitulo());
        }
        if (tarea.getDescripcion() != null) {
            tareaVieja.setDescripcion(tarea.getDescripcion());
        }
        if (tarea.getPrioridad() != null) {
            tareaVieja.setPrioridad(tarea.getPrioridad());
        }
        if (tarea.getFechaLimite() != null) {
            if (tarea.getFechaLimite() != null && tarea.getFechaLimite().isBefore(LocalDate.now())) {
                throw new RuntimeException("La fecha limite no puede ser anterior a hoy");
            }
            tareaVieja.setFechaLimite(tarea.getFechaLimite());
        }

        //ID, fechaCreacion y fechaFinalizacion las pone el sistema, por ende no las tocamos

        return tareaRepository.save(tareaVieja);
    }

    public Tarea finalizarTarea(Long id) {
        Tarea tarea = tareaRepository.findById(id).orElse(null);

        if (tarea != null) {
            tarea.setFinalizada(true);
            tarea.setFechaFinalizacion(LocalDate.now());
            return tareaRepository.save(tarea);
        }
        return null;
    }
}
