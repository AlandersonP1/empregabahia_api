package br.com.empregabahia.model;


import br.com.empregabahia.repository.VagasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Vagaexclusaoservice {
    @Autowired
    private VagasRepository vagasRepository;

    public boolean excluirVaga(Long id) {
        Vaga vaga = vagasRepository.findById(id).orElse(null);
        if (vaga != null && !vaga.isPreenchida() && vaga.isAceitandoCandidaturas()) {
            vagasRepository.delete(vaga);
            return true;
        }
        return false;

 }
}
