package br.com.loja.service;

import br.com.loja.model.Cliente;
import br.com.loja.service.ClienteService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteServiceTest {

    @Test
    void deveAdicionarEBuscarClientePorCpf() {

        ClienteService clienteService = new ClienteService();

        Cliente cliente = new Cliente("12345678900", "Roger");

        clienteService.adicionarCliente(cliente);

        Cliente clienteEncontrado =
                clienteService.buscarClientePorCpf("12345678900");

        assertNotNull(clienteEncontrado);
        assertEquals("Roger", clienteEncontrado.getNome());
        assertEquals("12345678900", clienteEncontrado.getCpf());
    }
}

