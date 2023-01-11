package com.dane.dane.service;

import com.dane.dane.entity.Tipogasto;
import com.dane.dane.repository.TipogastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TipogastoService {

    @Autowired
    TipogastoRepository servicioRepository;

    public List<Tipogasto> list(){

        return servicioRepository.findAll();
    }

    public Optional<Tipogasto> getOne(Long idtipogasto){

        return servicioRepository.findByIdtipogasto(idtipogasto);
    }

    public Optional<Tipogasto> getByNombre(String idtipogasto){

        return servicioRepository.findByNombre(idtipogasto);
    }

    public void save(Tipogasto tipogasto){

        servicioRepository.save(tipogasto);
    }
}
