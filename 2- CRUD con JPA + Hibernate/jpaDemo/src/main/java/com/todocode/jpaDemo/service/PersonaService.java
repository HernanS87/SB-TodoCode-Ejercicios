package com.todocode.jpaDemo.service;

import com.todocode.jpaDemo.entity.Persona;
import com.todocode.jpaDemo.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    private IPersonaRepository persoRepo;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = persoRepo.findAll();
        return listaPersonas;
    }

    @Override
    public Persona findPersona(Long id) {
       Persona p = persoRepo.findById(id).orElse(null);
       return p;
    }

    @Override
    public void savePersona(Persona p) {
        persoRepo.save(p);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public void editPersona(Long idOriginal, Long idNuevo, String nombreNuevo, String apellidoNuevo, int edadNueva) {
        Persona p = this.findPersona(idOriginal);
        
        p.setId(idNuevo);
        p.setNombre(nombreNuevo);
        p.setApellido(apellidoNuevo);
        p.setEdad(edadNueva);
        
        this.savePersona(p);
    }
    
}
