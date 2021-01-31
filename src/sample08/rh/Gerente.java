package sample08.rh;

import sample08.geometria.AbsFiguraGeometrica;
import sample08.geometria.Quadrado;

public class Gerente extends Funcionario implements IAutenticavel {
    private String login;
    private String senha;
    private double porcentagemParticipacao;

    public Gerente(double salario, double pctParticipacao, String login, String senha) {
        this.salario = salario;
        this.porcentagemParticipacao = pctParticipacao;
        this.login = login;
        this.senha = senha;
    }

    @Override
    public double getBonificacao() {
        Object a = new AbsFiguraGeometrica[10];

        return acrescimoPct(salario, porcentagemParticipacao);

    }

    @Override
    public boolean autentica(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

    private double acrescimoPct(double d, double pct) {
        return d + ((d * pct) / 100);
    }

}
