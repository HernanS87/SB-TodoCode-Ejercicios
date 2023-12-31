package com.todocode.veterinaria.service;

import com.todocode.veterinaria.dto.MascotaDuenioDTO;
import com.todocode.veterinaria.dto.MascotaDuenioDTOMapper;
import com.todocode.veterinaria.entity.Mascota;
import com.todocode.veterinaria.repository.IMascotaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService{
   
   @Autowired
   IMascotaRepository mascotaRepository;
   @Autowired
   MascotaDuenioDTOMapper mascotaDuenioDTOMapper;

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

   @Override
   public MascotaDuenioDTO getInfoMascotaYDuenio(Long id) {
      Mascota m = findMascota(id);
      return mascotaDuenioDTOMapper.mascotaDuenio2DTO(m);
   }

   @Override
   public List<Mascota> getMascotasFiltro(String especie, String raza) {
      if (raza == null || raza.trim().isEmpty()){
         raza = null;
      }
      return mascotaRepository.getMascotasFiltro(especie, raza);
   }
   
}
