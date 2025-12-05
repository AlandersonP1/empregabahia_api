package br.com.empregabahia.controller;


import br.com.empregabahia.model.*;
import br.com.empregabahia.repository.OrdemAlfabeticarepository;
import br.com.empregabahia.repository.VagasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
    @RequestMapping("/vagas")
    public class VagaController {
    @Autowired
    private VagasRepository vagasRepository;
    private VagaService vagaService;
    private OrdemAlfabeticarepository ordemAlfabeticarepository;
    private Vagaexclusaoservice vagaexclusaoservice;

    @GetMapping("/{id}")
    public Vaga buscarPorId(@PathVariable(value = "id") Long vagaId) {
        Vaga vaga = new Vaga();
        if (vagaId == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Recurso não encontrado com o ID: " + id);


        }
        return vaga;
    }

    @GetMapping("/ordenadas")
    public List<Vaga> listarVagasOrdenadasPorTitulo() {
        return vagaService.listarVagasOrdenadasPorTitulo();


    }

    @GetMapping
    public List<Vaga> getVagasByRegiao(@RequestParam Long LocalidadeDavagaId) {
        LocalidadeDaVaga localidadeDaVaga = new LocalidadeDaVaga();
        localidadeDaVaga.setId(LocalidadeDavagaId);
        return vagasRepository.findByLocalidadeDavaga(localidadeDaVaga);
    }

    @GetMapping
    public List<Vaga> getVagasByEspecialidade(@RequestParam Long especialidadeId) {
        Especialidade especialidade = new Especialidade();
        especialidade.setId(especialidadeId);
        return vagasRepository.findByEspecialidade(especialidade);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirVaga(@PathVariable Long id) {
        if (vagaexclusaoservice.excluirVaga(id)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }
}























