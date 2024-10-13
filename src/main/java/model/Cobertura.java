package model;
public class Cobertura {
    private String tipo;
    private double valorMaximo;

    public Cobertura(String tipo, double valorMaximo) {
        this.tipo = tipo;
        this.valorMaximo = valorMaximo;
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(double valorMaximo) {
        this.valorMaximo = valorMaximo;
    }
}

