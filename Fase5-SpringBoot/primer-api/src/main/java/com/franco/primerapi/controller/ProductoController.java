package com.franco.primerapi.controller;

import com.franco.primerapi.model.Producto; //Importa la clase producto
import org.springframework.web.bind.annotation.*;
import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/producto") //Esto dice que cualquier ruta de aca sera "/producto..."
public class ProductoController {

    ArrayList<Producto> baseDeDatos = new ArrayList<>();

    public ProductoController() {
        Faker faker = new Faker();
        for (int i = 0; i < 3; i++) {
            baseDeDatos.add(new Producto(
                    i + 1,
                    faker.commerce().productName(),
                    faker.number().randomDouble(2, 100, 5000)
            ));
        }
    }

    @GetMapping("/producto-prueba")
    public Producto mostrarProducto() {
        Producto prod = new Producto(1, "Silla Gamer", 250000.0);

        return prod; // no puedo hacer .getId() o cualquier coas porq devuelve el objeto entero
    }

    @GetMapping //si no defino la ruta es /producto por defecto. La del controller basicamente.
    public List<Producto> mostrarListado() {
        return baseDeDatos;
    }

    @GetMapping("/{id}")
    public Producto obtenerPorId(@PathVariable int id) {
        for (Producto p : baseDeDatos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @PostMapping
    public Producto agregarProducto(@RequestBody Producto nuevoProducto) {
        baseDeDatos.add(nuevoProducto);
        return nuevoProducto;
    }

    @DeleteMapping("/{id}")
    public String borrar(@PathVariable int id) {
        //removeIf devuelve true si borro algo
        boolean borrado = baseDeDatos.removeIf(p -> p.getId() == id);
        return borrado ? "Borrando ID: " + id : "No encontrado";
    }

    //PUT MODIFICA EL OBJETO ENTERO Y PATCH UNA PARTE(un atributo o mas, pero no necesita modificar todo)
    @PutMapping("/{id}")
    public Producto actualizarCompleto(@PathVariable int id, @RequestBody Producto prodNuevo) {
        for (Producto p : baseDeDatos) {
            if (p.getId() == id) {
                p.setNombre(prodNuevo.getNombre());
                p.setPrecio(prodNuevo.getPrecio());
                return p;
            }
        }
        return null;
    }

    @PatchMapping("/{id}")
    public Producto actualizarParcial(@PathVariable int id, @RequestBody Producto datosParciales) {
        for (Producto p : baseDeDatos) {
            if (p.getId() == id) {
                if (datosParciales.getNombre() != null) {
                    p.setNombre(datosParciales.getNombre());
                }
                if (datosParciales.getPrecio() > 0) {
                    p.setPrecio(datosParciales.getPrecio());
                }
                return p;
            }
        }
        return null;
    }
}
