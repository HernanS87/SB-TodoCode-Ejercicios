package com.todocode.veterinaria.service;

import com.todocode.veterinaria.dto.MascotaDuenioDTO;
import com.todocode.veterinaria.entity.Mascota;
import java.util.List;


public interface IMascotaService {
   
   public List<Mascota> getMascotas();
   
   public Mascota findMascota(Long id);
   
   public void saveMascota(Mascota d);
   
   public void deleteMascota(Long id);
   
   public MascotaDuenioDTO getInfoMascotaYDuenio(Long id);
   
   public List<Mascota> getMascotasFiltro(String especie, String raza);
   
}
