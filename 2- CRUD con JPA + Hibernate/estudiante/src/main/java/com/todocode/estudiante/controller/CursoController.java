package com.todocode.estudiante.controller;

import com.todocode.estudiante.entity.Curso;
import com.todocode.estudiante.entity.Tema;
import com.todocode.estudiante.service.ICursoService;
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
public class CursoController {
   
   @Autowired
   ICursoService cursoService;
   
   @GetMapping
   public String inicio(){
      return "Estudiante de Programación";
   }
   
   @GetMapping("/cursos/traer")
   public List<Curso> getCursos(){
      return cursoService.getCursos();
   }
   
   @GetMapping("/cursos/traer/temas/{id}")
   public List<Tema> getTemas(@PathVariable Long id){
      return cursoService.getTemas(id);
   }
   
   @PostMapping("cursos/crear")
   public String saveCurso(@RequestBody Curso c){
      cursoService.saveCurso(c);
      return "Se creó el curso " + c.getNombre();
   }
   
   @DeleteMapping("cursos/eliminar/{id}")
   public String deleteCurso(@PathVariable Long id){
      cursoService.deleteCurso(id);
      return "Se eliminó el curso con éxito";
   }
   
   @PutMapping("cursos/editar")
   public String editCurso(@RequestBody Curso c){
      cursoService.editCurso(c);
      return "Se editó el curso " + c.getNombre();
   }
}
