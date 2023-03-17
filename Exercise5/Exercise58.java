public class Exercise58 {
    public static void main(String[] args) {
        String ans = "";
        for (int i = 100; i < 1000; i++) {
            if ((i % 5 == 0 || i % 11 == 0) && i % 55 != 0) {
                if (ans == "") {
                    ans = ans + i;
                } else {
                    ans = ans + "," + i;
                }

            }
        }
        System.out.println("จำนวนเต็มบวก 3 หลัก ที่หารด้วย 5 หรือ 11 ลงตัวแต่หาร 55 ไม่ลงตัวได้แก่");
        System.out.println(ans);
    }
}
