package caixa;

import java.util.List;

import produtos.Produto;

public class Impressora {

    public static void imprimir (String pagamento, CarrinhoDeCompra carrinhoDeCompra){

        List<Produto> produtos = carrinhoDeCompra.getItens();

        System.out.println("******Itens adquiridos*******");
        produtos.forEach(p -> System.out.println(p.getNome() + "............" + p.getPreco()));
        System.out.println(carrinhoDeCompra.getValorTotal());
        System.out.println("*****************************");
        System.out.println("Forma de Pagamento: " + pagamento);
    }
    
}
