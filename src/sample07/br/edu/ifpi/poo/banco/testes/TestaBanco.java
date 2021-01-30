package sample07.br.edu.ifpi.poo.banco.testes;

import sample07.br.edu.ifpi.poo.banco.entidade.AplicacaoException;
import sample07.br.edu.ifpi.poo.banco.entidade.Conta;

public class TestaBanco {
	public static void main(String[] args) {
		Conta c = new Conta("1", 100);
		try {
			c.sacar(10);
			c.sacar(1000);
			System.out.println("Esse código não executa.");
		} catch (AplicacaoException e) {
			System.out.println("Exceção capturada: " + e.getMessage());
		}
		System.out.println("Programa finalizado com sucesso");
	}
}
