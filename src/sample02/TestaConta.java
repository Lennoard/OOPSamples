package sample02;

public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta("01", 1000);
        Conta c2 = new Conta("02", 0);

        c1.sacar(900);
        c1.depositar(200);

        c1.sacar(50);
        c2.depositar(600);

        if (c1.transferir(c2, 580)) {
            System.out.println("Transferência efetuada para a conta " + c2);
        } else {
            System.out.println("Falha ao transferir para a conta " + c2);
        }
    }
}
