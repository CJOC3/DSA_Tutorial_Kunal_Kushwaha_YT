import java.util.Scanner;

public class EvenOrOdd {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to determine whether it is Even or Odd: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Number " + num + " is Even.");
        }
        else {
            System.out.println("Number " + num + " is Odd.");
        }
    }
}
