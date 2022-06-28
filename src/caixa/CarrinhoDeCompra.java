package caixa;

import java.math.BigDecimal;
import java.util.List;

import produtos.Produto;

public class CarrinhoDeCompra {

    private List<Produto> produtos;

    public void adicionar(Produto produto){
        this.produtos.add(produto);
    }

    public BigDecimal getValorTotal(){

        // criar o método que faz a soma do carrinho...
        return new BigDecimal(10.0);
    }

}
