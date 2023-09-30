package com.todocode.veterinaria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class Mascota {
   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_seq")
   @SequenceGenerator(name = "hibernate_seq", allocationSize = 1)
   private Long id;
   private String nombre;
   private String especie;
   private String raza;
   private String color;
   
   @OneToOne
   private Duenio duenio;
   
}
