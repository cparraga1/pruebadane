package com.dane.dane.service;

import com.dane.dane.entity.Tipoviaje;
import com.dane.dane.repository.TipoviajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TipoviajeService {

    @Autowired
    TipoviajeRepository tipoviajeRepository;

    public List<Tipoviaje> list(){

        return tipoviajeRepository.findAll();
    }

    public Optional<Tipoviaje> getOne(Long idtipoviaje){

        return tipoviajeRepository.findByIdtipoviaje(idtipoviaje);
    }

    public Optional<Tipoviaje> getByNombre(String nombre){

        return tipoviajeRepository.findByNombre(nombre);
    }

    public void save(Tipoviaje tipoviaje){

        tipoviajeRepository.save(tipoviaje);
    }
}
