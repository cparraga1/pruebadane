package com.dane.dane.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dane.dane.entity.Encuesta;
import java.util.Optional;

@Repository
public interface EncuestaRepository extends JpaRepository<Encuesta, Long>{

    Optional<Encuesta> findByIdencuesta(Long idencuesta);
    Optional<Encuesta> findByusuario(String usuario);
}
