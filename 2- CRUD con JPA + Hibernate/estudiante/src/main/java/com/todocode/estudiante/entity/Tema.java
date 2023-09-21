package com.todocode.estudiante.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class Tema {
  
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_seq")
  @SequenceGenerator(name = "hibernate_seq", allocationSize = 1)
  private Long id;
  private String nombre;
  private String descripcion;

}
