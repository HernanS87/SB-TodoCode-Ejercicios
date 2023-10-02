package com.todocode.veterinaria.repository;

import com.todocode.veterinaria.entity.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuenioRepository extends JpaRepository<Duenio, Long> {
   
}
