package com.empresa.sistema.service;


import com.empresa.sistema.model.Pedido;
import com.empresa.sistema.model.StatusPedido;


public class PedidoService {

    public void pagar(Pedido pedido) {
        pedido.setStatus(StatusPedido.PAGO);

    
}

}
