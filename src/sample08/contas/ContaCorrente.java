package sample08.contas;

public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(String nome, double saldo) {
        super(nome, saldo);
    }

    @Override
    public double calcularTributos() {
        return saldo * (10.0 / 100);
    }
}
