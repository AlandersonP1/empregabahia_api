package br.com.empregabahia.model;


import br.com.empregabahia.repository.OrdemAlfabeticarepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

    @Service
    public class VagaService {

        @Autowired
        private OrdemAlfabeticarepository ordemAlfabeticarepository;

        public List<Vaga> listarVagasOrdenadasPorTitulo() {
            return ordemAlfabeticarepository.findAllOrderByTitulosAcs();
        }
    }

