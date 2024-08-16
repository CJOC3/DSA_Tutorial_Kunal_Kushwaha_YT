import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("This program assumes that the numbers entered are of equal size.");
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.print("Enter another number: ");
        int y = sc.nextInt();

        int high_num, low_num = 0;

        if (x < y) {
            low_num = x;
            high_num = y;
        }
        else {
            low_num = y;
            high_num = x;
        }

        String sLow_num = Integer.toString(low_num);
        String sHigh_num = Integer.toString(high_num);
        int numOfDigits = sLow_num.length();

        int hold;
        int sum = 0;

        while (low_num <= high_num) {
            for (int i = 0; i < numOfDigits; i++) {
                    //System.out.println(sLow_num);
                    sLow_num = Integer.toString(low_num);
                   // System.out.println(sLow_num);
                    hold = Integer.parseInt(String.valueOf(sLow_num.charAt(i)));
                    //System.out.println("Value of hold is: " + hold);
                    sum += (int) Math.pow(hold, numOfDigits);
                    //System.out.print("Value of sum is: ");
                   //System.out.println(sum);
                }
               if (sum == low_num) {
                   System.out.println(sum + " is an Armstrong Number.");
               }
               sum = 0;
               low_num++;
        }
    }
}
