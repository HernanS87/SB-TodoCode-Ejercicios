package com.todocode.veterinaria.controller;

import com.todocode.veterinaria.entity.Mascota;
import com.todocode.veterinaria.service.IMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {
   
   @Autowired
   IMascotaService mascotaService;
   
   @GetMapping("/mascotas/traer")
   public List<Mascota> getMascotas(){
      return mascotaService.getMascotas();
   }
   
   @PostMapping("/mascotas/crear")
   public String saveMascota(@RequestBody Mascota d){
      mascotaService.saveMascota(d);
      return "Se creó el dueño " + d.getNombre() +" correctamente";
   }
   
   @PutMapping("/mascotas/editar")
   public String editMascota(@RequestBody Mascota d){
      mascotaService.saveMascota(d);
      return "Se editó el dueño " + d.getNombre() +" correctamente";
   }
   
   @DeleteMapping("/mascotas/eliminar")
   public String deleteMascota(@RequestParam Long id){
      mascotaService.deleteMascota(id);
      return "Se eliminó el dueño correctamente";
   }
}
