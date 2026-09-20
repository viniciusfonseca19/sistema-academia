package br.com.vini.sistema_academia.database.repository;

import br.com.vini.sistema_academia.database.model.AvaliacoesFisicasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAvaliacoesFisicasRepository extends JpaRepository<AvaliacoesFisicasEntity, Integer> {

}
