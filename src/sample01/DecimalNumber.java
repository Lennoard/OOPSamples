package sample01;

public class DecimalNumber {
    double n;

    double getDecimals() {
        return n - getIntegers();
    }

    int getIntegers() {
        return (int) n;
    }
}
