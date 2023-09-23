package com.todocode.estudiante.service;

import com.todocode.estudiante.entity.Curso;
import com.todocode.estudiante.entity.Tema;
import com.todocode.estudiante.repository.ICursoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService implements ICursoService {
  
  @Autowired
  ICursoRepository cursoRepo;

  @Override
  public List<Curso> getCursos() {
    return cursoRepo.findAll();
  }

  @Override
  public Curso findCurso(Long id) {
    return cursoRepo.findById(id).orElse(null);
  }

  @Override
  public void saveCurso(Curso c) {
    cursoRepo.save(c);
  }

  @Override
  public void deleteCurso(Long id) {
    cursoRepo.deleteById(id);
  }

  @Override
  public void editCurso(Curso c) {
    this.saveCurso(c);
  }

   @Override
   public List<Tema> getTemas(Long id) {
      return findCurso(id).getLista_temas();
   }

   @Override
   public List<Curso> getCursosByName(String name) {
      return cursoRepo.getCursosByName(name);
   }
  
}
