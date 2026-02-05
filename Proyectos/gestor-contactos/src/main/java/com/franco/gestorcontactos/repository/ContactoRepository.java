package com.franco.gestorcontactos.repository;

import com.franco.gestorcontactos.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepository extends JpaRepository<Contacto, Long> {
    // Spring lee "findBy" + "Telefono" y automáticamente arma la query SQL:
    // SELECT * FROM Contacto WHERE telefono = ?
    java.util.Optional<Contacto> findByTelefono(String t);
    //Basicamente el repository sirve para crear nuestras consultas que no vienen por defecto.

}
