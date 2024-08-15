import java.util.Scanner;

public class PrintLargest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = 0;

        System.out.print("Please enter a number: ");
        int num1 = sc.nextInt();

        System.out.print("Please enter another number: ");
        int num2 = sc.nextInt();

        largest = Math.max(num1, num2);
        System.out.println("The largest number between the two is " + largest);


    }

}
