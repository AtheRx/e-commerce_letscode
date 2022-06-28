package pagamento;

import caixa.CarrinhoDeCompra;

public interface FormaDePagamento {

    public String pagar(CarrinhoDeCompra carrinhoDeCompra);

}
