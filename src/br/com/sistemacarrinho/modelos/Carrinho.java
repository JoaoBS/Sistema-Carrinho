package br.com.sistemacarrinho.modelos;

import java.util.ArrayList;

public class Carrinho {

    ArrayList<Produto> produtos = new ArrayList<Produto>();

    public void adicionarItem(Produto produto) {
        produtos.add(produto);
    }

    public Produto buscarItem(int codigoProduto) {
        for (Produto p: produtos) {
            if (p.getCodigo() == codigoProduto) {
                System.out.println("Produto encontrado");
                return p;
            }
        }
        System.out.println("Produto não encontrado");
        return null;
    }

    public float calcularValorTotalCarrinho() {
        float valorTotalCarrinho = 0;
        for (Produto p: produtos) {
            valorTotalCarrinho += p.getValorTotal();
        }
        return valorTotalCarrinho;
    }
}
