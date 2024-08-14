import java.util.Scanner;

public class SimpleInterest {
    public static void main (String[] args) {
        System.out.println("Hello, this is a program to compute for the Simple Interest.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the Principal amount: ");
        int principal = sc.nextInt();

        System.out.print("Please enter the rate of interest in percentage: ");
        float rate = (sc.nextFloat()) / 100;

        System.out.print("Please enter how many years to pay: ");
        int year = sc.nextInt();

        float SI = principal * rate * year;

        System.out.println("Final Simple Interest is: " + SI);
    }
}
