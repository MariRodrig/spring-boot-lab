package com.bootcamp.springbootlab.aula4.model.mensagem;

public class Mensagem {
    private String texto;
    private String autora;

    public Mensagem(){
    }

    public Mensagem(String texto, String autora) {
        this.texto = texto;
        this.autora = autora;
    }

    public String getTexto() {
        return texto;
    }

    public String getAutora() {
        return autora;
    }
}
