package sample05;

public class Calculadora {
    private double operando1;
    private double operando2;

    public Calculadora() {

    }

    Calculadora(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public double somar() {
        return operando1 + operando1;
    }

    public double subtrair() {
        return operando1 - operando2;
    }

    public double divisao() {
        return operando1 / operando2;
    }
}
