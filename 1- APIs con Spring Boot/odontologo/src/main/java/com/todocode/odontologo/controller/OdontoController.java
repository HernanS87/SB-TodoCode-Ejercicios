package com.todocode.odontologo.controller;

import com.todocode.odontologo.Paciente;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OdontoController {
    
    @GetMapping
    public String inicio(){
        return "Clinica Odontológica";
    }
    
    public List<Paciente> obtenerLista() {
        List<Paciente> lista= new ArrayList<>();
        
        lista.add(new Paciente(1, "52333654", "Yasmín", "Romero", LocalDate.of(2016,8,18)));
        lista.add(new Paciente(2, "13558965", "Sara", "Barrios",LocalDate.of(1960,1,20)));
        lista.add(new Paciente(3, "49663221", "Benjamín", "Goichuk", LocalDate.of(2008,11,25)));
        lista.add(new Paciente(4, "50111889", "Gladys", "Andreiszyn", LocalDate.of(2015,9,27)));
        lista.add(new Paciente(5, "12000320", "Eduardo", "Malim", LocalDate.of(1958,5,13)));
        
        return lista;
    }   
    
    @GetMapping ("/pacientes")
    public List<Paciente> mostrarPacientes (){
        List<Paciente> listaPacientes= obtenerLista();

        return listaPacientes;
    } 
    
    @GetMapping ("/pacientes/menores")
    @ResponseBody
     public List<Paciente> mostrarPacientesMenores() {
        List<Paciente> listaPacientes= obtenerLista();

        List<Paciente> listaMenores = new ArrayList<>();
                 
        LocalDate hoy = LocalDate.now();
        
        for (Paciente pac : listaPacientes) {
            
            //calculo la diferencia de tiempo, en un formato P10Y2M15D (10años2meses15dias), entre la fecha de nacimiento y la fecha de hoy 
            Period cant_anios = Period.between(pac.getFecha_nacimiento(), hoy);
            
            System.out.println("period.between" + cant_anios);
            
            if (cant_anios.getYears()<18) {
                System.out.println("cant anios " + cant_anios.getYears());
                listaMenores.add(pac);
            }
         
         }
         return listaMenores;
     }
    
    
    
}
