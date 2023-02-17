import java.util.Scanner;

public class Exercise45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your width : ");
        int w = input.nextInt();
        System.out.print("Enter your length : ");
        int l = input.nextInt();
        int area = 0;
        area = w * l;
        System.out.print("Area is : " +area);
    }
}