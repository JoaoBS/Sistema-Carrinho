package br.com.sistemacarrinho.teste;

import br.com.sistemacarrinho.caixa.Carrinho;
import br.com.sistemacarrinho.caixa.Menu;
import br.com.sistemacarrinho.modelos.Produto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "arroz", 10);
        Produto p2 = new Produto(2, "macarrão", 10);
        Produto p3 = new Produto(3, "feijão", 10);

        int codigoProduto = p1.getCodigo();


        Carrinho carrinho = new Carrinho();

        carrinho.adicionarItem(p1);
        carrinho.adicionarItem(p2);
        carrinho.adicionarItem(p3);

        carrinho.listarItem();


    }
}
