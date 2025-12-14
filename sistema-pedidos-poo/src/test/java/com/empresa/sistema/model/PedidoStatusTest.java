package com.empresa.sistema.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoStatusTest {

    @Test
    void deveMudarStatusParaPago() {

        Cliente cliente = new Cliente("Roger");
        Pedido pedido = new Pedido(cliente);

        pedido.setStatus(StatusPedido.PAGO);

        assertEquals(StatusPedido.PAGO, pedido.getStatus());
    }
}
