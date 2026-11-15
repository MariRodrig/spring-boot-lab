package com.bootcamp.springbootlab.muralrecados.service;

import com.bootcamp.springbootlab.muralrecados.model.Recado;
import com.bootcamp.springbootlab.muralrecados.repository.RecadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecadoService {

    private final RecadoRepository recadoRepository;

    public RecadoService(RecadoRepository recadoRepository) {
        this.recadoRepository = recadoRepository;
    }

    public List<Recado> listar(){
        return  recadoRepository.findAll();
    }

    public Recado cadastrar(Recado recado){
        return recadoRepository.save(recado);
    }
}
