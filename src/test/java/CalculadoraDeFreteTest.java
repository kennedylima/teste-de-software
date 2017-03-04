import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class CalculadoraDeFreteTest {

    @Test
    public void deve_retornar_o_valor_do_frete(){
        double valorDoFreteEsperado = 12.45d;
        String cepOrigem = "79002982";
        String cepDestino = "79002998";

        ServicoDeFrete servicoDeFrete = Mockito.mock(ServicoDeFrete.class);

        Mockito.when(servicoDeFrete.calcularFretePara(cepOrigem,cepDestino))
                .thenReturn(valorDoFreteEsperado);

        CalculadoraDeFrete calculadora = new CalculadoraDeFrete(servicoDeFrete,cepOrigem);
        double valorDoFreteRetornado = calculadora.calcularPara(cepDestino);

        assertEquals(valorDoFreteEsperado, valorDoFreteRetornado, 0.001);
    }
}
