package com.dane.dane.service;

import com.dane.dane.entity.Viajero;
import com.dane.dane.repository.ViajeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ViajeroService {

    @Autowired
    ViajeroRepository viajeroRepository;

    public List<Viajero> list(){

        return viajeroRepository.findAll();
    }

    public Optional<Viajero> getOne(Long idviajero){

        return viajeroRepository.findByIdviajero(idviajero);
    }

    public Optional<Viajero> getByNombre(String nombre){

        return viajeroRepository.findByNombre(nombre);
    }

    public void save(Viajero viajero){

        viajeroRepository.save(viajero);
    }
}
