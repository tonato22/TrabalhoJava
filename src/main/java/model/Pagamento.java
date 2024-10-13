package model;

import java.util.Date;

public class Pagamento {
    private double valor;
    private Date dataPagamento;

    public Pagamento(double valor, Date dataPagamento) {
        this.valor = valor;
        this.dataPagamento = dataPagamento;
    }

    // Getters e Setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
