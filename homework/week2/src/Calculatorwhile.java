
import java.util.Scanner;

public class Calculatorwhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Introduceti primul numar: ");
            int n1 = scanner.nextInt();
            System.out.println("Introduceti al doilea numar: ");
            int n2 = scanner.nextInt();
            System.out.println("Introduceti operatia dorita: ");
            String operation = scanner.next();
        while(operation!="stop") {
            switch (operation) {
                case "+":
                    System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                    break;
                case "-":
                    System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                    break;
                case "*":
                    System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                    break;
                case "/":
                    System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                    break;
                case "stop":
                    System.out.println("Stop calculator");
                    break;
                default:
                    System.out.println("Bad operation!");
            }
            System.out.println("Introduceti primul numar: ");
            int n1 = scanner.nextInt();
            System.out.println("Introduceti al doilea numar: ");
            int n2 = scanner.nextInt();
            System.out.println("Introduceti operatia dorita: ");
            String operation = scanner.nextLine();
        }

        }


    }

