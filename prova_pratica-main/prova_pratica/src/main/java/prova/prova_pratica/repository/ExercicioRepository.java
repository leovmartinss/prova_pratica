package prova.prova_pratica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prova.prova_pratica.entities.Exercicio;

public interface ExercicioRepository extends JpaRepository<Exercicio, Long> {
}
