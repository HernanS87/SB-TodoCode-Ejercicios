package com.todocode.jpaDemo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
    
//    @OneToMany(mappedBy = "pet")
//    @JsonIgnoreProperties(value = { "pet" }, allowSetters = true) 
    
    // RELACION UNIDIRECCIONAL SIN TABLA INTERMEDIA
    
    @OneToMany 
    @JoinColumn(name = "id_mascota")
    private List<Persona> duenios;

    public Mascota() {
    }


     
}
