package br.com.empregabahia.controller;

import br.com.empregabahia.model.Especialidade;
import br.com.empregabahia.repository.EspecialidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/especialidades")
public class EspecialidadeController {
    @Autowired
    private EspecialidadeRepository especialidadeRepository;

    @GetMapping
    public List<Especialidade> getAllEspecialidades() {
        return especialidadeRepository.findAll();
    }
}