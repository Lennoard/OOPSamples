package sample08.geometriainterface;

import java.util.Arrays;

public class Triangulo implements ICalculavel, IComparavel {
    private double altura;
    private double base;
    private final int[] lados;

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

    @Override
    public int comparar(ICalculavel calculavel) {
        double area = calculavel.area();
        if (area == area()) return 0;

        return area < area() ? -1 : 1;
    }
}
