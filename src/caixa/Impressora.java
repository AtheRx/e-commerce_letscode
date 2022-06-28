package caixa;

import java.util.List;
import java.util.Locale;
import java.text.NumberFormat;

import produtos.Produto;

public class Impressora {

    public static void imprimir (String pagamento, CarrinhoDeCompra carrinhoDeCompra){

        Locale ptbr = new Locale("pt", "br");
        List<Produto> produtos = carrinhoDeCompra.getItens();

        System.out.println("******Itens adquiridos*******");
        produtos.forEach(p -> {
                String formatadoReais = NumberFormat.getCurrencyInstance(ptbr).format(p.getPreco());
                System.out.println(p.getNome() + "............" + formatadoReais);
            });

        String valorTotalFormatadoReais = NumberFormat.getCurrencyInstance(ptbr).format(carrinhoDeCompra.getValorTotal());
        System.out.println();
        System.out.println("Total: " + valorTotalFormatadoReais);
        System.out.println("*****************************");
        System.out.println("Forma de Pagamento: " + pagamento);


        

    }
    
}
