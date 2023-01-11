package com.dane.dane.service;

import com.dane.dane.entity.Moneda;
import com.dane.dane.repository.MonedaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MonedaService {

    @Autowired
    MonedaRepository monedaRepository;

    public List<Moneda> list(){

        return monedaRepository.findAll();
    }

    public Optional<Moneda> getOne(Long idmoneda){

        return monedaRepository.findByIdmoneda(idmoneda);
    }

    public Optional<Moneda> getByNombre(String nombre){

        return monedaRepository.findByNombre(nombre);
    }

    public void save(Moneda moneda){

        monedaRepository.save(moneda);
    }
}
