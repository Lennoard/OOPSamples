package sample05;

public class ContaImposto {
    private String numero;
    private double saldo;

    ContaImposto(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void credito(double valor) {
        this.saldo += valor;
    }

    public void debito(double valor) {
        this.saldo -= valor;
        retemImposto(valor);
    }

    private void retemImposto(double valorDebito) {
        this.saldo -= ((saldo / 100) * 0.38);
    }
}
