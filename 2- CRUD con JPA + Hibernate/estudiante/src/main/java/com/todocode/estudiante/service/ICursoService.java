package com.todocode.estudiante.service;

import com.todocode.estudiante.entity.Curso;
import com.todocode.estudiante.entity.Tema;
import java.util.List;


public interface ICursoService {
  
  public List<Curso> getCursos();
  
  public List<Curso> getCursosByName(String name);
  
  public Curso findCurso(Long id);
  
  public void saveCurso(Curso c);
  
  public void deleteCurso(Long id);
  
  public void editCurso(Curso c);
  
  public List<Tema> getTemas(Long id);
  
}
