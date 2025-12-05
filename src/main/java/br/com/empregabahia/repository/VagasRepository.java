package br.com.empregabahia.repository;

import br.com.empregabahia.model.Especialidade;
import br.com.empregabahia.model.LocalidadeDaVaga;
import br.com.empregabahia.model.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface VagasRepository extends JpaRepository<Vaga, Long>{



    List<Vaga> findByLocalidadeDavaga(LocalidadeDaVaga localidadeDaVaga);
    List <Vaga> findByEspecialidade (Especialidade especialidade);
}

