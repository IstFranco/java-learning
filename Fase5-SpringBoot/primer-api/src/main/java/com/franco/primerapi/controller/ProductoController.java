package com.franco.primerapi.controller;

import com.franco.primerapi.model.Producto; //Importa la clase producto
import com.franco.primerapi.repository.ProductoRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowire;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/producto") //Esto dice que cualquier ruta de aca sera "/producto..."
public class ProductoController {

    //ArrayList<Producto> baseDeDatos = new ArrayList<>();
    @Autowired
    private ProductoRepository productoRepository;

    //public ProductoController() {
    //    Faker faker = new Faker();
    //    for (int i = 0; i < 3; i++) {
    //        baseDeDatos.add(new Producto(
    //                i + 1,
    //                faker.commerce().productName(),
    //                faker.number().randomDouble(2, 100, 5000)
    //        ));
    //    }
    //}

    @GetMapping("/producto-prueba")
    public Producto mostrarProducto() {
        Producto prod = new Producto(1, "Silla Gamer", 250000.0);

        return prod; // no puedo hacer .getId() o cualquier coas porq devuelve el objeto entero
    }

    @GetMapping //si no defino la ruta es /producto por defecto. La del controller basicamente.
    public List<Producto> mostrarListado() {
        return productoRepository.findAll(); //Funciona como: Select * from Producto.
    }

    @GetMapping("/{id}")
    public Producto obtenerPorId(@PathVariable int id) {
        //for (Producto p : baseDeDatos) {
        //    if (p.getId() == id) {
        //        return p;
        //    }
        //}
        //return null;
        return productoRepository.findById(id).orElse(null);
        //El .orElse(null) devuelve null si no encuentra el id en la BD
    }

    @PostMapping
    public Producto agregarProducto(@RequestBody Producto nuevoProducto) {
        //baseDeDatos.add(nuevoProducto);
        //return nuevoProducto;
        return productoRepository.save(nuevoProducto);
    }

    @DeleteMapping("/{id}")
    public String borrar(@PathVariable int id) {
        //removeIf devuelve true si borro algo
        //boolean borrado = baseDeDatos.removeIf(p -> p.getId() == id);
        //return borrado ? "Borrando ID: " + id : "No encontrado";
        if (productoRepository.existsById(id)) {
            productoRepository.deleteById(id);
            return "Producto eliminado correctamente. ID: " + id;
        }
        return "No se encontro ningun producto asociado a ese id.";
    }

    //PUT MODIFICA EL OBJETO ENTERO Y PATCH UNA PARTE(un atributo o mas, pero no necesita modificar todo)
    @PutMapping("/{id}")
    public Producto actualizarCompleto(@PathVariable int id, @RequestBody Producto prodNuevo) {
        //for (Producto p : baseDeDatos) {
        //    if (p.getId() == id) {
        //        p.setNombre(prodNuevo.getNombre());
        //        p.setPrecio(prodNuevo.getPrecio());
        //        return p;
        //    }
        //}
        //return null;
        Producto prodViejo = productoRepository.findById(id).orElse(null);
        if (prodViejo != null) {
            prodViejo.setNombre(prodNuevo.getNombre());
            prodViejo.setPrecio(prodNuevo.getPrecio());
            //Lo guardo en la base de datos
            return productoRepository.save(prodViejo);
        }
        return null;
    }

    @PatchMapping("/{id}")
    public Producto actualizarParcial(@PathVariable int id, @RequestBody Producto datosParciales) {
        //for (Producto p : baseDeDatos) {
        //    if (p.getId() == id) {
        //        if (datosParciales.getNombre() != null) {
        //            p.setNombre(datosParciales.getNombre());
        //        }
        //        if (datosParciales.getPrecio() > 0) {
        //           p.setPrecio(datosParciales.getPrecio());
        //       }
        //        return p;
        //    }
        //}
        //return null;
        Producto prod = productoRepository.findById(id).orElse(null);
        if (prod != null) {
            if (datosParciales.getNombre() != null) {
                prod.setNombre(datosParciales.getNombre());
            }
            if (datosParciales.getPrecio() != null) {
                prod.setPrecio(datosParciales.getPrecio());
            }
            return productoRepository.save(prod);
        }
        return null;
    }
}
