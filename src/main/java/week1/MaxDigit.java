import java.util.Scanner;

public class MaxDigit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int digit, max = 0; // da nume sugestive variabilelor
        while (n > 0) {
            digit = n % 10;
            if (max < digit)
                max = digit;
            n /= 10;
        }
        System.out.println(max);
    }

}
