import java.util.Scanner;

public class inputData2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("ํEnter your surname: ");
        String surname = input.nextLine();
        System.out.print("Enter your nickname: ");
        String nickname = input.nextLine();
        System.out.print("Enter your studentID: ");
        String studentID = input.nextLine();
        System.out.print("Enter your major: ");
        String major = input.nextLine();
        input.close();
        System.out.print("ํYour Name is " + name);
        System.out.print("Your Surname is " + surname);
        System.out.print("Your Nickname is " + nickname);
        System.out.print("Your StudentID is " + studentID);
        System.out.print("Your Major is " + major);
    }
}