package com.example.promedioDeNotas.service;

import org.springframework.stereotype.Service;

@Service
public class PromedioService implements IPromedioService {

    @Override
    public double calcularPromedio(double n1, double n2, double n3) {       
       return (n1 + n2 + n3) / 3;
    }
    
}
