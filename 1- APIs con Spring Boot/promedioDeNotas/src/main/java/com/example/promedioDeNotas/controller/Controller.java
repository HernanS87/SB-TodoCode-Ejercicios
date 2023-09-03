package com.example.promedioDeNotas.controller;

import com.example.promedioDeNotas.service.IPromedioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    IPromedioService promService;
    
    @GetMapping
    public String inicio(){
        return "Ejercicio de promedio de notas";
    }
    
    @GetMapping("/promedio")
    public String promedio(@RequestParam double nota1,
                           @RequestParam double nota2,
                           @RequestParam double nota3){
        
        double promedio = promService.calcularPromedio(nota1, nota2, nota3);
        
        return "<h1 style='color: red'>" + "El promedio de las 3 notas es: " + promedio + "</h1>";
    }
    
}
