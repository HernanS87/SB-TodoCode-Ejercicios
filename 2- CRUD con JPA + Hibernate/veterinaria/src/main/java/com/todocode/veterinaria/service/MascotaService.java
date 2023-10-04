package com.todocode.veterinaria.service;

import com.todocode.veterinaria.entity.Mascota;
import com.todocode.veterinaria.repository.IMascotaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService{
   
   @Autowired
   IMascotaRepository mascotaRepository;

   @Override
   public List<Mascota> getMascotas() {
      return mascotaRepository.findAll();
   }

   @Override
   public Mascota findMascota(Long id) {
      return mascotaRepository.findById(id).orElse(null);
   }

   @Override
   public void saveMascota(Mascota d) {
      mascotaRepository.save(d);
   }

   @Override
   public void deleteMascota(Long id) {
      mascotaRepository.deleteById(id);
   }
   
}
