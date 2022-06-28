package caixa;

import pagamento.FormaDePagamento;

public class Checkout {

    public String fecharCompra(CarrinhoDeCompra carrinhoDeCompra, FormaDePagamento formaDePagamento) {

        String result = formaDePagamento.pagar(carrinhoDeCompra);

        Impressora.imprimir(result, carrinhoDeCompra);

        return result;
    }
}
