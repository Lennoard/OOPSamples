package sample02;

public class TesteJogador {
    public static void main(String[] args) {
        Jogador player1 = new Jogador(10, 3, 100);
        Jogador player2 = new Jogador(6, 7, 100);

        player1.atacar(player2);
        player2.atacar(player1);

        System.out.println(player1.pontosAtuais);
        System.out.println(player2.pontosAtuais);
    }
}
