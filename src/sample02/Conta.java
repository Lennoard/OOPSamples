package sample02;

public class Conta {
    String numero;
    double saldo;

    Conta(String num, double saldoInicial) {
        this.numero = num;
        this.saldo = saldoInicial;
    }

    boolean sacar(double valor) {
        if ((saldo - valor) < 0) {
            return false;
        }
        saldo -= valor;
        return true;
    }

    void depositar(double valor) {
        saldo = saldo + valor;
    }

    double consultarSaldo() {
        return saldo;
    }

    boolean transferir(Conta destino, double valor) {
        if (!this.sacar(valor)) {
            return false;
        }

        destino.depositar(valor);
        return true;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
