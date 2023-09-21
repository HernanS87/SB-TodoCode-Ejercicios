package com.todocode.estudiante.service;

import com.todocode.estudiante.entity.Tema;
import java.util.List;


public interface ITemaService {
   
   public List<Tema> getTemas();
   
   public Tema findTema(Long id);
   
   public void saveTema(Tema t);
   
   public void deleteTema(Long id);
   
   public void editTema(Tema t);
   
}
