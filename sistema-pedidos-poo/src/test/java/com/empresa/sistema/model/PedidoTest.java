package com.empresa.sistema.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoTest {

@Test 

void deveCalcularTotalDoPedido() {

    Cliente cliente = new Cliente("Roger");

    Produto p1 = new Produto("Notebook", 3000);
    Produto p2 = new Produto("Mouse", 100);

    Pedido pedido = new Pedido(cliente);
    pedido.adicionarProduto(p1);
    pedido.adicionarProduto(p2);

    double total = pedido.getTotal();

    assertEquals(3100.0, total);

    
}


}
