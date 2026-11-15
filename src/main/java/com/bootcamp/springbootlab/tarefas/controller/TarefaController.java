package com.bootcamp.springbootlab.tarefas.controller;


import com.bootcamp.springbootlab.muralrecados.service.RecadoService;
import com.bootcamp.springbootlab.tarefas.model.Tarefa;
import com.bootcamp.springbootlab.tarefas.service.TarefaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @GetMapping
    public List<Tarefa> listar() {
        return tarefaService.listar();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Tarefa cadastrar(@RequestBody Tarefa tarefa){
        return tarefaService.cadastrar(tarefa);

    }

}

