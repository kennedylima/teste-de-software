public class CalculadoraDeFrete {
    private ServicoDeFrete servicoDeFrete;
    private String cepOrigem;

    public CalculadoraDeFrete(ServicoDeFrete servicoDeFrete, String cepOrigem) {
        this.servicoDeFrete = servicoDeFrete;
        this.cepOrigem = cepOrigem;
    }

    public double calcularPara(String cepDestino) {
        return servicoDeFrete.calcularFretePara(cepOrigem,cepDestino);
    }
}
