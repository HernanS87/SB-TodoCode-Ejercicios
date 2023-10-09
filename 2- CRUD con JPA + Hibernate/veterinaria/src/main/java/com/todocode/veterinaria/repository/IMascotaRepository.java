package com.todocode.veterinaria.repository;

import com.todocode.veterinaria.entity.Mascota;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long>{
   
   @Query("SELECT m FROM Mascota m WHERE m.especie = :especie and (:raza is null or m.raza LIKE %:raza%) ")
   List<Mascota> getMascotasFiltro(@Param("especie") String especie,
                                 @Param("raza") String raza);
   
}
