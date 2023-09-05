package com.todocode.jpaDemo.service;

import com.todocode.jpaDemo.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    
    @Autowired
    private IPersonaRepository persoRepo;
    
}
