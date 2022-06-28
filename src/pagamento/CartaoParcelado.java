package pagamento;

import caixa.CarrinhoDeCompra;

public class CartaoParcelado implements FormaDePagamento{
    
    private int parcelas;

    public CartaoParcelado(int parcelas) throws Exception {
        this.setParcelas(parcelas);
    }

    private void setParcelas(int parcelas) throws Exception {

        if(parcelas <= 0 || parcelas > 3){
            throw new Exception("Parcelas devem ser entre 1 e 3");
        }
        this.parcelas = parcelas;
    }

    @Override
    public String pagar(CarrinhoDeCompra carrinhoDeCompra) {

        return "Cartão de Credito em " + this.parcelas + "x";
        
    }



}
