package sample04.produto;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Estoque<P extends Produto> {
    private final List<P> produtos = new ArrayList<>();

    public List<P> getProdutos() {
        return produtos;
    }

    public boolean inserir(P produto) {
        if (produtos.contains(produto)) return false;

        produtos.add(produto);
        return true;
    }

    public boolean deletar(P produto) {
        return produtos.remove(produto);
    }

    @Nullable
    public P consultar(String id) {
        for (P p : produtos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }

        return null;
    }

    public void repor(String id, int quantidade) throws Exception {
        P produto = consultar(id);
        if (produto == null) throw new Exception("Nenhum produto encontrado");

        produto.repor(quantidade);
    }

    public void darBaixa(String id, int quantidade) throws Exception {
        P produto = consultar(id);
        if (produto == null) throw new Exception("Nenhum produto encontrado");

        produto.darBaixa(quantidade);
    }

}
