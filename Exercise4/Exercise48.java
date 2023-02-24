public class Exercise48 {
    public static void main(String[] args) {

        int n = 1;
        int sum = 0;

        while (n <= 10) {
            sum = sum + n;
            n = n + 1;
        }

        System.out.println("ผลบวกของเลขตั้งแต่ 1 ถึง 10 เท่ากับ " + sum);
    }
}