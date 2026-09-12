package br.com.vini.sistema_academia.database.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "exercicios")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ExerciciosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//para gerar o id automaticamente no MySQL
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @Column(name = "grupo_musucular", unique = true)
    private String grupoMuscular;
}
