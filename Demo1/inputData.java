import java.util.Scanner;

import java.util.Scanner;

public class inputData {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Your name: ");
    String name = input.nextLine();
    System.out.print("ํYour age: ");
    int age = input.nextInt();
    input.close();
    System.out.println("ํYour name is "+ name);
    System.out.println("You are "+age+" year-old");
  }  
}
