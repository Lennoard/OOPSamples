package br.edu.ifpi.poo.banco.entidade;

public class Poupanca extends Conta {
	private double taxaDeJuros;
		
	public void renderJuros() {
		
		double juros = getSaldo() * taxaDeJuros/100;
		depositar(juros);
	}

	public Poupanca(String numero, double valor, double taxaDeJuros) {
		super(numero, valor);
		this.taxaDeJuros = taxaDeJuros;
	}
}
