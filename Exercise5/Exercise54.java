import java.util.Scanner;

public class Exercise54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("จำนวนนาทีที่โทรศัพท์ : ");
        float min = input.nextFloat();
        float totalpay; 
        if(min < 3){
            totalpay = min *5;
        }else{
            totalpay = 10 + (min -2) *2;
        }
        System.out.print("ค่าโทรศัพท์คือ : " + totalpay);
    }
}