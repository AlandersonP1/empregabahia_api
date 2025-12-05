package br.com.empregabahia.repository;

import br.com.empregabahia.model.Especialidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EspecialidadeRepository  extends JpaRepository<Especialidade, Long> {
}
