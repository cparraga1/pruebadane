package com.dane.dane.service;

import com.dane.dane.entity.Encuesta;
import com.dane.dane.repository.EncuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EncuestaService {

    @Autowired
    EncuestaRepository encuestaRepository;

    public List<Encuesta> list(){

        return encuestaRepository.findAll();
    }

    public Optional<Encuesta> getOne(Long idencuesta){

        return encuestaRepository.findByIdencuesta(idencuesta);
    }

    public Optional<Encuesta> getByUsuario(String usuario){

        return encuestaRepository.findByusuario(usuario);
    }

    public long save(Encuesta encuesta){

        return encuestaRepository.save(encuesta).getIdencuesta();
    }
}
