import java.util.Scanner;

public class Exercise49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number x : ");
        int x = input.nextInt();

        if (x > 0) {
            System.out.println("Positive number");
        } else if (x < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }
    }
}
