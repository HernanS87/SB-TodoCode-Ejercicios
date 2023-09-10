package com.todocode.jpaDemo.controller;

import com.todocode.jpaDemo.entity.Mascota;
import com.todocode.jpaDemo.service.IMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {
    
    @Autowired
    private IMascotaService mascoServ;
    
    
    @GetMapping("/mascotas/traer")
    public List<Mascota> getMascotas(){
        return mascoServ.getMascotas();
    }
    
    @PostMapping("/mascotas/crear")
    public String saveMascota(@RequestBody Mascota m){
        mascoServ.saveMascota(m);
        return "La mascota fue creada correctamente";
    }
    
    @DeleteMapping("/mascotas/borrar/{id}")
    public String deleteMascota(@PathVariable Long id){
        mascoServ.deleteMascota(id);
        return "La mascota fue eliminada correctamente";
    }
    
}
