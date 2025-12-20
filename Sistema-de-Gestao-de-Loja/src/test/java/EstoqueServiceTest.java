package test.java;

import br.com.loja.model.Produto;
import br.com.loja.service.EstoqueService;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

 class EstoqueServiceTest {

     @Test
     void deveRetornarProdutoMaisCaro() {

         EstoqueService estoque = new EstoqueService();

         estoque.adicionarProduto(new Produto(1L, "Notebook", 1500, 1));
         estoque.adicionarProduto(new Produto(2L, "Mouse", 25, 5));
         estoque.adicionarProduto(new Produto(3L, "Monitor", 400, 10));

         Produto produtoMaisCaro = estoque.produtoMaisCaro();

         assertNotNull(produtoMaisCaro);
         assertEquals("Notebook", produtoMaisCaro.getNome());
     }

     @Test
     void deveCalcularValorTotalDoEstoque() {

         EstoqueService estoque = new EstoqueService();

         estoque.adicionarProduto(new Produto(1L, "Notebook", 1500, 1));
         estoque.adicionarProduto(new Produto(2L, "Mouse", 25, 5));

         double total = estoque.valorTotalEstoque();

         assertEquals(1625.0, total);
     }


     @Test
     void deveRetornarNullQuandoEstoqueEstiverVazio() {

         EstoqueService estoque = new EstoqueService();

         Produto produtoMaisCaro = estoque.produtoMaisCaro();

         assertNull(produtoMaisCaro);
     }


 }




