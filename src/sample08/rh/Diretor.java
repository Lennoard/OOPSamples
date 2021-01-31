package sample08.rh;

public class Diretor extends Gerente {

    public Diretor(double salario, double pctParticipacao, String login, String senha) {
        super(salario, pctParticipacao * 1.05, login, senha);
    }
}
