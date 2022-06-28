package pagamento;

public class CartaoParcelado implements FormaDePagamento{
    
    private int parcelas;

    public CartaoParcelado(int parcelas) throws Exception {
        this.setParcelas(parcelas);
    }

    public void setParcelas(int parcelas) throws Exception {

        if(parcelas <= 0 || parcelas > 12){
            throw new Exception("Parcelas devem ser entre 1 e 12");
        }
        this.parcelas = parcelas;
    }

}
