import java.util.Scanner;



public class RupeesToUSD {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        float conversion_rate = 0.01191f;

        System.out.print("Please enter amount in rupees: ");
        float rupees = sc.nextFloat();
        float usd = rupees * conversion_rate;

        System.out.println(rupees + " rupees is equivalent to " + usd + " USD.");

    }
}
