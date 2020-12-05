package sample01;

public class TestaDecimalNumber {

    public static void main(String[] args) {
        DecimalNumber number = new DecimalNumber();
        number.n = 420.69;

        System.out.println(number.getIntegers());
        System.out.println(number.getDecimals());
    }
}
