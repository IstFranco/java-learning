package com.franco.gestortareas.controller;

import com.franco.gestortareas.model.Tarea;
import com.franco.gestortareas.repository.TareaRepository;
import com.franco.gestortareas.services.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tareas")
public class TareaController {

    @Autowired
    private TareaService tareaService;

    // localhost:8080/tareas
    @GetMapping
    public List<Tarea> mostrarTareas() {
        return tareaService.mostrarTareas();
    }

    // localhost:8080/tareas/{id}
    @GetMapping("/{id}")
    public Tarea traerPorId(@PathVariable Long id) {
        return tareaService.traerTareaPorId(id);
    }

    // localhost:8080/tareas
    @PostMapping
    public Tarea crearTarea(@RequestBody Tarea tarea) {
        return tareaService.crearTarea(tarea);
    }

    // localhost:8080/tareas/{id}
    @DeleteMapping("/{id}")
    public String borrarTarea(@PathVariable Long id) {
        return tareaService.eliminarTarea(id);
    }

    // localhost:8080/tareas/{id}
    @PatchMapping("/{id}")
    public Tarea modificarTarea(@PathVariable Long id, @RequestBody Tarea tarea) {
        return tareaService.modificarTarea(id, tarea);
    }

    // localhost:8080/tareas/{id}/finalizar
    @PatchMapping("/{id}/finalizar")
    public Tarea finalizarTarea(@PathVariable Long id) {
        return tareaService.finalizarTarea(id);
    }
}
