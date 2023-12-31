package com.todocode.jpaDemo.service;

import com.todocode.jpaDemo.entity.Mascota;
import java.util.List;


public interface IMascotaService {
    
    public List<Mascota> getMascotas();
    
    public Mascota findMascota(Long id);
    
    public void saveMascota(Mascota m);
    
    public void deleteMascota(Long id);
    

    
}
