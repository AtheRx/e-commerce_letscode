package pagamento;

import caixa.CarrinhoDeCompra;

public class Paypal implements FormaDePagamento{

    @Override
    public String pagar(CarrinhoDeCompra carrinhoDeCompra) {
        // TODO Auto-generated method stub
        return "Paypal";
    }
    

}
