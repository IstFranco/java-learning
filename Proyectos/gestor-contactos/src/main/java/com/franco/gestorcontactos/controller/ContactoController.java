package com.franco.gestorcontactos.controller;

import com.franco.gestorcontactos.model.Contacto;
import com.franco.gestorcontactos.services.ContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contactos")
public class ContactoController {

    @Autowired
    private ContactoService contactoService;

    @GetMapping()
    public List<Contacto> listarContactos() {
        return contactoService.traerTodosContactos(Sort.by(Sort.Direction.ASC, "nombre"));
    }

    @GetMapping("/{id}")
    public Contacto mostrarContactoId(@PathVariable Long id) {
        return contactoService.traerContactoId(id);
    }

    @GetMapping("/telefono")
    public String texto() {
        return "Escriba el numero de telefono de la persona que desea saber";
    }

    @GetMapping("/telefono/{telefono}")
    public Contacto mostrarContactoTelefono(@PathVariable String telefono) {
        return contactoService.traerPorTelefono(telefono);
    }

    @PostMapping()
    public Contacto agregarContacto(@RequestBody Contacto contacto) {
        return contactoService.crearContacto(contacto);
    }

    @DeleteMapping("/{id}")
    public String eliminarContacto(@PathVariable Long id) {
        return contactoService.eliminarContacto(id);
    }

    //TODO: @PatchMapping("/{id}")
    // public Contacto modificarContacto(@PathVariable Long id, @RequestBody Contacto contacto)

}
