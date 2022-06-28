import caixa.Checkout;
import cliente.Cliente;
import pagamento.Boleto;
import pagamento.FormaDePagamento;
import produtos.CategoriaProduto;
import produtos.Produto;

public class Aplicacao {
    public static void main(String[] args) throws Exception {
    
        Produto teclado = new Produto("Teclado","Teclado de computador USB", "10.50", CategoriaProduto.INFORMATICA);
        Produto monitor = new Produto("Monitor","Monitor HDMI", "200.00", CategoriaProduto.INFORMATICA);
        Produto geladeira = new Produto("Geladeira","Geladeira Grande", "3599.00", CategoriaProduto.CASA);

        Cliente cliente = new Cliente("Fabio");

        cliente.adicionarProdutoAoCarrinho(teclado);
        cliente.adicionarProdutoAoCarrinho(monitor);
        cliente.adicionarProdutoAoCarrinho(geladeira);

        FormaDePagamento formaDePagamento = new Boleto();

        Checkout checkout = new Checkout();
        checkout.fecharCompra(cliente, formaDePagamento);
    }
}
