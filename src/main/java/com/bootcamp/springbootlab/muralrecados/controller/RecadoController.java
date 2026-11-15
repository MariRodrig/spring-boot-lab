package com.bootcamp.springbootlab.muralrecados.controller;

import com.bootcamp.springbootlab.muralrecados.model.Recado;
import com.bootcamp.springbootlab.muralrecados.service.RecadoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recados")
public class RecadoController {
    private final RecadoService recadoService;

    public RecadoController(RecadoService recadoService) {
        this.recadoService = recadoService;
    }

    @GetMapping
    public List<Recado> listar(){
        return recadoService.listar();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Recado cadastrar(@RequestBody Recado recado){
        return recadoService.cadastrar(recado);
    }
}
