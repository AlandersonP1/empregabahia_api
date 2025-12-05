package br.com.empregabahia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vaga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Long id;
        private String titulo;
        private String descricao;
        private String região;
        private String Especialidade;
        private boolean preenchida;
        private boolean aceitandoCandidaturas;

    public boolean isPreenchida() {
        return preenchida;
    }

    public void setPreenchida(boolean preenchida) {
        this.preenchida = preenchida;
    }

    public boolean isAceitandoCandidaturas() {
        return aceitandoCandidaturas;
    }

    public void setAceitandoCandidaturas(boolean aceitandoCandidaturas) {
        this.aceitandoCandidaturas = aceitandoCandidaturas;
    }

    public String getEspecialidade() {
        return Especialidade;
    }

    public void setEspecialidade(String especialidade) {
        Especialidade = especialidade;
    }

    public String getRegião() {
        return região;
    }

    public void setRegião(String região) {
        this.região = região;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
