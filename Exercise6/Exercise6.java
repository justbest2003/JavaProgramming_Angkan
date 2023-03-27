import java.util.Scanner;

public class Exercise6 {
    // Method
    /**
     * Check number type and print out
     * 
     * @param num
     */
    public void printType1(int num) {
        if (num == 0) {
            System.out.println(num + " is zero");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println(num + " is positive");
        }
    }

    public void printType2(int num) {
        if (num == 0) {
            System.out.println("Zero");
        } else if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public void checkVowel(char c) {
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'
                || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("This character is a vowel");
        } else {
            System.out.println("This character is not a vowel");
        }
    }

    public void checkChar(char c) {
        if (Character.isUpperCase(c)) {
            System.out.println("Uppercase");
        } else if (Character.isLowerCase(c)) {
            System.out.println("Lowercase");
        } else {
            System.out.println("Not a Letter");
        }
    }

    public void isPositive(int num, Scanner input) {
        while (num <= 0) {
            System.out.println("Please, enter a number : ");
            num = input.nextInt();
        }
        System.out.println("Positive number");
    }

    public void isOdd(int num, Scanner input) {
        do {
            System.out.println("Please, enter a number");
            num = input.nextInt();
        } while (num % 2 == 0);
        System.out.println("is Odd");
    }

    public void isDivideBy(int num, Scanner input) {
        System.out.print("Please enter number(N) : ");
        int n = input.nextInt();
        System.out.print("Please enter number(X) : ");
        int x = input.nextInt();
        String sum = "";
        for (int i = 1; i <= n; i++) {
          if (i % x == 0) {
            if (sum == "") {
              sum = sum + i;
            } else {
              sum = sum + "," + i;
            }
          }
        }
        System.out.println(sum);
      }

      public void printStarAdvance(int num, Scanner input) {
        System.out.print("Please enter number : ");
        int n = input.nextInt();
        String star = "*";
        System.out.println(star);
        for (int i = 1; i <= n; i++) {
          for (i = 1; i < n; i++) {
            star += "_";
            System.out.println(star + "*");
          }
        }
      }
    

    // Ex 1 - 2
    // public static void main(String[] args) {
    // Exercise6 ex = new Exercise6();
    // Scanner input = new Scanner(System.in);
    // System.out.println("Please, enter a number: ");
    // int num = input.nextInt();
    // ex.printType1(num);
    // ex.printType2(num);
    // }

    // Ex 3
    // public static void main(String[] args) {
    // Exercise6 ex = new Exercise6();
    // Scanner input = new Scanner(System.in);
    // System.out.println("Please, enter a charactor:");
    // String text = input.next();
    // char c = text.charAt(0);
    // ex.checkVowel(c);
    // }

    // Ex 4
    // public static void main(String[] args) {
    // Exercise6 ex = new Exercise6();
    // Scanner input = new Scanner(System.in);
    // System.out.print("Enter a character : ");
    // char c = input.next().charAt(0);
    // ex.checkChar(c);
    // }

    // Ex 5
    // public static void main(String[] args) {
    // Exercise6 ex = new Exercise6();
    // Scanner input = new Scanner(System.in);
    // System.out.print("Enter a character : ");
    // int num = input.nextInt();
    // ex.isPositive(num, input);
    // }

    
    //Ex 6
    // public static void main(String[] args) {
    //     Exercise6 ex = new Exercise6();
    //     Scanner input = new Scanner(System.in);
    //     ex.isOdd(0, input);
    // }

    //Ex 7
    // public static void main(String[] args) {
    // Exercise6 ex = new Exercise6();
    // Scanner input = new Scanner(System.in);
    // ex.isDivideBy(0, input);
    // }

    //Ex 8
    public static void main(String[] args) {
        Exercise6 ex = new Exercise6();
        Scanner input = new Scanner(System.in);
        ex.printStarAdvance(0, input);
    }
  }
