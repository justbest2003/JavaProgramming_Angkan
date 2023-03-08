import java.util.Scanner;

public class Exercise56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of water(Liter) : ");
        float Liter = input.nextFloat();
        System.out.print("Enter customer type (Domestic,Commercial) : ");
        String types = input.next();
        double total;
        if (types.equals("Domestic")) {
            total = Liter * 0.5;
            System.out.println("Price of water is " + total + "฿");
        } else if (types.equals("Commercial")) {
            total = Liter * 0.9;
            System.out.println("Price of water is " + total + "฿");
        } else {
            System.out.println("Customer type not match");
        }
    }
}
