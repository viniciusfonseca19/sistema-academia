package br.com.vini.sistema_academia.dto;

import jakarta.validation.constraints.NotBlank;
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

    @NotBlank
    private String nome;

    @NotBlank
    private String grupoMuscular;

}
