package Exercicio4;

import java.util.Arrays;
import java.util.Random;

public class Vendedor extends Funcionario {

    private double[] vendasPorMes = new double[12];
    private double comissaoPercent;

    public double getComissaoPercent() {
        return comissaoPercent;
    }

    public void setComissaoPercent(double comissaoPercent) {
        this.comissaoPercent = comissaoPercent;
    }

    public double getVendasPorMes(int mes) {
        return vendasPorMes[mes];
    }

    public void setVendasPorMes(double vendas, int mes) {
        vendasPorMes[mes] = vendas;
    }
}
