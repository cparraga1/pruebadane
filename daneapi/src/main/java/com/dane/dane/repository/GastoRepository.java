package com.dane.dane.repository;

import com.dane.dane.entity.Gasto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GastoRepository extends JpaRepository<Gasto, Long>{

    Optional<Gasto> findByIdgasto(Long idgasto);
    Optional<Gasto> findByIdencuesta(Long idencuesta);
}
