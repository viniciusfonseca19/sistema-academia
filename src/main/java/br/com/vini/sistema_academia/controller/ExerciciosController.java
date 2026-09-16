package br.com.vini.sistema_academia.controller;

import br.com.vini.sistema_academia.database.model.ExerciciosEntity;
import br.com.vini.sistema_academia.service.ExerciciosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/exercicios")
@RequiredArgsConstructor
public class ExerciciosController {

    private final ExerciciosService exerciciosService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ExerciciosEntity> findAll(){
        return exerciciosService.findAll();
    }
}
