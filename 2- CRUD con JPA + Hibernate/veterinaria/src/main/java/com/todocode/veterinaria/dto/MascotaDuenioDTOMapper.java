package com.todocode.veterinaria.dto;

import com.todocode.veterinaria.entity.Duenio;
import com.todocode.veterinaria.entity.Mascota;


public class MascotaDuenioDTOMapper {
   
   public MascotaDuenioDTO mascotaDuenio2DTO(Mascota m){
      
      MascotaDuenioDTO dto = new MascotaDuenioDTO();
      
      dto.setNombre_mascota(m.getNombre());
      dto.setEspecie(m.getEspecie());
      dto.setRaza(m.getRaza());
      
      Duenio d = m.getDuenio();
      if (d != null){
         dto.setNombre_duenio(d.getNombre());
         dto.setApellido_duenio(d.getApellido());
      }
      
      return dto;
   }
   
   
}
