package br.com.vini.sistema_academia.controller;

import br.com.vini.sistema_academia.database.model.AlunoDto;
import br.com.vini.sistema_academia.exception.BadRequestException;
import br.com.vini.sistema_academia.service.AlunoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/alunos")
@RequiredArgsConstructor
public class AlunosController {

    private final AlunoService alunoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarAluno(@Valid @RequestBody AlunoDto alunoDto) throws BadRequestException {
        alunoService.criarAluno(alunoDto);
    }
}
