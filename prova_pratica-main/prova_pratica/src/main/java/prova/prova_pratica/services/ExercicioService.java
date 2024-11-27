package prova.prova_pratica.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prova.prova_pratica.entities.Exercicio;
import prova.prova_pratica.repository.ExercicioRepository;

import java.util.List;

@Service
public class ExercicioService {
    @Autowired
    private ExercicioRepository exercicioRepository;

    public List<Exercicio> listarExercicios(){
        return exercicioRepository.findAll();
    }

    public Exercicio adicionar(Exercicio exercicio){
        return exercicioRepository.save(exercicio);
    }
    public Exercicio consultarId (long id) {
        return exercicioRepository.findById(id).orElse(null);
    }
}
