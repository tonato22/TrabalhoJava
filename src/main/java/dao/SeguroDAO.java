package dao;

import model.Seguro;

import java.util.ArrayList;
import java.util.List;

public class SeguroDAO {
    private List<Seguro> seguros = new ArrayList<>();

    public void salvar(Seguro seguro) {
        seguros.add(seguro);
        System.out.println("Seguro salvo: " + seguro.getTipo());
    }

    public List<Seguro> listar() {
        return seguros;
    }
}
