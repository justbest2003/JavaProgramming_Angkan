import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {
        String answers = "";
        for (int i = 1; i <= 100; i = i + 1) {
            if (i % 3 == 0) {
                if (answers == "") {
                    answers = answers + i;
                } else {
                    answers = answers + "," + i;
                }
            }
        }
        System.out.println(answers);
    }
}

/*import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your number :");
        int x = scan.nextInt();

        while (x <= 100) {
            if (x % 3 == 0) {
                System.out.println(x);
            }
            x++;
        }
    }
}*/