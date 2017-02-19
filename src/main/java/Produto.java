public class Produto {
    private final String descricao;
    private final Double valor;
    public int quantidade;

    public Produto(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = 0;
    }

    public int getQuantidade(){
        return this.quantidade;
    }
    public void incrementarQuantidade(){
        this.quantidade++;
    }
}
