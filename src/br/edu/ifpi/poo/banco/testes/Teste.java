package br.edu.ifpi.poo.banco.testes;

import br.edu.ifpi.poo.banco.entidade.Conta;

public class Teste {

	public static void main(String[] args) {
		try {
			int[] numeros = new int[5];
	
			for (int i = 0; i < 10; i++) {
				numeros[i] = i;
			}
			System.out.println("Nunca chegará aqui");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("O array ultrapassou o índice 4");
		} finally {
			System.out.println("mesmo caindo na exceção, passa por aqui");
		}
		
		try {
			Conta c = null;
			System.out.println("Erro:" +  c.getNumero());
		} catch (Exception e) {
			System.out.println("Classe não instanciada");
		}

	}

}
