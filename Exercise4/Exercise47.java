import java.util.Scanner;

public class Exercise47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number a : ");
        int a = input.nextInt();
        System.out.print("Enter your number b : ");
        int b = input.nextInt();
        if(a>b){
            System.out.println("จำนวนที่ a มากกว่า");
        }else if (a<b){
            System.out.println("จำนวนที่ b มากกว่า");
        }else{
            System.out.println("จำนวน a = จำนวน b");
        }
            }
        }
    
