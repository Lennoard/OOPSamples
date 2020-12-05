package sample01;

public class Desconto {
    double valorOriginal;
    double desconto;

    double calcula() {
        return valorOriginal * (1 - desconto / 100);
    }
}
