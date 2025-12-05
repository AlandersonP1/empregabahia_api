package br.com.empregabahia.repository;

import br.com.empregabahia.model.CoRe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRepository extends JpaRepository<CoRe, Long > {


}

