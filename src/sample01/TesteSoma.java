package sample01;

public class TesteSoma {
    public static void main(String[] args) {
        Soma soma = new Soma();
        soma.x = Integer.MIN_VALUE;
        soma.y = Integer.MAX_VALUE;

        System.out.println(soma.calculaSoma());
    }
}
