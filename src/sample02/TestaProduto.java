package sample02;

public class TestaProduto {
    public static void main(String[] args) {
        Produto margarina = new Produto(1, "Margarina", 4.59, 60);
        margarina.quantidadeMinima = 5;

        margarina.baixar(80);
        margarina.repor(100);
        margarina.baixar(120);
        margarina.reajusta(10);

        Produto caderno = new Produto(2, "Caderno", 39.99, 30);
        caderno.quantidadeMinima = 12;

        caderno.baixar(4);
        caderno.repor(100);
        caderno.baixar(190);
        caderno.reajusta(50);


        System.out.println(margarina);
        System.out.println(caderno);
    }
}
