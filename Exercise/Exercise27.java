import java.util.Scanner;

public class Exercise27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double vat = 0.07;
        System.out.println("ProductName: ");
        String Product = input.nextLine();
        System.out.println("Price: ");
        Double Price = input.nextDouble();
        Double sum = (Price * vat);
        Double all = (Price + sum);
        System.out.println(
                "ProductName: " + Product + " " + "Price: " + Price + " " + "vat: " + sum + " " + "final: " + all);
    }
}