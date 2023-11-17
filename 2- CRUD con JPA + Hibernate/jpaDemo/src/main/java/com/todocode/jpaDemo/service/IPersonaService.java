package com.todocode.jpaDemo.service;

import com.todocode.jpaDemo.entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> getPersonas();
    
    public Persona findPersona(Long id);
    
    public void savePersona(Persona p);
    
    public void deletePersona(Long id);
    
    
}
