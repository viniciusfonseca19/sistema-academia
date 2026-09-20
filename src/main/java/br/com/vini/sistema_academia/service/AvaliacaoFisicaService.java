package br.com.vini.sistema_academia.service;

import br.com.vini.sistema_academia.database.model.AlunosEntity;
import br.com.vini.sistema_academia.database.model.AvaliacoesFisicasEntity;
import br.com.vini.sistema_academia.database.repository.IAlunosRepository;
import br.com.vini.sistema_academia.database.repository.IAvaliacoesFisicasRepository;
import br.com.vini.sistema_academia.dto.AvaliacaoFisicaDto;
import br.com.vini.sistema_academia.exception.BadRequestException;
import br.com.vini.sistema_academia.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AvaliacaoFisicaService {

    private final IAlunosRepository alunosRepository;
    private final IAvaliacoesFisicasRepository avaliacaoFisicasRepository;

    public void criarAvaliacaoFisica(AvaliacaoFisicaDto avaliacaoFisicaDto) throws NotFoundException, BadRequestException {
        AlunosEntity alunos = alunosRepository.findById(avaliacaoFisicaDto.getAlunoId())
                .orElseThrow(() -> new NotFoundException("Aluno não encontrado"));

        AvaliacoesFisicasEntity avaliacoesFisicas = alunos.getAvaliacoesFisicas();
        if (avaliacoesFisicas != null){
            throw new BadRequestException("Avaliação Física já cadastrada para este aluno");
        }

        avaliacoesFisicas = AvaliacoesFisicasEntity.builder()
                .peso(avaliacaoFisicaDto.getPeso())
                .altura(avaliacaoFisicaDto.getAltura())
                .porcentagemGorduraCorporal(avaliacaoFisicaDto.getPorcentagemGorduraCorporal())
                .build();
    }
}