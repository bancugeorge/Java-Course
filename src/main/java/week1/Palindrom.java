import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int temp, digit, reverse = 0; // da nume sugestive variabilelor
        int n = sc.nextInt();
        temp = n;
        while (n > 0) {
            digit = n % 10;
            reverse = (reverse * 10) + digit;
            n /= 10;
        }
        if (temp == reverse) {
            System.out.println("Numarul este palindrom");
        } else {
            System.out.println("Numarul nu este palindrom");
        }

    }
}
