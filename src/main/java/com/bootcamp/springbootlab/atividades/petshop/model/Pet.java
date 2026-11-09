package com.bootcamp.springbootlab.atividades.petshop.model;

public class Pet {
    private String nome;
    private String especia;
    private int idade;

    public Pet(String nome, String especia, int idade) {
        this.nome = nome;
        this.especia = especia;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecia() {
        return especia;
    }

    public int getIdade() {
        return idade;
    }
}
