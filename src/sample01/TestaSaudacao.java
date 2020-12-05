package sample01;

public class TestaSaudacao {

    public static void main(String[] args) {
        Saudacao saudacao = new Saudacao();
        saudacao.texto = "Adeus";
        saudacao.destinatario = "Maria";

        System.out.println(saudacao.obterSaudacao());
    }
}
