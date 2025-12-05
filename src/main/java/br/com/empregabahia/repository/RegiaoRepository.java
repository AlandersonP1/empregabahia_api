package br.com.empregabahia.repository;

import br.com.empregabahia.model.LocalidadeDaVaga;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegiaoRepository extends JpaRepository<LocalidadeDaVaga, Long> {

}
