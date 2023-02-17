import java.util.Scanner;

public class Exercise43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = input.nextInt();
        System.out.print("Enter your Price : ");
        float x = input.nextFloat();
        float result = 0;
        result = n * x;
        System.out.print("Product Price : " +result);
    }
}