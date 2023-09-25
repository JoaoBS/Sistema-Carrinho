package br.com.sistemacarrinho.caixa;

import br.com.sistemacarrinho.modelos.Produto;

import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public boolean adicionarItem(Produto produto) {
        return produtos.add(produto);
    }

    public void listarItem() {
        for(Produto produto: produtos) {
            System.out.print("\nCodigo: " + produto.getCodigo());
            System.out.print("\tDescricao: " + produto.getDescricao());
            System.out.print("\tAcrescimo: " + produto.getAcrescimo());
            System.out.print("\tDesconto: " + produto.getDesconto());
            System.out.print("\tTotal: " + produto.getValorTotal());
        }
    }
}
