package com.todocode.estudiante.repository;

import com.todocode.estudiante.entity.Curso;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Long>{
   
   @Query("SELECT c FROM Curso c WHERE c.nombre LIKE %:name% ")
   List<Curso> getCursosByName(@Param("name") String name);
  
}
