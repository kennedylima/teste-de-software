import java.util.ArrayList;

public class CarrinhoDeCompra {


    ArrayList<Produto> carrinhoDeCompra = new ArrayList<Produto>();

    public void adicionar(Produto produto) {
        if(carrinhoDeCompra.contains(produto)){
            int indexDoProduto = carrinhoDeCompra.indexOf(produto);
            carrinhoDeCompra.get(indexDoProduto).incrementarQuantidade();

        }else{
            produto.incrementarQuantidade();
            carrinhoDeCompra.add(produto);
        }
    }

    public ArrayList<Produto> getItensDoCarrinho() {
        return carrinhoDeCompra;
    }

    public void remover(Produto cama) {
        carrinhoDeCompra.remove(cama);
    }
}
