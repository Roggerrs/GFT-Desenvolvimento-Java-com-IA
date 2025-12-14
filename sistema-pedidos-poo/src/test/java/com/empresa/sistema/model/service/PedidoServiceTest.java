package com.empresa.sistema.model.service;


import com.empresa.sistema.model.*;
import com.empresa.sistema.service.PedidoService;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PedidoServiceTest {

@Test
    void devePagarPedido() {

        Cliente cliente = new Cliente("Roger");
        Pedido pedido = new Pedido(cliente);

        PedidoService service = new PedidoService();
        service.pagar(pedido);

        assertEquals(StatusPedido.PAGO, pedido.getStatus());
    }
}
