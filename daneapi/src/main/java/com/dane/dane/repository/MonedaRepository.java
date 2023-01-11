package com.dane.dane.repository;

import com.dane.dane.entity.Moneda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MonedaRepository extends JpaRepository<Moneda, Long>{

    Optional<Moneda> findByIdmoneda(Long idmoneda);
    Optional<Moneda> findByNombre(String nombre);
}
