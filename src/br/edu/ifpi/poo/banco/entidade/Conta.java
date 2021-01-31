package br.edu.ifpi.poo.banco.entidade;

public class Conta {
	private String numero;
	private double saldo;

	public Conta(String numero, double valor) {
		this.numero = numero;
		depositar(valor);
	}

	public void sacar(double valor) {
		validaValor(valor);
		if (saldo < valor) {
			throw new AplicacaoException("Saldo insuficiente.");
		}
		saldo = saldo - valor;
	}

	public void depositar(double valor) {
		validaValor(valor);
		saldo = saldo + valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
	}

	public String getNumero() {
		return numero;
	}

	private void validaValor(double valor) {
		if (valor <= 0) throw new IllegalArgumentException("Valor inválido");
	}

}
