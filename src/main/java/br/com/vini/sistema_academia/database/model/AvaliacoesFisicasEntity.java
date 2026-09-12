package br.com.vini.sistema_academia.database.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "avaliacoes_fisicas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AvaliacoesFisicasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//para gerar o id automaticamente no MySQL
    private UUID id;

    @Column(nullable = false)
    private BigDecimal altura;

    @Column(nullable = false)
    private BigDecimal peso;

    @Column(name = "porcentagem_gordura_corporal", nullable = false)
    private BigDecimal porcentagemGorduraCorporal;

}
