import java.util.Scanner;

public class Exercise23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("number 1:");
        int n1 = input.nextInt();
        System.out.print("number 2:");
        int n2 = input.nextInt();
        System.out.print("number 3:");
        int n3 = input.nextInt();
        System.out.print("number 4:");
        int n4 = input.nextInt();
        System.out.print("number 5:");
        int n5 = input.nextInt();
        input.close();
        System.out.println("Average of "+ n1+","+n2+","+n3+","+n4+","+n5 + " "+"is"+" "+((+n1+n2+n3+n4+n5)/5));

    }
}