package br.com.sistemacarrinho.teste;

import br.com.sistemacarrinho.modelos.Carrinho;
import br.com.sistemacarrinho.modelos.Produto;
import br.com.sistemacarrinho.util.ManipularValorProduto;
import br.com.sistemacarrinho.util.PreparaProduto;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "arroz", 10);
        Produto p2 = new Produto(2, "macarrão", 10);
        Produto p3 = new Produto(3, "feijão", 10);

        Carrinho carrinho = new Carrinho();

        carrinho.adicionarItem(p1);
        carrinho.adicionarItem(p2);
        carrinho.adicionarItem(p3);


        PreparaProduto pp1 = new PreparaProduto(p2, 2);

        ManipularValorProduto.calcularAcrescimo(pp1);

        System.out.println(p2);

        ManipularValorProduto.calcularDesconto(pp1);

        System.out.println(p2);

        float valor = carrinho.calcularValorTotalCarrinho();
        System.out.println(valor);


    }
}
