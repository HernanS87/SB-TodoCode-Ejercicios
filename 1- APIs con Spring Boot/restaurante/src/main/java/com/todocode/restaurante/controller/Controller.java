package com.todocode.restaurante.controller;

import com.todocode.restaurante.Plato;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    
    @GetMapping
    public String inicio() {
        return "Bienvenidos al mejor restaurante del mundo!!!!!!";
    }
    
    @GetMapping("/plato")
    public String detalleDelPlato(@RequestParam int num) {
        
        String detalle;
        
        if (num >= 1 && num <= 5){
            List<Plato> menu = new ArrayList<>();
        menu.add(new Plato(1,"Lomo Pizza", 7800, "Es una pizza ricasa con carne ajajaj" ));
        menu.add(new Plato(2,"Pancho a la masa", 1200, "Es un panchito con jamon y queso envuelto en masa ajajaj" ));
        menu.add(new Plato(3,"Hamburguesa", 3000, "Es una burguer casera ajajaj" ));
        menu.add(new Plato(4,"Asado", 10000, "Es la mejor carne asada del mundo cocinada al estilo de los Argentinos" ));
        menu.add(new Plato(5,"Empanadas", 2000, "Es carne molida en vuelta en masa " ));
        
        Plato platoElejido = new Plato();

        for (Plato p : menu) {
            if (p.getNumero() == num){
                platoElejido = p;
            }
        }
        
        detalle = "<h1>"+ platoElejido.getNombre() + " $" + platoElejido.getPrecio() + "</h1>" + 
                         "<h3>" + "Descripcion: " + platoElejido.getDescripcion() + "</h3>";
        
        } else {
            detalle = "<h1>"+ "Este plato no existe" + "</h1>";
        }
       
        return detalle;
    }
}
