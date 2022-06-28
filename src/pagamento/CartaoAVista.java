package pagamento;

import caixa.CarrinhoDeCompra;

public class CartaoAVista implements FormaDePagamento{

    @Override
    public String pagar(CarrinhoDeCompra carrinhoDeCompra) {
        // TODO Auto-generated method stub
        return "Cartão à vista";
    }
    

}
