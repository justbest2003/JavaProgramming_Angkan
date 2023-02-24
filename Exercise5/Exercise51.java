import java.util.Scanner;

public class Exercise51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number 1 : ");
        int n1 = input.nextInt();
        System.out.print("Enter your number 2 : ");
        int n2 = input.nextInt();
        System.out.print("Enter your number 3 : ");
        int n3 = input.nextInt();
        System.out.print("Enter your number 4 : ");
        int n4 = input.nextInt();
        System.out.print("Enter your number 5 : ");
        int n5 = input.nextInt();
        int max = n1;

        if (max < n2) {
            max = n2;
        }if (max < n3){
            max = n3;
        }if (max < n4){
            max = n4;
        }if (max < n5){
            max = n5;
        }
            System.out.print("The maximum value is : " + max);
        }
    }