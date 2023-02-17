import java.util.Scanner;

public class Exercise42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = input.nextInt();
        float sum = 0;
        do {
            System.out.print("Enter your Price : ");
            float x = input.nextFloat(); 
            sum = sum + x;
            n = (n-1);  
            }
        while (n > 0);
        System.out.println("sum = " +sum);
    }
}