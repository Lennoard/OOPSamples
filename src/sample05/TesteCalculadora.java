package sample05;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora c = new Calculadora(5.8, 5.0);
        System.out.println(c.somar());
        System.out.println(c.subtrair());
        // c.operando1 = 2; // operando1 tem acesso privado

    }
}
