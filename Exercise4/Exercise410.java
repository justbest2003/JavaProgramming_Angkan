import java.util.Scanner;

public class Exercise410 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number midterm : ");
        int a = input.nextInt();
        System.out.print("Enter your number finalterm : ");
        int b = input.nextInt();
        int sum = a + b;

        if (sum >=80) {
            System.out.println("ได้เกรด A");
        } else if (sum >= 75) {
            System.out.println("ได้เกรด B+");
        } else if (sum >= 70){
            System.out.println("ได้เกรด B");
        }else if (sum >= 65){
            System.out.println("ได้เกรด C+");
        }else if (sum >= 60){
            System.out.println("ได้เกรด C");
        }else if (sum >= 55){
            System.out.println("ได้เกรด D+");
        }else if (sum >= 50){
            System.out.println("ได้เกรด D");
        }else{
            System.out.println("ได้เกรด E");
        }
    }
}