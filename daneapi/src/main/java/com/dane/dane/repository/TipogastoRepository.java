package com.dane.dane.repository;

import com.dane.dane.entity.Tipogasto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TipogastoRepository extends JpaRepository<Tipogasto, Long>{

    Optional<Tipogasto> findByIdtipogasto(Long idtipogasto);
    Optional<Tipogasto> findByNombre(String nombre);
}
