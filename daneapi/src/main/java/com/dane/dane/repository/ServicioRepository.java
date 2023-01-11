package com.dane.dane.repository;

import com.dane.dane.entity.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ServicioRepository extends JpaRepository<Servicio, Long>{

    Optional<Servicio> findByIdservicio(Long idservicio);
    Optional<Servicio> findByNombre(String nombre);
}
