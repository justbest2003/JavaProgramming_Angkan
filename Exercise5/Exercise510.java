import java.util.Scanner;

public class Exercise510 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ระบุความกว้างสี่เหลี่ยมรูปแรก : ");
        float box1width = input.nextFloat();
        System.out.print("ระบุความยาวสี่เหลี่ยมรูปแรก : ");
        float box1length = input.nextFloat();
        System.out.print("ระบุความกว้างสี่เหลี่ยมรูปสอง : ");
        float box2width = input.nextFloat();
        System.out.print("ระบุความยาวสี่เหลี่ยมรูปสอง : ");
        float box2length = input.nextFloat();
        double box1 = box1length * box1width;
        double box2 = box2length * box2width;
        if (box1 == box2) {
            System.out.println("พื้นที่สี่เหลี่ยมทั้งสองรูปเท่ากัน");
        } else if (box1 > box2) {
            System.out.println("พื้นที่สี่เหลี่ยมรูปแรกมากกว่ารูปสอง");
        } else {
            System.out.println("พื้นที่สี่เหลี่ยมรูปสองมากกว่ารูปแรก");
        }
        System.out.println("พื้นที่สี่เหลี่ยมรูปแรก = " + box1);
        System.out.println("พื้นที่สี่เหลี่ยมรูปสอง = " + box2);
    }
}
