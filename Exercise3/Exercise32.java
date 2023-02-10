import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter your number: ");
            number = input.nextInt();
        } while (number <= 0);
        System.out.println("Your number is " + number);
    }
}