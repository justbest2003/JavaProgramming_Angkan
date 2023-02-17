import java.util.Scanner;

public class Exercise44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your radius : ");
        int r = input.nextInt();
        double area = 0;
        area = r*r*3.14;
        System.out.print("Radius is : " +area);
    }
}