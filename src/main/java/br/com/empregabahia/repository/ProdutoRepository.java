package br.com.empregabahia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<EmpregaBahiaApplication, Long> {
    List<EmpregaBahiaApplication> findAll();
    // Você pode adicionar métodos de consulta personalizados aqui se necessário
}
