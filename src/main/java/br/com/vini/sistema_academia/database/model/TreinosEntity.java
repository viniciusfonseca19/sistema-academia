package br.com.vini.sistema_academia.database.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "treinos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TreinosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//para gerar o id automaticamente no MySQL
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "alunos_id")
    private AlunosEntity alunos;

    @ManyToMany
    @JoinTable(
            name = "treino_exercicio",
            joinColumns = @JoinColumn(name = "treino_id"),
            inverseJoinColumns = @JoinColumn(name = "exercicio_id")
    )
    private Set<ExerciciosEntity> exercicios = new HashSet<>();
}
