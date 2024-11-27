package prova.prova_pratica.services;


import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prova.prova_pratica.entities.Exercicio;
import prova.prova_pratica.entities.Treino;
import prova.prova_pratica.repository.TreinoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TreinoService {
    @Autowired
    private TreinoRepository treinoRepository;

    public List<Treino> listarTodos(){
        return treinoRepository.findAll();
    }

    public Treino adicionar (Treino treino){
        return treinoRepository.save(treino);
    }

    public Treino alterar(Long id, Treino treino){
        if (treinoRepository.existsById(id)){
            treino.setId(id);
            return treinoRepository.save(treino);
        }
        return null;
    }

    public void remove(Long id){
        treinoRepository.deleteById(id);
    }

    public Treino alterarExercicio(Long id, List<Exercicio> exercicios) {
        if (exercicios == null || exercicios.isEmpty()) {
            throw new IllegalArgumentException("O treino deve conter exercicios");
        }
        Optional<Treino> treinoOptional = treinoRepository.findById(id);

        if (treinoOptional.isEmpty()) {
            throw new EntityNotFoundException("Treino não encontrado." + id);
        }
        Treino treino = treinoOptional.get();
        treino.setExercicios(exercicios);
        return treinoRepository.save(treino);
        }
    }

