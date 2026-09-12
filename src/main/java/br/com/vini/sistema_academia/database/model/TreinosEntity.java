package br.com.vini.sistema_academia.database.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
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
}
