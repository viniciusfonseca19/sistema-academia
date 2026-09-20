package br.com.vini.sistema_academia.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Validated
public class AvaliacaoFisicaDto {

    @NotNull
    private Integer alunoId;

    @NotNull
    private BigDecimal peso;

    @NotNull
    private BigDecimal altura;

    @NotNull
    private BigDecimal porcentagemGorduraCorporal;
}
