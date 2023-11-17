package com.todocode.jpaDemo.service;

import com.todocode.jpaDemo.entity.Mascota;
import com.todocode.jpaDemo.repository.IMascotaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService{
    
    @Autowired
    private IMascotaRepository mascotaRepo;

    @Override
    public List<Mascota> getMascotas() {
        List<Mascota> listaMascotas = mascotaRepo.findAll();
        return listaMascotas;
    }

    @Override
    public Mascota findMascota(Long id) {
        Mascota m = mascotaRepo.findById(id).orElse(null);
        return m;
    }

    @Override
    public void saveMascota(Mascota m) {
        mascotaRepo.save(m);
    }

    @Override
    public void deleteMascota(Long id) {
        mascotaRepo.deleteById(id);
    }
    
}
