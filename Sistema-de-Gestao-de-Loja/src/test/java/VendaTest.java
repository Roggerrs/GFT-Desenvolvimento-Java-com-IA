package test.java;

import br.com.loja.model.Cliente;
import br.com.loja.model.Produto;
import br.com.loja.model.Venda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


 class VendaTest {

     @Test
     void deveCalcularValorTotalAutomaticamente(){

         // ARRANGE (preparação)
Cliente cliente = new Cliente("123456", "Roger");
Produto produto = new Produto(1L, "Notebook", 1500.0, 10);

// ACT (ação)
         Venda venda = new Venda(cliente, produto, 2);

         // ASSERT (verificação)
         assertEquals(3000.0, venda.getValorTotal());



     }


}
