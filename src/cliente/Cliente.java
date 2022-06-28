package cliente;
import caixa.CarrinhoDeCompra;
import produtos.Produto;

public class Cliente {

    private String nome;
    private CarrinhoDeCompra carrinhoDeCompra;


    public Cliente(String nome) {
        this.nome = nome;
        this.carrinhoDeCompra = new CarrinhoDeCompra();
    }

    public void adicionarProdutoAoCarrinho(Produto produto){
        carrinhoDeCompra.adicionar(produto);
    }

    public CarrinhoDeCompra getCarrinhoDeCompra() {
        return carrinhoDeCompra;
    }

    


}
