package com.franco.primerapi.controller;

import com.franco.primerapi.model.Producto; //Importa la clase producto
import com.franco.primerapi.repository.ProductoRepository;
import com.franco.primerapi.services.ProductoService;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowire;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/producto") //Esto dice que cualquier ruta de aca sera "/producto..."
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/producto-prueba")
    public Producto mostrarProducto() {
        Producto prod = new Producto(1, "Silla Gamer", 250000.0);

        return prod; // no puedo hacer .getId() o cualquier coas porq devuelve el objeto entero
    }

    @GetMapping //si no defino la ruta es /producto por defecto. La del controller basicamente.
    public List<Producto> mostrarListado() {
        return productoService.traerTodo(); //Funciona como: Select * from Producto.
    }

    @GetMapping("/{id}")
    public Producto obtenerPorId(@PathVariable int id) {
        return productoService.traerPorId(id);
    }

    @PostMapping
    public Producto agregarProducto(@RequestBody Producto nuevoProducto) {
        return productoService.crearProducto(nuevoProducto);
    }

    @DeleteMapping("/{id}")
    public String borrar(@PathVariable int id) {
        return productoService.eliminarProducto(id);
    }

    //PUT MODIFICA EL OBJETO ENTERO Y PATCH UNA PARTE(un atributo o mas, pero no necesita modificar todo)
    @PutMapping("/{id}")
    public Producto actualizarCompleto(@PathVariable int id, @RequestBody Producto prodNuevo) {
        return productoService.modificacionTotal(id, prodNuevo);
    }

    @PatchMapping("/{id}")
    public Producto actualizarParcial(@PathVariable int id, @RequestBody Producto datosParciales) {
        return productoService.modificacionParcial(id, datosParciales);
    }
}
