package com.dane.dane.repository;

import com.dane.dane.entity.Viajero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ViajeroRepository extends JpaRepository<Viajero, Long>{

    Optional<Viajero> findByIdviajero(Long idviajero);
    Optional<Viajero> findByNombre(String nombre);
}
