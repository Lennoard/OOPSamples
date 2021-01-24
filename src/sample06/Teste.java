package sample06;

import sample05.Calculadora;

public class Teste {
    public static void main(String[] args) {
        Bovino boi = new Bovino();
        boi.setEspecie("Boi");
        System.out.println(boi.getProducaoLeite());

        Animal peixe = new Peixe();
        peixe.setEspecie("Peixe");
        ((Peixe) peixe).setProdundidade(100);

        Calculadora c = new Calculadora();
        System.out.println(c.divisao());

        CalculadoraCientifica cc = new CalculadoraCientifica();
        System.out.println(c.divisao());

        Pessoa pessoa = new Pessoa("João", "José");
        System.out.println(pessoa.getNomeCompleto());

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setSobrenome("José");

        Empregado empregado = new Empregado();
        ((Horista) empregado).calcularSalario();
    }
}
