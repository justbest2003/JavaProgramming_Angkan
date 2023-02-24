import java.util.Scanner;

public class Exercise52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n1 = input.nextInt();
        for (int i = 1; i <= 100; i++) {
            if (i % n1 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}