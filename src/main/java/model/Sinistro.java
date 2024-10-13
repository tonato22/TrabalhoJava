package model;

import java.util.Date;

public class Sinistro {
    private String descricao;
    private Date dataOcorrencia;

    public Sinistro(String descricao, Date dataOcorrencia) {
        this.descricao = descricao;
        this.dataOcorrencia = dataOcorrencia;
    }

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(Date dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }
}
