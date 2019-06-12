import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        int n1 = scanner.nextInt();
        System.out.println("Introduceti al doilea numar: ");
        int n2 = scanner.nextInt();
        System.out.println("Introduceti operatia dorita: ");
        String operation = scanner.next();

        if (operation.equals("+")) {
            System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        } else if (operation.equals("-")) {
            System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
        } else if (operation.equals("*")) {
            System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
        } else if (operation.equals("/")) {
            System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
        } else System.out.println("Bad operation!");

    }


}
