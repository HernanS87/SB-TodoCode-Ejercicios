package com.todocode.basquet.service;

import com.todocode.basquet.entity.Jugador;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BasquetService implements IBasquetService {

    @Override
    public double cargarJugadores(List<Jugador> listaJugadores) {
      
        double alturasAcum = 0;
        
        for(Jugador j: listaJugadores){
            alturasAcum += j.getEstatura();
        }
        
        double prom = alturasAcum/listaJugadores.size();
        
        return prom;
        
    }
    
}
