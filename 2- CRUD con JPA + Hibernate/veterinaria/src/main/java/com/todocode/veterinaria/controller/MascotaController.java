package com.todocode.veterinaria.controller;

import com.todocode.veterinaria.dto.MascotaDuenioDTO;
import com.todocode.veterinaria.entity.Mascota;
import com.todocode.veterinaria.service.IMascotaService;
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
      return "Se creó el perro " + d.getNombre() +" correctamente";
   }
   
   @PutMapping("/mascotas/editar")
   public String editMascota(@RequestBody Mascota d){
      mascotaService.saveMascota(d);
      return "Se editó el perro " + d.getNombre() +" correctamente";
   }
   
   @DeleteMapping("/mascotas/eliminar")
   public String deleteMascota(@RequestParam Long id){
      mascotaService.deleteMascota(id);
      return "Se eliminó el perro correctamente";
   }
   
    @GetMapping("/mascotas/info-mascota-y-duenio")
   public MascotaDuenioDTO getInfoMascotaYDuenio(@RequestParam Long id){
      return mascotaService.getInfoMascotaYDuenio(id);
   }
   
   @GetMapping("/mascotas")
   public List<Mascota> getMascotasFiltro(@RequestParam String especie,
                                             @RequestParam String raza){
      return mascotaService.getMascotasFiltro(especie, raza);
   }
}
