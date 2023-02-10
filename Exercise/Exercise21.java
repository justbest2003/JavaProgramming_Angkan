
/**
*Exercise21
*/
import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("number 1: ");
        int a = input.nextInt();
        System.out.print("number 2: ");
        int b = input.nextInt();
        input.close();
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " x " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
    }
}