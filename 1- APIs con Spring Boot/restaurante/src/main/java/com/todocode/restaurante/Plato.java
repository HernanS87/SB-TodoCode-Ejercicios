package com.todocode.restaurante;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Plato {
    
    
    private int numero;
    private String nombre;
    private double precio;
    private String descripcion;

    public Plato() {
    }

    public Plato(int numero, String nombre, double precio, String descripcion) {
        this.numero = numero;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    
}
