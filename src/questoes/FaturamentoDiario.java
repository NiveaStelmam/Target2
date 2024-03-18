package questoes;

import java.util.Arrays;

public class FaturamentoDiario {
    public static void main(String[] args) {
        double[] faturamentoDiario = {100, 200, 150, 180, 220, 210, 190};
        double menorValor = Arrays.stream(faturamentoDiario).min().getAsDouble();
        double maiorValor = Arrays.stream(faturamentoDiario).max().getAsDouble();
        double mediaMensal = Arrays.stream(faturamentoDiario).average().getAsDouble();
        long diasAcimaMedia = Arrays.stream(faturamentoDiario).filter(valor -> valor > mediaMensal).count();

        System.out.println("Menor valor de faturamento: R$" + menorValor);
        System.out.println("Maior valor de faturamento: R$" + maiorValor);
        System.out.println("Dias acima da média mensal: " + diasAcimaMedia);
    }
}
