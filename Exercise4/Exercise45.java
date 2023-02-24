import java.util.Scanner;

public class Exercise45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your width : ");
        float w = input.nextFloat();
        System.out.print("Enter your length : ");
        float l = input.nextFloat();
        float area = 0;
        area = w * l;
        System.out.print("Area is : " +area);
    }
}