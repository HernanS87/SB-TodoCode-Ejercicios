package com.todocode.basquet.controller;

import com.todocode.basquet.entity.Jugador;
import com.todocode.basquet.service.IBasquetService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    IBasquetService basquetService;
    
    @GetMapping
    public String inicio(){
        return "<h1>Ejercicio de Basquet</h1>";
    }
    
    @PostMapping("/cargar-jugadores")
    public String cargarJugadores(@RequestBody List<Jugador> listaJugadores){
        
        double prom = basquetService.cargarJugadores(listaJugadores);
        
        return "La altura promedio de los " + listaJugadores.size() + " jugadores es " + prom + "mts";
    }
    
}
