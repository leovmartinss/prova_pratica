package prova.prova_pratica.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Exercicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double series;
    private Double repeticoes;
    private Double descanso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSeries() {
        return series;
    }

    public void setSeries(Double series) {
        this.series = series;
    }

    public Double getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(Double repeticoes) {
        this.repeticoes = repeticoes;
    }

    public Double getDescanso() {
        return descanso;
    }

    public void setDescanso(Double descanso) {
        this.descanso = descanso;
    }
}
