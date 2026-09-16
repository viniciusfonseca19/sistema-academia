package br.com.vini.sistema_academia.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ExercicioDto {

    private String nome;
    private String grupoMuscular;

}
