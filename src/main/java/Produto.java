public class Produto {
    private final String descricao;
    private final Double valor;
    public int quantidade;

    public Produto(String descricao, Double valor) throws ValorInvalido {
        verificarSeOValorEhMaiorZero(valor);
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = 0;
    }

    private void verificarSeOValorEhMaiorZero(Double valor) throws ValorInvalido {
        if(valor <0){
            throw  new  ValorInvalido();
        }
    }


    public int getQuantidade(){
        return this.quantidade;
    }
    public void incrementarQuantidade(){
        this.quantidade++;
    }
}
