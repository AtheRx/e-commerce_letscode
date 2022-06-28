package caixa;

import cliente.Cliente;
import pagamento.FormaDePagamento;

public class Checkout {

    public String fecharCompra(Cliente cliente, FormaDePagamento formaDePagamento) {

        String result = formaDePagamento.pagar(cliente.getCarrinhoDeCompra());

        Impressora.imprimir(result, cliente.getCarrinhoDeCompra());

        return result;
    }
}
