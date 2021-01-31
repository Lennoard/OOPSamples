package sample08.geometria;

public class Quadrado extends Retangulo {

    public Quadrado(double lado) {
        super(lado, lado);
    }

    @Override
    public double area() {
        return Math.pow(base, 2);
    }

    @Override
    public double perimetro() {
        return 4 * base;
    }
}
