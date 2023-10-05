package com.todocode.veterinaria.controller;

import com.todocode.veterinaria.entity.Duenio;
import com.todocode.veterinaria.service.IDuenioService;
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
public class DuenioController {
   
   @Autowired
   IDuenioService duenioService;
   
   @GetMapping
   public String inicio(){
      return "Ejercicio de la Clinica Veterinaria";
   }
   
   @GetMapping("/duenios/traer")
   public List<Duenio> getDuenios(){
      return duenioService.getDuenios();
   }
   
   @PostMapping("/duenios/crear")
   public String saveDuenio(@RequestBody Duenio d){
      duenioService.saveDuenio(d);
      return "Se creó el dueño " + d.getNombre() +" correctamente";
   }
   
   @PutMapping("/duenios/editar")
   public String editDuenio(@RequestBody Duenio d){
      duenioService.saveDuenio(d);
      return "Se editó el dueño " + d.getNombre() +" correctamente";
   }
   
   // POR DEFECTO LOS PARAMETROS SON TODOS REQUERIDOS Y SI QUERES CAMBIAR EL NOMBRE A UNO TENES QUE PONER LA SIGUIENTE LINEA
   //  @RequestParam(name = "mensaje", required = false) String mjs)
   @DeleteMapping("/duenios/eliminar")
   public String deleteDuenio(@RequestParam Long id,
                              @RequestParam(required = false) String mjs){
      duenioService.deleteDuenio(id);
      return "Se eliminó el dueño correctamente" + mjs;
   }
   
}
