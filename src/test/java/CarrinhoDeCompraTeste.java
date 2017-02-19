import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;

public class CarrinhoDeCompraTeste {

    @Test

    public void deve_adicionar_um_item_ao_carrinho() {

        String descricao= "cama";
        Double valor= 1600d;
        Produto cama = new Produto(descricao,valor);

        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        carrinhoDeCompra.adicionar(cama);

        assertThat(carrinhoDeCompra.getItensDoCarrinho(), contains(cama));

    }

    @Test
    public void deve_adicionar_um_produto_duas_vezes_e_incrementar_quantidade(){
        String descricao = "cama";
        Double valor = 1600d;
        int quantidadeEsperada = 2;

        Produto cama = new Produto(descricao, valor);
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        carrinhoDeCompra.adicionar(cama);
        carrinhoDeCompra.adicionar(cama);
        //  verificar se o item ja existe no carrinho...
        int quantidadeRetornada = carrinhoDeCompra.getItensDoCarrinho().get(0).getQuantidade();
        assertEquals(quantidadeEsperada, quantidadeRetornada);


    }
    @Test
    public void deve_remover_um_produto_do_carrinho(){
        String descricao = "cama";
        Double valor = 1600d;

        Produto cama= new Produto(descricao,valor);
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        carrinhoDeCompra.adicionar(cama);
        carrinhoDeCompra.remover(cama);

        assertThat(carrinhoDeCompra.getItensDoCarrinho(),not(contains(cama)));

    }
}
