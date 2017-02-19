import java.util.ArrayList;

public class CarrinhoDeCompra {


    ArrayList<Produto> carrinhoDeCompra = new ArrayList<Produto>();

    public void adicionar(Produto cama) {

        cama.incrementarQuantidade();
        carrinhoDeCompra.add(cama);

    }

    public ArrayList<Produto> getItensDoCarrinho() {

        return carrinhoDeCompra;
    }

    public void remover(Produto cama) {
        carrinhoDeCompra.remove(cama);

    }
}
