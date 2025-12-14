package com.empresa.sistema.app;

import com.empresa.sistema.model.Cliente;
import com.empresa.sistema.model.Produto;
import com.empresa.sistema.model.Pedido;
import com.empresa.sistema.service.PedidoService;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Roger");

        Produto p1 = new Produto("Notebook", 3000);
        Produto p2 = new Produto("Mouse", 100);

        Pedido pedido = new Pedido(cliente);
        pedido.adicionarProduto(p1);
        pedido.adicionarProduto(p2);

        PedidoService service = new PedidoService();
        service.pagar(pedido);

        System.out.println(pedido.getStatus());
        System.out.println(pedido.getTotal());
    }
}

/* Produtos do pedido:
Notebook - R$ 3000.0
Mouse - R$ 100.0
PAGO
3100.0 */