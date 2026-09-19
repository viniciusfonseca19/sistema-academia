package br.com.vini.sistema_academia.database.repository;

import br.com.vini.sistema_academia.database.model.ExerciciosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IExerciciosRepository extends JpaRepository<ExerciciosEntity, Integer> {

    public List<ExerciciosEntity> findAllByGrupoMuscular(String grupoMuscular);
}
