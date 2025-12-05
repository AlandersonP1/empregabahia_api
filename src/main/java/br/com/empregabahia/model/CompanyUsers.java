package br.com.empregabahia.model;

import br.com.empregabahia.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/CompanyUsers")
public class CompanyUsers {


    @Autowired
        private CompanyRepository companyRepository;



    @GetMapping("/Produto1")
        public List<CoRe> Obterproduto1() {
            return companyRepository.findAll();


    }




}


