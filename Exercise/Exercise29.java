import java.util.Scanner;

public class Exercise29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("THB: ");
        double thb = input.nextDouble();
        double rate = 35.50;
        double usd = thb / rate;
        System.out.printf("USD %.2f ", usd);
    }
}