package br.edu.ifpi.poo.banco.entidade;

public class ContaImposto extends Conta {
	private double taxa = 0.38/100;

	public ContaImposto(String numero, double valor) {
		super(numero, valor);
	}

	@Override
	public void sacar(double valor) {
		super.sacar(valor);
		super.sacar(valor * taxa);
	}
}
