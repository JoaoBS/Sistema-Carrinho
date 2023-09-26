package br.com.sistemacarrinho.util;

import br.com.sistemacarrinho.modelos.Produto;

import java.util.ArrayList;

public class ManipularValorProduto {

    public static void calcularAcrescimo(PreparaProduto preparaProduto) {
        float valorProduto = preparaProduto.produto.getValorTotal();
        float acrescimo = preparaProduto.getValor();
        float valorComAcrescimo = valorProduto + acrescimo;
        preparaProduto.getProduto().setAcrescimo(acrescimo);
        preparaProduto.getProduto().setValorTotal(valorComAcrescimo);
    }

    public static void calcularDesconto(PreparaProduto preparaProduto) {
        float valorProduto = preparaProduto.produto.getValorTotal();
        float desconto = preparaProduto.getValor();
        float valorComDesconto = valorProduto - desconto;
        preparaProduto.getProduto().setDesconto(desconto);
        preparaProduto.getProduto().setValorTotal(valorComDesconto);
    }
}
