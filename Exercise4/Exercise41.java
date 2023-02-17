import java.util.Scanner;

public class Exercise41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number 1 : ");
        float x1 = input.nextFloat();
        System.out.print("Enter your number 2 : ");
        float x2 = input.nextFloat();
        System.out.print("Enter your number 3 : ");
        float x3 = input.nextFloat();
        System.out.print("Enter your number 4 : ");
        float x4 = input.nextFloat();
        System.out.print("Enter your number 5 : ");
        float x5 = input.nextFloat();

        float sum = x1+x2+x3+x4+x5; 
        float average = sum / 5;
        if (average >= 50) {
            System.out.println("Average = " + average);
            System.out.println("Pass ! ");
        } else {
            System.out.println("Average = " + average);
            System.out.println("Fail !");
        }
    }
}

