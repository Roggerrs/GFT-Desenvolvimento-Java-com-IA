package br.com.loja.service;


import br.com.loja.model.Produto;
import java.util.Map;
import java.util.TreeMap;

public class RelatorioService {

    public void listarProdutosOrdenados(Map<Long, Produto> produtos) {
        Map<Long, Produto> ordenado = new TreeMap<>(produtos);
        System.out.println(ordenado);
    }
}
