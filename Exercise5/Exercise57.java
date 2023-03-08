import java.util.Scanner;

public class Exercise57 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter time(Hours) : ");
        float time = input.nextFloat();
        System.out.print("Enter overtime(Hours) : ");
        float ot = input.nextFloat();
        System.out.print("Enter rate per hour : ");
        float rate = input.nextFloat();
        double payment = time * rate;
        double otpayment = payment * 1.5;
        double total = payment + otpayment;
        System.out.println("ค่าจ้างปกติ " + payment);
        System.out.println("ค่าจ้างล่วงเวลา " + otpayment);
        System.out.println("รวม = " + total);

    }
}