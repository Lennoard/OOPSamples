package sample06;

public class Horista extends Diarista {

    @Override
    public double calcularSalario() {
        return super.calcularSalario() / 24;
    }
}
