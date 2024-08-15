import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int count = sc.nextInt();
        int firstnum = 0;
        int secondnum = 1;
        int sum = 0;

        for (int i = 1; i < count; i++)  {
            sum = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = sum;
        }

        System.out.println("Final result is " + sum);
    }

}
