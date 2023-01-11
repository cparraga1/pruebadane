package com.dane.dane.service;

import com.dane.dane.entity.Motivo;
import com.dane.dane.repository.MotivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MotivoService {

    @Autowired
    MotivoRepository motivoRepository;

    public List<Motivo> list(){

        return motivoRepository.findAll();
    }

    public Optional<Motivo> getOne(Long idmotivo){

        return motivoRepository.findByIdmotivo(idmotivo);
    }

    public Optional<Motivo> getByNombre(String nombre){

        return motivoRepository.findByNombre(nombre);
    }

    public void save(Motivo motivo){

        motivoRepository.save(motivo);
    }
}
