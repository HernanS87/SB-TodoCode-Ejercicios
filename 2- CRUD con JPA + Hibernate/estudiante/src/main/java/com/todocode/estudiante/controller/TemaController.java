package com.todocode.estudiante.controller;

import com.todocode.estudiante.entity.Tema;
import com.todocode.estudiante.service.ITemaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemaController {
   
   @Autowired
   ITemaService temaService;
   
   @GetMapping("/temas/traer")
   public List<Tema> getTemas(){
      return temaService.getTemas();
   }
   
   @PostMapping("/temas/crear")
   public String saveTema(@RequestBody Tema t){
      temaService.saveTema(t);
      return "Se guardó el tema " + t.getNombre() + " correctamente";
   }
   
   @DeleteMapping("/temas/eliminar/{id}")
   public String deleteTema(@PathVariable Long id){
      temaService.deleteTema(id);
      return "Se eliminó el tema correctamente";  
   }
   
   @PutMapping("/temas/editar")
   public String editTema(@RequestBody Tema t){
      temaService.editTema(t);
      return "Se editó el tema " + t.getNombre() + " correctamente";
   }
   
}
