public class CalculadoraDeDesconto {

    public double calcularDescontoPara(double valorDaCompra) {
         if (valorDaCompra > 200 ){
            return valorDaCompra - (valorDaCompra * 0.5);
        }
        else if (valorDaCompra > 150) {
            return valorDaCompra - (valorDaCompra * 0.1);

        } else if (valorDaCompra > 100 && valorDaCompra <= 150) {
            return valorDaCompra - (valorDaCompra * 0.05);
        }
        return valorDaCompra;


    }
}

