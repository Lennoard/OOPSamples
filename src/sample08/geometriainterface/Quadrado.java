package sample08.geometriainterface;

public class Quadrado extends Retangulo implements ICalculavel, IComparavel {

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

    @Override
    public int comparar(ICalculavel calculavel) {
        double area = calculavel.area();
        if (area == area()) return 0;

        return area < area() ? -1 : 1;
    }
}
