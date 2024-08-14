import java.util.Scanner;

public class CalculateAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the next number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the chosen operator (+-*/): ");
        String operator = sc.next();

        int res = switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> 0;
        };

        System.out.println("Final result is " + res);

    }
}
