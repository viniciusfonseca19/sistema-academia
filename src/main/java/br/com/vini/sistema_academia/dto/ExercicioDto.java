package br.com.vini.sistema_academia.dto;

import lombok.*;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Validated
public class ExercicioDto {

    private String nome;
    private String grupoMuscular;

}
