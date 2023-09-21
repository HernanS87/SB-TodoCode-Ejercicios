package com.todocode.estudiante.repository;

import com.todocode.estudiante.entity.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemaRepository extends JpaRepository<Tema, Long>{
   
}
