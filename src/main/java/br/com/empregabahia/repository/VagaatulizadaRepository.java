package br.com.empregabahia.repository;

import br.com.empregabahia.model.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VagaatulizadaRepository extends JpaRepository<Vaga, Long> {

}
