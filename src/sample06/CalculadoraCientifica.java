package sample06;

import sample05.Calculadora;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculadoraCientifica extends Calculadora {

    public double exponenciar(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    @Override
    public double divisao() {
        return divisao(false);
    }

    // Overload
    public double divisao(boolean arredondar) {
        double divisao = super.divisao();
        return arredondar ? arredondar(divisao) : divisao;
    }

    private double arredondar(double d) {
        BigDecimal bd = new BigDecimal(d);
        bd = bd.setScale(1, RoundingMode.HALF_DOWN);
        return bd.doubleValue();
    }
}
