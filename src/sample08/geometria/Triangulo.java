package sample08.geometria;

import java.util.Arrays;

public class Triangulo extends AbsFiguraGeometrica {
    private int[] lados;

    public Triangulo(double base, double altura, int[] lados) {
        this.base = base;
        this.altura = altura;
        this.lados = lados;
        init();
    }


    private void init() {
        if (Arrays.stream(lados).count() != 3) throw new AssertionError("3 lados apenas");
        if (base <= 0) throw new IllegalArgumentException("Base invalida");
        if (altura <= 0) throw new IllegalArgumentException("Altura invalida");
        if (!Arrays.stream(lados).allMatch(i -> i > 0)) {
            throw new IllegalArgumentException("Lados inválidos");
        }
    }

    @Override
    public double area() {
        return base * altura / 2;
    }

    @Override
    public double perimetro() {
        return Arrays.stream(lados).asDoubleStream().sum();
    }
}
