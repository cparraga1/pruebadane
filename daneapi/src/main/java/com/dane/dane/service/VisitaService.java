package com.dane.dane.service;

import com.dane.dane.entity.Visita;
import com.dane.dane.repository.VisitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class VisitaService {

    @Autowired
    VisitaRepository visitaRepository;

    public List<Visita> list(){

        return visitaRepository.findAll();
    }

    public Optional<Visita> getOne(Long idvisita){

        return visitaRepository.findByIdvisita(idvisita);
    }

    public Optional<Visita> getByEncuesta(Long idencuesta){

        return visitaRepository.findByIdencuesta(idencuesta);
    }

    public void save(Visita visita){

        visitaRepository.save(visita);
    }
}
