
package service;

import dao.ClienteDAO;
import model.Cliente;

import java.util.List;

public class ClienteService {
    private static ClienteService instance;
    private ClienteDAO clienteDAO;

    // Construtor privado para implementar o padrão Singleton
    private ClienteService() {
        this.clienteDAO = new ClienteDAO();
    }

    public static ClienteService getInstance() {
        if (instance == null) {
            instance = new ClienteService();
        }
        return instance;
    }

    public void salvarCliente(Cliente cliente) {
        clienteDAO.salvar(cliente);
    }

    public List<Cliente> listarClientes() {
        return clienteDAO.listar();
    }
}
