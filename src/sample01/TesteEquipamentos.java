package sample01;

public class TesteEquipamentos {

    public static void main(String[] args) {
       Equipamento lampada = new Equipamento();
       Equipamento televisao = new Equipamento();

       lampada.liga();
       televisao.desliga();

       lampada.inverte();
       televisao.inverte();

       if (lampada.estaLigado()) {
           System.out.println("Lâmpada está ligada");
       } else {
           System.out.println("Lâmpada está desligada");
       }

        if (televisao.estaLigado()) {
            System.out.println("TV está ligada");
        } else {
            System.out.println("TV está desligada");
        }
    }
}
