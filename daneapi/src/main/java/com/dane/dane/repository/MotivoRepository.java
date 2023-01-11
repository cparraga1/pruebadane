package com.dane.dane.repository;

import com.dane.dane.entity.Motivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MotivoRepository extends JpaRepository<Motivo, Long>{

    Optional<Motivo> findByIdmotivo(Long idmotivo);
    Optional<Motivo> findByNombre(String nombre);
}
