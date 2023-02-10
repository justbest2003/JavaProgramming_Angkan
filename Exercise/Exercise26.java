import java.util.Scanner;

public class Exercise26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("number 1: ");
        float a = input.nextFloat();
        System.out.print("number 2: ");
        float b = input.nextFloat();
        float result = (a - b) * (a + b);
        System.out.println("A =? " + a);
        System.out.println("A =? " + b);
        System.out.println("(" + a + "-" + b + ")(" + a + "+" + b + ") = " + result);
    }
}