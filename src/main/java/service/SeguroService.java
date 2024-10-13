package service;

import dao.SeguroDAO;
import model.Seguro;

import java.util.List;

public class SeguroService {
    private static SeguroService instance;
    private SeguroDAO seguroDAO;

    private SeguroService() {
        this.seguroDAO = new SeguroDAO();
    }

    public static SeguroService getInstance() {
        if (instance == null) {
            instance = new SeguroService();
        }
        return instance;
    }

    public void salvarSeguro(Seguro seguro) {
        seguroDAO.salvar(seguro);
    }

    public List<Seguro> listarSeguros() {
        return seguroDAO.listar();
    }
}
