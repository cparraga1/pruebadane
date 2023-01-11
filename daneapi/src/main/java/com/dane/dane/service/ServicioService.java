package com.dane.dane.service;

import com.dane.dane.entity.Servicio;
import com.dane.dane.repository.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ServicioService {

    @Autowired
    ServicioRepository servicioRepository;

    public List<Servicio> list(){

        return servicioRepository.findAll();
    }

    public Optional<Servicio> getOne(Long idservicio){

        return servicioRepository.findByIdservicio(idservicio);
    }

    public Optional<Servicio> getByNombre(String nombre){

        return servicioRepository.findByNombre(nombre);
    }

    public void save(Servicio servicio){

        servicioRepository.save(servicio);
    }
}
