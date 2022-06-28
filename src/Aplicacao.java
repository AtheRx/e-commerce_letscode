import caixa.CarrinhoDeCompra;
import caixa.Checkout;
import pagamento.CartaoAVista;
import pagamento.CartaoParcelado;
import pagamento.FormaDePagamento;

public class Aplicacao {
    public static void main(String[] args) throws Exception {
    
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

        FormaDePagamento formaDePagamento = new CartaoParcelado(10);

        Checkout checkout = new Checkout();
        checkout.fecharCompra(carrinhoDeCompra, formaDePagamento);
        

    }
}
