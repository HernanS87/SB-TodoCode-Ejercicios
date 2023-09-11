package com.todocode.jpaDemo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence")
    @SequenceGenerator(name = "hibernate_sequence", allocationSize = 1)
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
 //   @OneToOne
 //   @JoinColumn(name="id_mascota", referencedColumnName = "id_mascota") // indicar el la columna de referencia no es necesario pero lo dejo como buena practica
 //   private Mascota mascota;
    
    @ManyToOne
    @JoinColumn(name="id_mascota")
    @JsonIgnoreProperties(value = { "duenios" }, allowSetters = true) // esta anotattion se utiliza para que cuando quiera devolver informacion en un JSON ignore la propiedad duenios de mascota ya que cuando muestre la lista de dueños estos tendran mascotas asociadas con listas de dueños y así entra en un ciclo infinito
    private Mascota pet;

    public Persona() {
    }


 
}
