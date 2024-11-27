package prova.prova_pratica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import prova.prova_pratica.entities.Exercicio;
import prova.prova_pratica.entities.Treino;
import prova.prova_pratica.services.TreinoService;

import java.util.List;

@RestController
@RequestMapping
public class TreinoController {
    @Autowired
    private TreinoService treinoService;

    @GetMapping
    public List<Treino> listarTodos(){
        return treinoService.listarTodos();
    }

    @PutMapping("/{id}/treinos")
    public Treino alterarTreinos(@PathVariable Long id, @RequestBody List<Exercicio> exercicios){
        return treinoService.alterarExercicio(id,exercicios);
    }

    @PostMapping Treino adicionar(@RequestBody Treino treino){
        return treinoService.adicionar(treino);
    }

    @DeleteMapping("/{id}/exercicios")
    public void remove (@PathVariable Long id){
        treinoService.remove(id);
    }
}

