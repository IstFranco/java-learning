package com.franco.primerapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Le dice a Spring que esta clase actua de "Mesero web"
public class SaludoController {

    @GetMapping("/") //! Esto va en otro sector, pero estoy probando cosas, DESPUES ELIMINAR
    public String inicio() {
        return "Bienvenido a mi primera API! Pruebe '/hola', '/chau', '/suma', 'numero-aleatorio', '/producto-prueba' o '/listado'";
    }

    @GetMapping("/hola") //Cuando alguien entre a /hola, ejecuta esto
    public String saludar() {
        return "Hola Franco! Tu primera API con spring boot funciona de 10 :)";
    }

    @GetMapping("/chau")
    public String despedir() {
        return "Adios! Vuelva pronto.";
    }

    @GetMapping("/suma")
    public String sumar() {
        int a = 10;
        int b = 20;
        int resultado = a + b;
        return "El resultado de " + a + " + " + b + " = " + resultado;
    }

    @GetMapping("/numero-aleatorio")
    public int obtenerNumero() {
        return 25;
    }
}
