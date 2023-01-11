package com.dane.dane.controller;
import com.dane.dane.dto.GastoDto;
import com.dane.dane.dto.Mensaje;
import com.dane.dane.entity.Gasto;
import com.dane.dane.service.GastoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/gasto")
//@CrossOrigin(origins = {"http://localhost:8080", "http://localhost", "http://localhost:4200", "https://soporte.serviciocivil.gov.co", "http://20.172.240.181"})
@CrossOrigin(origins = "*")
public class GastoController {

    @Autowired
    GastoService gastoService;

    @GetMapping("/lista")
    public ResponseEntity<List<Gasto>> list(){

        try {
            List<Gasto> list = gastoService.list();
            return new ResponseEntity(list, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity("Ha ocurrido un problema.", HttpStatus.NOT_MODIFIED);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody GastoDto gastodto){

        try {
            Gasto gasto = new Gasto(
                    gastodto.getIdtipogasto(), gastodto.getValorpropio(), gastodto.getIdmonedapropio(), gastodto.getValornotercero(),
                    gastodto.getIdmonedatercero(), gastodto.getValorsitercero(), gastodto.getIdmonedasitercero(),
                    gastodto.getNumpersonas(), gastodto.getIdencuesta()
            );
            long idgasto = gastoService.save(gasto);
            return new ResponseEntity(new Mensaje("Creado con éxito.", idgasto), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity("Ha ocurrido un problema.", HttpStatus.NOT_MODIFIED);
        }
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Gasto> getByIdgastoDetail(@PathVariable("id") Long idgasto){

        try {
            Optional<Gasto> gasto = gastoService.getOne(idgasto);
            return new ResponseEntity(gasto, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity("Ha ocurrido un problema.", HttpStatus.NOT_MODIFIED);
        }
    }
}
