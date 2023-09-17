package com.todocode.estudiante.service;

import com.todocode.estudiante.entity.Curso;
import java.util.List;


public interface ICursoService {
  
  public List<Curso> getCursos();
  
  public Curso findCurso(Long id);
  
  public void saveCurso(Curso c);
  
  public void deleteCurso(Long id);
  
  public void editCurso(Curso c);
  
}
