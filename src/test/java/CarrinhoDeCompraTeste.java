import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;

public class CarrinhoDeCompraTeste {

    @Test

    public void deve_adicionar_um_item_ao_carrinho()throws ValorInvalido {

        String descricao= "cama";
        Double valor= 1600d;
        Produto cama = new Produto(descricao,valor);

        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        carrinhoDeCompra.adicionar(cama);

        assertThat(carrinhoDeCompra.getItensDoCarrinho(), contains(cama));


    }

    @Test
    public void deve_adicionar_um_produto_duas_vezes_e_incrementar_a_quantidade()throws ValorInvalido{
        String descricao = "cama";
        Double valor = 1600d;
        int quantidadeEsperada = 2;

        Produto cama = new Produto(descricao, valor);
        Produto celular = new Produto("Celular", 1800d);

        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        carrinhoDeCompra.adicionar(cama);
        carrinhoDeCompra.adicionar(celular);
        carrinhoDeCompra.adicionar(celular);
        carrinhoDeCompra.adicionar(cama);

        int quantidadeRetornada = carrinhoDeCompra.getItensDoCarrinho().size();
        assertEquals(quantidadeEsperada, quantidadeRetornada);
    }

    @Test
    public void deve_remover_um_produto_do_carrinho() throws ValorInvalido{
        String descricao = "cama";
        Double valor = 1600d;

        Produto cama= new Produto(descricao,valor);
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        carrinhoDeCompra.adicionar(cama);
        carrinhoDeCompra.remover(cama);

        assertThat(carrinhoDeCompra.getItensDoCarrinho(),not(contains(cama)));

    }

    @Test(expected = ValorInvalido.class)
    public void nao_deve_aceitar_valor_negativo() throws ValorInvalido {
        String descricao="Notebook";
        Double valor = -3000d;

        new Produto(descricao,valor);
    }


}
