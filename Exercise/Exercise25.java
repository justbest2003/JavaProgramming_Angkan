import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your weight (kg):");
        double weigth = input.nextDouble();
        System.out.print("Input your height (cm):");
        double height = input.nextDouble();
        double h = (height / 100);
        double bmi = weigth / (h * h);
        System.out.print("your bmi is : " + bmi);

        String status = " ";
        if (bmi >= 30)
            status = "Very Fat";
        else if (bmi >= 25)
            status = "Fat";
        else if (bmi >= 23)
            status = "Overweight";
        else if (bmi >= 18)
            status = "Normal";
        else
            status = "Too Skinny";
        System.out.println("You are : " + status);
    }
}