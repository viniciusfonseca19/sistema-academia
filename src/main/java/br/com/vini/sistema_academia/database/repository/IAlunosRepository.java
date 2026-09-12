package br.com.vini.sistema_academia.database.repository;

import br.com.vini.sistema_academia.database.model.AlunosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAlunosRepository extends JpaRepository<AlunosEntity, Integer> {

}
