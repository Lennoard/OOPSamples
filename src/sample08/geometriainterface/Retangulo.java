package sample08.geometriainterface;

public class Retangulo implements ICalculavel, IComparavel {
    protected double altura;
    protected double base;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return (2 * base) + (2 * altura);
    }

    @Override
    public int comparar(ICalculavel calculavel) {
        double area = calculavel.area();
        if (area == area()) return 0;

        return area < area() ? -1 : 1;
    }
}
