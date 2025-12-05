package br.com.empregabahia.model;


import br.com.empregabahia.repository.VagaatulizadaRepository;
import br.com.empregabahia.repository.VagasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Vagatualizadaservice {






        @Autowired
        private VagaatulizadaRepository vagaatulizadaRepository;

        public Vaga atualizarVaga(Long id, Vaga vagaAtualizada) {
            Vaga vagaExistente = vagaatulizadaRepository.findById(id).orElse(null);
            if (vagaExistente != null) {

                vagaExistente.setTitulo(vagaAtualizada.getTitulo());
                vagaExistente.setDescricao(vagaAtualizada.getDescricao());


                return vagaatulizadaRepository.save(vagaExistente);
            } else {
                return null;
            }
        }
    }

