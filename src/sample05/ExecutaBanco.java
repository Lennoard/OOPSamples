package sample05;

import java.util.Scanner;

public class ExecutaBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner sc = new Scanner(System.in);
        String opcao = "";
        do {
            System.out.println("1-Cadastrar 2-Alterar 3-Excluir 9-Sair");
            opcao = sc.next();
            switch (opcao) {
                case "1":
                    Conta c = new Conta();
                    System.out.println("Digite o número");
                    c.setNumero(sc.next());
                    c.depositar(sc.nextDouble());
                    //banco.inserir(c);
                    break;
                case "2":
                    break;
            }
        } while (!opcao.equals("9"));
    }
}
