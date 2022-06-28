package caixa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import produtos.Produto;

public class CarrinhoDeCompra {

    private List<Produto> produtos;
    private BigDecimal valorTotal;

    public CarrinhoDeCompra() {
        produtos = new ArrayList<>();
        valorTotal = new BigDecimal("0.00");
    }

    public void adicionar(Produto produto){
        this.produtos.add(produto);
        this.valorTotal = this.valorTotal.add(produto.getPreco());
    }

    public BigDecimal getValorTotal(){
        return valorTotal;
    }

    public List<Produto> getItens(){
        return this.produtos;
    }

}
