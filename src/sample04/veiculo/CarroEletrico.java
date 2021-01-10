package sample04.veiculo;

public class CarroEletrico extends Carro {
    private int autonomiaBateria;

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    @Override
    public String toString() {
        return "CarroEletrico{" +
                "placa='" + placa + '\'' +
                ", ano=" + ano +
                ", modelo='" + modelo + '\'' +
                ", autonomiaBateria=" + autonomiaBateria +
                '}';
    }
}
