package sample04.produto;

import java.util.Objects;

public class Produto {
    private String id;
    private String descricao;
    private int quantidade;
    private int valor;

    public Produto () {

    }

    public Produto(String id, String descricao, int quantidade, int valor) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public void repor(int quantidade) {
        if (quantidade < 0) {
            darBaixa(quantidade);
        } else {
            this.quantidade += quantidade;
        }
    }

    public void darBaixa(int quantidade) {
        if (quantidade > this.quantidade) throw new IllegalArgumentException("Estoque negativo não é permitido");
        this.quantidade -= quantidade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produto produto = (Produto) o;
        return id.equals(produto.id) && descricao.equals(produto.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", valor=" + valor +
                '}';
    }
}
