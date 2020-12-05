package sample01;

public class NumberUtils {
    int n;

    boolean isPair() {
        return n % 2 == 0;
    }

    boolean isOdd() {
        return !isPair();
    }

    boolean isPrime() {
       if (n < 0) return false;

       for (int i = 2; i < n; i++) {
           if (n % i == 0) return false;
       }
       return true;
    }

    void printCount() {
        if (n <= 0) throw new IllegalArgumentException("O número não pode ser menor que zero");

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }

    void printReverseCount() {
        if (n <= 0) throw new IllegalArgumentException("O número não pode ser menor que zero");

        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
