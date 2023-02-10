import java.util.Scanner;

public class Exercise28 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PriceReduction = 0.05;
        System.out.println("ProductName: ");
        String Product = input.nextLine();
        System.out.println("ProductPrice: ");
        double Price = input.nextDouble();
        System.out.println("Amount: ");
        int Amount = input.nextInt();
        double Total = (Price * Amount);
        double Final = Total - (Total * PriceReduction);
        System.out.println("Total: " + Total + " Final: " + Final);
    }
}