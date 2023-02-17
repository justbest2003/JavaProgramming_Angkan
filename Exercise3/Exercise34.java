import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int x = input.nextInt();
        System.out.print("Enter 2nd number : ");
        int y = input.nextInt();
        System.out.print("Enter 3rd number : ");
        int z = input.nextInt();
        
        if (x > y) {
            if (x > z) {
                System.out.println("Maximum number is " + x);
            } else {
                System.out.println("Maximum number is " + z);
            }
        } else {
            if (y > z) {
                System.out.println("Maximum number is " + y);
            } else {
                System.out.println("Maximum number is " + z);
            }
        }
    }
}