package com.todocode.jpaDemo.entity;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Data;

@Data
@Entity
public class Persona {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String nombre;
   private String apellido;
   private int edad;

   @OneToMany(cascade=CascadeType.ALL) // con este tipo de mapeo puedo crear un dueño con una lista de mascotas todos nuevos y podrá crear la relación pero lo que no podrá hacer es crear un dueño nuevo con una mascota que ya existía pero no tenía dueño. Tambien puedo editar el dueño y pasarle una lista de mascotas vacía para que borre todas las relaciones previas
   @JoinColumn(name = "duenio_id")
   @JsonIgnoreProperties(value = { "duenio" }, allowSetters = true) 
   List<Mascota> mascotas;

}
