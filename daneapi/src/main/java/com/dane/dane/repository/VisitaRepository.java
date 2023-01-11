package com.dane.dane.repository;

import com.dane.dane.entity.Visita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VisitaRepository extends JpaRepository<Visita, Long>{

    Optional<Visita> findByIdvisita(Long idvisita);
    Optional<Visita> findByIdencuesta(Long idencuesta);
}
