package com.todocode.jpaDemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence")
    @SequenceGenerator(name = "hibernate_sequence", allocationSize = 1)
    private Long id_mascota;
    private String nombre;
    private String especie;
    private String raza;
    private String color;
    
    @OneToMany
    private List<Persona> duenios;

    public Mascota() {
    }

    public Mascota(String nombre, String especie, String raza, String color) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
    }
    
    
}
