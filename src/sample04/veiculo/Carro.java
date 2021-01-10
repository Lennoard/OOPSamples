package sample04.veiculo;

public class Carro extends AbsVeiculo {
    String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", ano=" + ano +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
