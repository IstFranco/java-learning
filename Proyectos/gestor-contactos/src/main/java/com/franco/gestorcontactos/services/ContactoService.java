package com.franco.gestorcontactos.services;

import com.franco.gestorcontactos.model.Contacto;
import com.franco.gestorcontactos.repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoService {

    @Autowired
    private ContactoRepository contactoRepository;

    public List<Contacto> traerTodosContactos(Sort sort) {
        return contactoRepository.findAll(sort);
    }

    public Contacto traerContactoId(Long id) {
        return  contactoRepository.findById(id).orElse(null);
    }

    public Contacto traerPorTelefono(String telefono) {
        return contactoRepository.findByTelefono(telefono).orElse(null);
    }

    public Contacto crearContacto (Contacto contacto) {
        return contactoRepository.save(contacto);
    }

    public String eliminarContacto(Long id) {
        if (contactoRepository.existsById(id)) {
            contactoRepository.deleteById(id);
            return "Contacto con id " + id + " eliminado correctamente";
        }
        return "No existe contacto asociado a id " + id;
    }

    // TODO: public Contacto actualizarContacto(Long id, Contacto contacto) {}

}
