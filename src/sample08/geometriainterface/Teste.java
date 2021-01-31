package sample08.geometriainterface;

public class Teste {
    public static void main(String[] args) {
        Triangulo t = new Triangulo(9, 4, new int[]{5, 8, 5});
        Quadrado q = new Quadrado(16);
        Retangulo r = new Retangulo(5, 10);

        System.out.println(t.area());
        System.out.println(t.perimetro());

        System.out.println(q.area());
        System.out.println(q.perimetro());

        System.out.println(r.area());
        System.out.println(r.perimetro());

        System.out.println("Comparar (r -> q): " + r.comparar(q));
        System.out.println("Comparar (q -> r): " + q.comparar(r));
        System.out.println("Comparar (t -> q): " + t.comparar(q));
    }
}
