package sample07.br.edu.ifpi.poo.banco.cadastros;

import sample07.br.edu.ifpi.poo.banco.entidade.AplicacaoException;
import sample07.br.edu.ifpi.poo.banco.entidade.Conta;
import sample07.br.edu.ifpi.poo.banco.entidade.Poupanca;

public class Banco {
	private Conta[] contas;
	private int indice = 0;

	public Banco() {
		contas = new Conta[50];
	}

	public Banco(int tamanho) {
		contas = new Conta[tamanho];
	}

	public void inserir(Conta c) {
		if (indice >= contas.length) {
			throw new AplicacaoException("Número máximo de contas atingido");
		}
		contas[indice] = c;
		indice++;
	}

	public Conta consultar(String numero) throws AplicacaoException {
		Conta c = null;
		for (int i = 0; i < indice; i++) {
			if (contas[i].getNumero().equals(numero)) {
				c = contas[i];
				break;
			}
		}

		if (c == null) throw new AplicacaoException("Nenhuma conta foi encontrada com o número " + numero);
		return c;
	}

	private int consultarIndice(String numero) {
		int pos = -1;
		for (int i = 0; i < indice; i++) {
			if (contas[i].getNumero().equals(numero)) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	public void debitar(String numero, double valor) throws AplicacaoException {
		Conta c;
		c = consultar(numero);
		if (c == null) {
			throw new AplicacaoException("Conta inexistente.");
		}
		
		c.sacar(valor);
	}

	public void creditar(String numero, double valor) throws AplicacaoException {
		Conta c;
		c = consultar(numero);
		if (c == null) throw new AplicacaoException("Conta não encontrada");

		c.depositar(valor);
	}
	
	public void transferir(String numCredito, String numDebito, double valor) {
		Conta contaCredito = consultar(numCredito);
		Conta contaDebito = consultar(numDebito);

		if (contaCredito == null || contaDebito == null) {
			throw new AplicacaoException("As duas contas devem existir.");
		}
		contaCredito.transferir(contaDebito, valor);
	}

	public void alterar(Conta c) {
		int indice = consultarIndice(c.getNumero());
		if (indice != -1) {
			contas[indice] = c;
		}

	}

	public void excluir(String numero) {
		int posicao = consultarIndice(numero);
		if (posicao == -1) {
			throw new AplicacaoException("Índice não encontrado");
		}

		for (int i = posicao; i < indice; i++) {
			contas[i] = contas[i + 1];
		}

		indice--;
	}
	
	public void renderJuros(String numero) {
		Conta c = consultar(numero);
		if (!(c instanceof Poupanca)) {
			throw new AplicacaoException("Poupançaa não encontrada");
		}
		((Poupanca) c).renderJuros();
	}
	
	public int retornaQuantidade() {
		return indice;
	}
	
	public double retornaValorTotal() {
		double total = 0;
		for (int i = 0; i < indice; i++) {
			total += contas[i].getSaldo();
		}
		
		return total;
	}
	
	public double retornaMediaValores() {
		return retornaValorTotal()/retornaQuantidade();
	}
}