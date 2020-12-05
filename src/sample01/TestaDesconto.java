package sample01;

public class TestaDesconto {

    public static void main(String[] args) {
        Desconto desconto = new Desconto();
        desconto.valorOriginal = 1333;
        desconto.desconto = 10;

        System.out.println(desconto.calcula());
    }
}
