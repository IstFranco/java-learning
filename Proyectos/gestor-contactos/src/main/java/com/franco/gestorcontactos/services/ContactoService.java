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

        return  contactoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("No se encontro contacto ID: " + id));
    }

    public Contacto traerPorTelefono(String telefono) {
        return contactoRepository.findByTelefono(telefono).orElseThrow(() -> new IllegalArgumentException("No se encontro contacto con el numero: " + telefono));
    }

    public Contacto crearContacto (Contacto contacto) {

        // .isBlank() evita esto: ("    ") -> que puedan mandar espacios en blacno
        if (contacto.getNombre() == null || contacto.getNombre().isBlank()) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }
        if (contacto.getApellido() == null || contacto.getApellido().isBlank()) {
            throw new IllegalArgumentException("El apellido es obligatorio");
        }
        if (contacto.getEmail() == null || !contacto.getEmail().contains("@")) {
            throw new IllegalArgumentException("El email es obligatorio y debe contener @");
        }
        // "\\d" significa "dígito (número)".
        // "\\d+" significa "uno o más números, la cantidad que sea"
        if (contacto.getTelefono() == null || !contacto.getTelefono().matches("\\d+")) {
            throw new IllegalArgumentException("El telefono es obligatorio");
        }
        // "{8}" significa "exactamente 8 veces".
        if (contacto.getDni() == null || !contacto.getDni().matches("\\d{8}")) {
            throw new IllegalArgumentException("El DNI es obligatorio y deben ser 8 numeros");
        }

        if (contactoRepository.existsByEmail(contacto.getEmail())) {
            throw new IllegalArgumentException("Ya existe un contacto con ese correo");
        }
        if (contactoRepository.existsByTelefono(contacto.getTelefono())) {
            throw new IllegalArgumentException("Ya existe un contacto con ese numero de telefono");
        }
        if (contactoRepository.existsByDni(contacto.getDni())) {
            throw new IllegalArgumentException("Ya existe un contacto con ese DNI");
        }

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
