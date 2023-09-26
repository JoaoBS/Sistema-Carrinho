package br.com.sistemacarrinho.util;

import br.com.sistemacarrinho.modelos.Produto;

public class PreparaProduto {

    Produto produto;
    float valor;

    public PreparaProduto(Produto produto, float valor) {
        this.produto = produto;
        this.valor = valor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
