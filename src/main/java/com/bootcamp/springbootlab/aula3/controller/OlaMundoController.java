package com.bootcamp.springbootlab.aula3.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // diz que essa parte responde a http e faz json, nao uma pagina da web
@RequestMapping("/ola-mundo")  // determina o prefixo para acessar todas as rotas dessa classe
public class OlaMundoController {

    @GetMapping  // chama esse metodo quando o verbo é GET
    public String olaMundo(){
        return "Olá mundo!";
    }

    @GetMapping("/dog") // chama esse metodo quando o verbo é GET em /dog
    public String olaDog(){
        return "Olá Alfredo!";
    }
}
