import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = 0;
        int n = sc.nextInt();
        for (int i = n - 1; i > 2; i--) {
            if (isPrime(i))
                System.out.println(i + " ");
        }
    }

    private static boolean isPrime(int i) {
        int j;
        for (j = 2; j < i / 2; j++) {
            if (i % j == 0)
                return false;
        }
        return true;
    }
}
