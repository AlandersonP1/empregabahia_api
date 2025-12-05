package br.com.empregabahia.controller;


import br.com.empregabahia.model.Vaga;
import br.com.empregabahia.model.Vagatualizadaservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Vagaatulizadacontroller {
    @Autowired
    private Vagatualizadaservice vagatualizadaservice;

    @PutMapping("/{id}")
    public ResponseEntity<Vaga> atualizarVaga(@PathVariable Long id, @RequestBody Vaga vagaAtualizada) {
        Vaga vaga = vagatualizadaservice.atualizarVaga(id, vagaAtualizada);
        if (vaga != null) {
            return new ResponseEntity<>(vaga, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }
}
