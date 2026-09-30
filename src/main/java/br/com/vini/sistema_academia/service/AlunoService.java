package br.com.vini.sistema_academia.service;

import br.com.vini.sistema_academia.database.model.AlunoDto;
import br.com.vini.sistema_academia.database.model.AlunosEntity;
import br.com.vini.sistema_academia.database.repository.IAlunosRepository;
import br.com.vini.sistema_academia.exception.BadRequestException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.prefs.BackingStoreException;

@Service
@RequiredArgsConstructor
public class AlunoService {

    private final IAlunosRepository alunosRepository;

    public void criarAluno(AlunoDto alunoDto)throws BadRequestException {
       AlunosEntity alunos = alunosRepository.findByEmail(alunoDto.getEmail())
                .orElse(null);

        if (alunos != null) {
            throw new BadRequestException("Email do aluno já cadastrado");
        }

        alunosRepository.save(AlunosEntity.builder()
                        .nome(alunoDto.getNome())
                        .email(alunoDto.getEmail())
                .build());
    }
}
