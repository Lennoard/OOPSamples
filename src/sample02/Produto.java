package sample02;

import java.util.Objects;

public class Produto {
    private static final int QUANTIDADE_MINIMA_PADRAO = 10;
    int codigo;
    String descricao;
    double valor;
    int quantidade;
    int quantidadeMinima = QUANTIDADE_MINIMA_PADRAO;

    public Produto(int codigo, String descricao, double valor, int quantidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    boolean baixar(int quantidade) {
        if ((this.quantidade - quantidade) < quantidadeMinima) {
            return false;
        }

        this.quantidade -= quantidade;
        return true;
    }

    void repor(int quantidade) {
        this.quantidade += quantidade;
    }

    void reajusta(double taxa) {
        this.valor += this.valor * (taxa / 100);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                ", quantidadeMinima=" + quantidadeMinima +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;

        Produto produto = (Produto) o;
        return this.codigo == produto.codigo;
    }
}
