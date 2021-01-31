package br.edu.ifpi.poo.banco.visao;

import java.util.Scanner;

import br.edu.ifpi.poo.banco.cadastros.Banco;
import br.edu.ifpi.poo.banco.entidade.AplicacaoException;
import br.edu.ifpi.poo.banco.entidade.Conta;
import br.edu.ifpi.poo.banco.entidade.ContaImposto;
import br.edu.ifpi.poo.banco.entidade.Poupanca;

public class ExecutaBanco {
	private static Banco b;
	private static Scanner sc;

	public static void main(String[] args) {
		b = new Banco();
		sc = new Scanner(System.in);
		String opcao = "";

		String numero = "";

		do {
			try {
				System.out.println("\n\n1-Cadastrar 2-Excluir 3-Consultar 4-Creditar 5-transferir 6-render juros 7-debitar... 9-Sair");
				System.out.println("Digite uma opção:");
				opcao = sc.next();
	
				switch (opcao) {
				case "1":
					inserir();
					break;
				case "2":
					excluir();
					break;
				case "3":
					consultar();
					break;
				case "4":
					creditar();
					break;
				case "5":
					transferir();
					break;
				case "6":
					renderJuros();
					break;
				case "7":
					debitar();
					break;
	
				}
			} catch (AplicacaoException e) {
				System.out.println("Erro:" + e.getMessage());
			} catch (Exception e) {
				System.out.println("Erro inesperado. Tente novamente.");
			}
		} while (!opcao.equals("9"));
	}

	private static void renderJuros() {
		String numero;
		System.out.println("Digite o n�mero da conta:");
		numero = sc.next();
		b.renderJuros(numero);
		System.out.println("Novo saldo:" + b.consultar(numero).getSaldo());
	}

	private static void transferir() {
		String numeroCredito;
		System.out.println("Digite o n�mero da conta de credito:");
		numeroCredito = sc.next();

		String numeroDebito;
		System.out.println("Digite o n�mero da conta de d�bito:");
		numeroDebito = sc.next();

		System.out.println("Digite o valor da transfer�ncia:");
		double valor = sc.nextDouble();
		
		b.transferir(numeroCredito, numeroDebito, valor);
		System.out.println("Novo saldo creditado: " + b.consultar(numeroCredito));
		System.out.println("Novo saldo debitado: " + b.consultar(numeroDebito));
		
	}

	private static void creditar() {
		String numero;
		System.out.println("Digite o n�mero:");
		numero = sc.next();
		System.out.println("Digite o valor do cr�dito:");
		double valor = sc.nextDouble();
		b.creditar(numero, valor);
		System.out.println("Novo saldo: " + b.consultar(numero).getSaldo());
	}

	
	private static void debitar() {
		String numero;
		System.out.println("Digite o n�mero:");
		numero = sc.next();
		System.out.println("Digite o valor do d�bito:");
		double valor = sc.nextDouble();
		b.debitar(numero, valor);
		System.out.println("Novo saldo: " + b.consultar(numero).getSaldo());
	}

	private static void consultar() {
		String numero;
		Conta c;
		System.out.println("Digite o n�mero:");
		numero = sc.next();
		c = b.consultar(numero);
		if (c != null) {
			System.out.println("N�mero: " + c.getNumero() + " - Saldo: " + c.getSaldo());
		} else {
			System.out.println("Conta n�o encontrada.");
		}
	}

	private static void excluir() {
		String numero;
		System.out.println("Digite o n�mero:");
		numero = sc.next();
		b.excluir(numero);
	}

	private static void inserir() {
		Conta c;
		System.out.println("Digite o n�mero:");
		String numero = sc.next();
		System.out.println("Digite o tipo de conta: 1) Conta  2) Poupan�a  3) Conta Imposto");
		String tipo = sc.next();
		System.out.println("Digite o saldo inicial:");
		double saldo = sc.nextDouble();
		
		if (tipo.equals("1")) {
			c = new Conta(numero, saldo);
		} else if (tipo.equals("2")) {
			System.out.println("Digite a taxa de rendimento:");
			double taxa = sc.nextDouble();
			c = new Poupanca(numero, saldo, taxa);
		} else if (tipo.equals("3")) {
			c = new ContaImposto(numero, saldo);
		}
		c = new Conta(numero, saldo);
		
		b.inserir(c);
		System.out.println("Conta cadastrada com sucesso.");

	}
}
