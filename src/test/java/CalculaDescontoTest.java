import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculaDescontoTest {
    CalculadoraDeDesconto calculadoraDeDesconto;

    @Before
    public void inicializar(){
        calculadoraDeDesconto = new CalculadoraDeDesconto();
    }

    @Test
    public void deve_calcular_o_desconto_de_5_porcento_acima_100_reais(){

        double valorDaCompra = 120d;
        double valorDaCompraComDesconto = 114d;

        double valorRetornado = calculadoraDeDesconto.calcularDescontoPara(valorDaCompra);


        assertEquals(valorDaCompraComDesconto, valorRetornado, 0.01);
    }

    @Test
    public void deve_calcular_desconto_de_10_porcento_acima_de_150_reais(){
        double valorDaCompra = 150d;
        double valorDaCompraComDesconto = 142.5d;


        double valorRetornado = calculadoraDeDesconto.calcularDescontoPara(valorDaCompra);

        assertEquals(valorDaCompraComDesconto, valorRetornado, 0.01);
    }

    @Test
    public void deve_calcular_desconto_de_50_porcento_acima_de_200_reais(){
        double valorDaComprado = 250d;
        double valorDaCompraComDesconto = 125d;

        double valorRetornado = calculadoraDeDesconto.calcularDescontoPara(valorDaComprado);

        assertEquals(valorDaCompraComDesconto,valorRetornado,0.01);
    }

}
