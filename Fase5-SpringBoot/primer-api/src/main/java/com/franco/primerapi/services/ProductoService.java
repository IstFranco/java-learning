package com.franco.primerapi.services;

import com.franco.primerapi.model.Producto;
import com.franco.primerapi.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service //Marcamos clase como servicio
public class ProductoService {

    @Autowired //Inyectamos al repositorio
    private ProductoRepository productoRepository;

    public Producto crearProducto(Producto prod) {
        if (prod.getPrecio() < 0) {
            throw new RuntimeException("El precio no puede ser negativo capo!");
        }

        prod.setNombre(prod.getNombre().toUpperCase());

        return productoRepository.save(prod);
    }

    public List<Producto> traerTodo() {
        return productoRepository.findAll();
    }

    public Producto traerPorId(int id) {
        return productoRepository.findById(id).orElse(null);
    }

    public String eliminarProducto(int id) {
        if (productoRepository.existsById(id)) {
            productoRepository.deleteById(id);
            return "Producto con id: " + id + " Eliminado correctamente";
        }

        return "El id: " + id + " no esta asociado a ningun objeto de la base de datos";
    }

    public Producto modificacionTotal(int id, Producto p) {
        Producto prodViejo = productoRepository.findById(id).orElse(null);
        if (prodViejo != null) {
            prodViejo.setNombre(p.getNombre());
            prodViejo.setPrecio(p.getPrecio());

            return productoRepository.save(prodViejo);
        }
        return null;
    }

    public Producto modificacionParcial(int id, Producto p) {
        Producto prodViejo = productoRepository.findById(id).orElse(null);
        if (prodViejo != null) {
            if (p.getNombre() != null) { //prodViejo.getNombre() != p.getNombre() Esto no funcionaria porq p.getNombre puede ser null. En ese caso tambien cumple que es != y le asignaria un valor nulo al prodViejo.
                prodViejo.setNombre(p.getNombre());
            }
            if (p.getPrecio() != null) {
                prodViejo.setPrecio(p.getPrecio());
            }
            return productoRepository.save(prodViejo);
        }
        return null;
    }
}
