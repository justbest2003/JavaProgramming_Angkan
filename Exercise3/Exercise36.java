public class Exercise36 {
    public static void main(String[] args) {
        double sum = 1.0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum * (double) i;
            }
        }
        System.out.println(sum);
    }
}