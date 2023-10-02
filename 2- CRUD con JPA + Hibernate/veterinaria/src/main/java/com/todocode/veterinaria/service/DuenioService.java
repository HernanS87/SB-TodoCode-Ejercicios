package com.todocode.veterinaria.service;

import com.todocode.veterinaria.entity.Duenio;
import com.todocode.veterinaria.repository.IDuenioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuenioService implements IDuenioService{
   
   @Autowired
   IDuenioRepository duenioRepository;

   @Override
   public List<Duenio> getDuenios() {
      return duenioRepository.findAll();
   }

   @Override
   public Duenio findDuenio(Long id) {
      return duenioRepository.findById(id).orElse(null);
   }

   @Override
   public void saveDuenio(Duenio d) {
      duenioRepository.save(d);
   }

   @Override
   public void deleteDuenio(Long id) {
      duenioRepository.deleteById(id);
   }

   
}
