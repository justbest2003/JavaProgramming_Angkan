import java.util.Scanner;

public class Exercise59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ระบุชื่อ : ");
        String name = input.next();
        int birth;
        int years;
        do {
            System.out.print("ระบุปีเกิด(พ.ศ.) : ");
            birth = input.nextInt();
            if (birth >= 2566) {
                System.out.println("ท่านระบุข้อมูลผิด");
            }
        } while (birth >= 2566);
        years = 2566 - birth;
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("ชื่อ " + name);
        System.out.println("ปีเกิด " + birth);
        System.out.println("อายุ " + years);
    }
}
