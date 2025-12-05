package br.com.empregabahia.controller;

import br.com.empregabahia.model.Empresa;
import br.com.empregabahia.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class EmpresaControler {
    @RestController
    @RequestMapping("/api/empresas")
    public class EmpresaController {
        @Autowired
        private EmpresaRepository empresaRepository;

        @PostMapping
        public ResponseEntity<Empresa> cadastrarEmpresa(@RequestBody Empresa empresa) {
            Empresa novaEmpresa = empresaRepository.save(empresa);
            return new ResponseEntity<>(novaEmpresa, HttpStatus.CREATED);
        }


    }
}
