package br.com.vini.sistema_academia.database.repository;

import br.com.vini.sistema_academia.database.model.TreinosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITreinosRepository extends JpaRepository<TreinosEntity, Integer> {

}
