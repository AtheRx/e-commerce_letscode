package pagamento;

import caixa.CarrinhoDeCompra;

public class Boleto implements FormaDePagamento{

    @Override
    public String pagar(CarrinhoDeCompra carrinhoDeCompra) {
        // TODO Auto-generated method stub
        return "Boleto";
    }
    

}
