import java.util.Arrays;
import java.util.List;

public class Name2 {
    public static void main(String[] args) {

        int n = 12;
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {

            for (int i = 2; i < 10; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
        }
        if (isPrime) {
            System.out.println(n);
        } else {
            System.out.println(n);
        }
    }
}
