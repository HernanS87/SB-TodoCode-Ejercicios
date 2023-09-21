package com.todocode.estudiante.service;

import com.todocode.estudiante.entity.Tema;
import com.todocode.estudiante.repository.ITemaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemaService implements ITemaService{
   
   @Autowired
   ITemaRepository temaRepo;

   @Override
   public List<Tema> getTemas() {
      return temaRepo.findAll();
   }

   @Override
   public Tema findTema(Long id) {
      return temaRepo.findById(id).orElse(null);
   }

   @Override
   public void saveTema(Tema t) {
      temaRepo.save(t);
   }

   @Override
   public void deleteTema(Long id) {
     temaRepo.deleteById(id);
   }

   @Override
   public void editTema(Tema t) {
     this.saveTema(t);
   }
   
}
