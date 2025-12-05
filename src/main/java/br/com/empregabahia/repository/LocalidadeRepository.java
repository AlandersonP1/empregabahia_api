package br.com.empregabahia.repository;

import br.com.empregabahia.model.LocalidadeDaVaga;
import br.com.empregabahia.model.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocalidadeRepository   extends JpaRepository<Vaga, Long> {
        List<Vaga> findByRegiao(LocalidadeDaVaga localidadeDaVaga);
        }

