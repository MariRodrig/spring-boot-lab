package com.bootcamp.springbootlab.atividades.petshop.controller;


import com.bootcamp.springbootlab.atividades.petshop.model.Pet;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pets")
public class PetController {

    @GetMapping()
    public String pet() {
        return "Bem-vinda ao Pet Shop Elas Tech!";
    }

    @GetMapping("/horario")
    public String horario() {
        return "Abrimos de segunda a sábado, das 8h às 18h.";
    }

    @GetMapping("/destaque")
    public Pet destaque() {
        return new Pet("Thor", "Cachorro", 3);
    }

    @GetMapping("/adotar/{nome}")
    public String adotarPorNome(@PathVariable String nome) {
        return "Parabéns! Você adotou " + nome + "!";
    }

    @GetMapping("/banho")
    public String banho(@RequestParam(name = "pet", defaultValue = "Seu pet") String nome) {
        return nome + " está tomando banho!";
    }

    @GetMapping("/novo/{nome}")
    public Pet nomeFilhote(@PathVariable String nome) {
        return new Pet(nome, "Gato", 1);
    }

    @GetMapping("/idade-humana")
    public String calcularIdadeHumana(@RequestParam(name = "anos") int anos) {
        int idadeHumana = anos * 7;

        return anos + " anos de pet equivalem a " + idadeHumana + " anos humanos!";
    }

    // Depois teste /pets/idade-humana sem o ?anos=. O que acontece? Por quê?
    // Porque o @RequestParam exige que informe a ideda na URL, para funcionar sem inserir a idade,
    // precisa incluir o defaultValue no metodo


    @GetMapping("/consulta")
    public String consulta(@RequestParam (name = "pet") String nome,
                           @RequestParam(name = "vet") String nomeVet){
        return nome + " tem consulta com " + nomeVet + "!";
    }

}

