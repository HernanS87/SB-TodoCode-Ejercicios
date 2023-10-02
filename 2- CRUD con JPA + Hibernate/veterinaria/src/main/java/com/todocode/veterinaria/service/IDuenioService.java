package com.todocode.veterinaria.service;

import com.todocode.veterinaria.entity.Duenio;
import java.util.List;


public interface IDuenioService {
   
   public List<Duenio> getDuenios();
   
   public Duenio findDuenio(Long id);
   
   public void saveDuenio(Duenio d);
   
   public void deleteDuenio(Long id);
   
}
