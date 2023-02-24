import java.util.Scanner;

public class Exercise53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("กรุณากรอกค่ารัศมีของทรงกระบอก: ");
        double r = input.nextDouble();
        System.out.print("กรุณากรอกค่าความสูงของทรงกระบอก: ");
        double h = input.nextDouble();
        double sum = 3.14*r*r*h;

        System.out.print("ปริมาตรทรงกระบอกที่คำนวณได้คือ : " + sum);
    }
}
