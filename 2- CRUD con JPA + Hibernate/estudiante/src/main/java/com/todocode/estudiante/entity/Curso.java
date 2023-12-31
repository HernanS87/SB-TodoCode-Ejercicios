package com.todocode.estudiante.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import java.time.LocalDate;
import java.util.List;
import lombok.Data;


@Data
@Entity
public class Curso {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_seq")
  @SequenceGenerator(name = "hibernate_seq", allocationSize = 1)
  private Long id;
  private String nombre;
  private String modalidad;
  private LocalDate fecha_finalizacion;
  
  @OneToMany
  @JoinColumn(name = "id_curso")
  private List<Tema> lista_temas;

  
}
