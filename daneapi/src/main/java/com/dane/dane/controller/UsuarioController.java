package com.dane.dane.controller;

import com.dane.dane.dto.Mensaje;
import com.dane.dane.dto.UsuarioDto;
import com.dane.dane.entity.Usuario;
import com.dane.dane.service.UsuarioService;
import com.dane.dane.utilities.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
//@CrossOrigin(origins = {"http://localhost:8080", "http://localhost", "http://localhost:4200", "https://soporte.serviciocivil.gov.co", "http://20.172.240.181"})
@CrossOrigin(origins = "*")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/lista")
    public ResponseEntity<List<Usuario>> list(){

        try {
            List<Usuario> list = usuarioService.list();
            return new ResponseEntity(list, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity("Ha ocurrido un problema.", HttpStatus.NOT_MODIFIED);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody UsuarioDto usuariodto){

        try {
            MD5 md5 = new MD5();
            String contrasenia = md5.getMD5(usuariodto.getContrasena());
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            Usuario usuario = new Usuario(
                    usuariodto.getIdusuario(), contrasenia, usuariodto.getUsucrea(),dtf.format(LocalDateTime.now())
            );
            usuarioService.save(usuario);
            return new ResponseEntity(new Mensaje("Creado con éxito.", 0), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity("Ha ocurrido un problema.", HttpStatus.NOT_MODIFIED);
        }
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Usuario> getByUsuarioDetail(@PathVariable("id") String usuario){

        try {
            Optional<Usuario> varusuario = usuarioService.getOne(usuario);
            return new ResponseEntity(varusuario, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity("Ha ocurrido un problema.", HttpStatus.NOT_MODIFIED);
        }
    }
}
