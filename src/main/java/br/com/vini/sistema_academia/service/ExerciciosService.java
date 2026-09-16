package br.com.vini.sistema_academia.service;

import br.com.vini.sistema_academia.database.model.ExerciciosEntity;
import br.com.vini.sistema_academia.database.repository.IExerciciosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExerciciosService {

    private final IExerciciosRepository exerciciosRepository;

    public List<ExerciciosEntity>findAll(){
        return exerciciosRepository.findAll(); //findAll método criado dentro do CrudRepository
    }

}
