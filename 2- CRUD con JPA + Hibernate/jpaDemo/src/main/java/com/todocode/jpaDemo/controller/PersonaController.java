package com.todocode.jpaDemo.controller;

import com.todocode.jpaDemo.entity.Persona;
import com.todocode.jpaDemo.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    
    @Autowired
    IPersonaService personaServ;
    
    @GetMapping
    public String inicio(){
        return "JPA DEMO!!! ❤️";
    }
    
    @GetMapping("/personas/traer")
    public List<Persona> getPersonas(){
        return personaServ.getPersonas();
    }
    
    @PostMapping("/personas/crear")
    public String savePersona(@RequestBody Persona p){
        personaServ.savePersona(p);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        personaServ.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    
}
