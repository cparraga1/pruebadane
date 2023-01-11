package com.dane.dane.service;

import com.dane.dane.entity.Gasto;
import com.dane.dane.repository.GastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class GastoService {

    @Autowired
    GastoRepository gastoRepository;

    public List<Gasto> list(){

        return gastoRepository.findAll();
    }

    public Optional<Gasto> getOne(Long idgasto){

        return gastoRepository.findByIdgasto(idgasto);
    }

    public Optional<Gasto> getByEncuesta(Long idencuesta){

        return gastoRepository.findByIdencuesta(idencuesta);
    }

    public long save(Gasto gasto){

        return gastoRepository.save(gasto).getIdgasto();
    }
}
