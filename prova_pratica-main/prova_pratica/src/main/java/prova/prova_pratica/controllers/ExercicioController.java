package prova.prova_pratica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import prova.prova_pratica.entities.Exercicio;
import prova.prova_pratica.entities.Treino;
import prova.prova_pratica.services.ExercicioService;


import java.util.List;

@RestController
@RequestMapping("/exercicios")
public class ExercicioController {
    @Autowired
    private ExercicioService exercicioService;

    @GetMapping
    public List<Exercicio> listarExercicios(){
        return exercicioService.listarExercicios();
    }

    @PostMapping
    public Exercicio adicionar (@RequestBody Exercicio exercicio){
        return exercicioService.adicionar(exercicio);
    }

    @GetMapping("/{id}")
    public Exercicio consultarPorId(@PathVariable Long id){
        return exercicioService.consultarId(id);
    }
}


