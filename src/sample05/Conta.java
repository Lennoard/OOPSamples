package sample05;

public class Conta {
    private String numero;
    private double saldo;

    Conta() {

    }

    Conta(String num, double saldoInicial) {
        this.numero = num;
        this.saldo = saldoInicial;
    }

    public boolean sacar(double valor) {
        if ((saldo - valor) < 0) {
            return false;
        }
        saldo -= valor;
        return true;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public boolean transferir(Conta destino, double valor) {
        if (!this.sacar(valor)) {
            return false;
        }

        destino.depositar(valor);
        return true;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
