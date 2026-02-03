package com.franco.primerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.franco.primerapi.model.Producto;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    //El extend del JpaRepository me da automaticamente los metodos para guardar, borrar, buscar por id, buscar todos, etc.
    //<Producto, Integer> Es Integer porq el Producto en model es Integer. Seria como el parametro de busqieda principal.
}
