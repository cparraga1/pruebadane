package com.dane.dane.repository;

import com.dane.dane.entity.Tipoviaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TipoviajeRepository extends JpaRepository<Tipoviaje, Long>{

    Optional<Tipoviaje> findByIdtipoviaje(Long idtipoviaje);
    Optional<Tipoviaje> findByNombre(String nombre);
}
