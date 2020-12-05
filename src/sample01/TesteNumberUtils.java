package sample01;

public class TesteNumberUtils {
    public static void main(String[] args) {
        NumberUtils numberUtils = new NumberUtils();
        numberUtils.n = 13;

        System.out.println(numberUtils.isPair());
        System.out.println(numberUtils.isOdd());
        System.out.println(numberUtils.isPrime());
        numberUtils.printCount();
        numberUtils.printReverseCount();
    }
}
