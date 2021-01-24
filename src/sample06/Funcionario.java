package sample06;

public class Funcionario extends Pessoa {
    private int matricula;
    private double salario;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    protected double getSalario() {
        return salario;
    }

    public double getSalarioPrimeiraParcela() {
        return (getSalario() * 60) / 100;
    }

    public double getSalarioSegundaParcela() {
        return (getSalario() * 40) / 100;
    }

    public void setSalario(double salario) {
        if (salario < 0) return;

        this.salario = salario;
    }
}
