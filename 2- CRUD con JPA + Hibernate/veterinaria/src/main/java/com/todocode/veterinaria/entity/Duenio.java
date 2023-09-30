package com.todocode.veterinaria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class Duenio {
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_seq")
   @SequenceGenerator(name = "hibernate_seq", allocationSize = 1)
   private Long id;
   private String dni;
   private String nombre;
   private String apellido;
   private int celular;
}
