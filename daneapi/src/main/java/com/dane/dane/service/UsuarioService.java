package com.dane.dane.service;

import com.dane.dane.entity.Usuario;
import com.dane.dane.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuario> list(){

        return usuarioRepository.findAll();
    }

    public Optional<Usuario> getOne(String idusuario){

        return usuarioRepository.findByIdusuario(idusuario);
    }

    public void save(Usuario usuario){

        usuarioRepository.save(usuario).getIdusuario();
    }
}
