package sample04.produto;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestaProduto {

    public static void main(String[] args) {
        Produto p = new Produto("0", "Maçã", 20, 1);
        Estoque<Produto> estoque = new Estoque<>();
        estoque.inserir(p);

        Calendar vencimento = new GregorianCalendar();
        vencimento.set(Calendar.DAY_OF_MONTH, 1);
        vencimento.set(Calendar.MONTH, 0);
        vencimento.set(Calendar.YEAR, 2021);

        Produto p2 = new ProdutoPerecivel(
                new Date(vencimento.getTimeInMillis()),
                "1",
                "Banana",
                53,
                1
        );
        estoque.inserir(p2);

        try {
            estoque.darBaixa("1", 90);
            estoque.repor("0", 56);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println(estoque.getProdutos());
    }
}
