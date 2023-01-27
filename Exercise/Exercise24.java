import java.util.Scanner;

public class Exercise24{
    public static void main(String[] args) {
        int a,b,temp;
        a = 16;
        b = 25;
        System.out.println("Before swapping: a = "+a+", b = "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = "+a+", b = "+b);
    }
}