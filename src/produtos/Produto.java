package produtos;

import java.math.BigDecimal;

public class Produto {
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private CategoriaProduto categoriaProduto;

    public Produto(String nome, String descricao, String preco, CategoriaProduto categoriaProduto) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = new BigDecimal(preco);
        this.categoriaProduto = categoriaProduto;
    }

    public String getNome() {
        return this.nome;
    }

    public BigDecimal getPreco() {
        return this.preco;
    }

}
