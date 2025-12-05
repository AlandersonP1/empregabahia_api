package br.com.empregabahia.controller;

import br.com.empregabahia.model.LocalidadeDaVaga;
import br.com.empregabahia.repository.RegiaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


    @RestController
    @RequestMapping("/api/regioes")
    public class LocalidadeControler {

        @Autowired
        private RegiaoRepository regiaoRepository;

        @GetMapping
        public List<LocalidadeDaVaga> getAllRegioes() {
            return regiaoRepository.findAll();
    }
}
