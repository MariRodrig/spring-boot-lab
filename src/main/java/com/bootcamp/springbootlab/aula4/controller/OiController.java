package com.bootcamp.springbootlab.aula4.controller;

import com.bootcamp.springbootlab.aula4.model.mensagem.Mensagem;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aula4")
public class OiController {

    @GetMapping("/ola")
    public String ola() {
        return "Olá, Elas Tech!";
    }

    @GetMapping("/mensagem")
    public Mensagem mensagem() {
        return new Mensagem("Bem-vindas ao Spring!", "Mariana");
    }

    // GET /aula4/ola/Alfredo  -> Olá, Alfredo!
    @GetMapping("/ola/{nome}")
    public String olaPorNome(@PathVariable String nome) {
        return "Olá, " + nome + "!";
    }

    // GET  /aula4/saudacao?nome=Alfredo  -> Seja bem vindo, Alfredo!
    @GetMapping("/saudacao")
    public String saudacao(@RequestParam(defaultValue = "visitante") String nome){
        return "Seja bem vindo, " + nome + "!";
    }

}
