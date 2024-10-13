package dao;

import model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private List<Cliente> clientes = new ArrayList<>();

    public void salvar(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente salvo: " + cliente.getNome());
    }

    public List<Cliente> listar() {
        return clientes;
    }
}
