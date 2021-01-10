package sample04.veiculo;

public class TestaVeiculo {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setAno(1964);
        carro.setModelo("Impala");
        carro.setPlaca("LVL-9654");
        System.out.println(carro);

        CarroEletrico carroEletrico = new CarroEletrico();
        carroEletrico.setAno(2018);
        carroEletrico.setModelo("i3");
        carroEletrico.setPlaca("NBE-3694");
        carroEletrico.setAutonomiaBateria(6000);
        System.out.println(carroEletrico);
    }
}
