package br.com.loja.service;

import br.com.loja.model.Cliente;
import java.util.HashMap;
import java.util.Map;

public class ClienteService {

    private Map<String, Cliente> clientes = new HashMap<>();

    public void adicionarCliente(Cliente cliente) {
clientes.put(cliente.getCpf(), cliente);
    }

public Cliente buscarClientePorCpf(String cpf) {
        return clientes.get(cpf);
}

public void listarClientes() {
    System.out.println(clientes);
}

}
