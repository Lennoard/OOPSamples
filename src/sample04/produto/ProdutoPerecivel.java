package sample04.produto;

import java.util.Date;

public class ProdutoPerecivel extends Produto {
    private Date dataVencimento;

    public ProdutoPerecivel(Date dataVencimento, String id, String descricao, int quantidade, int valor) {
        super(id, descricao, quantidade, valor);
        this.dataVencimento = dataVencimento;
    }

    public boolean vencido() {
        return dataVencimento.compareTo(new Date()) <= 0;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        return "ProdutoPerecivel{" +
                "dataVencimento=" + dataVencimento +
                "vencido=" + vencido() +
                "} " + super.toString();
    }
}
