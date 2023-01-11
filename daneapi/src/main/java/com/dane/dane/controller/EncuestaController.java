package com.dane.dane.controller;

import com.dane.dane.dto.Mensaje;
import com.dane.dane.dto.EncuestaDto;
import com.dane.dane.entity.Encuesta;
import com.dane.dane.service.EncuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/encuesta")
//@CrossOrigin(origins = {"http://localhost:8080", "http://localhost", "http://localhost:4200", "https://soporte.serviciocivil.gov.co", "http://20.172.240.181"})
@CrossOrigin(origins = "*")
public class EncuestaController {

    @Autowired
    EncuestaService encuestaService;

    @GetMapping("/lista")
    public ResponseEntity<List<Encuesta>> list(){

        try {
            List<Encuesta> list = encuestaService.list();
            return new ResponseEntity(list, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity("Ha ocurrido un problema.", HttpStatus.NOT_MODIFIED);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody EncuestaDto encuestadto){

        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            Encuesta encuesta = new Encuesta(
                    encuestadto.getUsuario(), encuestadto.getPais(), encuestadto.getNacionalidad(), encuestadto.getSexo(), encuestadto.getEdad(),
                    encuestadto.getNumviajeros(), encuestadto.getIdviajero(), encuestadto.getDetalleviajeros(), encuestadto.getIdtipoviaje(),
                    encuestadto.getIdtipoviajedetalle(), encuestadto.getIdservicio(), encuestadto.getIdserviciodetalle(), encuestadto.getIdmotivo(),
                    encuestadto.getIdmotivodetalle()
            );
            long idencuesta = encuestaService.save(encuesta);
            return new ResponseEntity(new Mensaje("Creado con éxito.", idencuesta), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity("Ha ocurrido un problema.", HttpStatus.NOT_MODIFIED);
        }
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Encuesta> getByIdencuestaDetail(@PathVariable("id") Long idencuesta){

        try {
            Optional<Encuesta> encuesta = encuestaService.getOne(idencuesta);
            return new ResponseEntity(encuesta, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity("Ha ocurrido un problema.", HttpStatus.NOT_MODIFIED);
        }
    }
}
