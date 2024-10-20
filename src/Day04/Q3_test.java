package Day04;

import java.util.Random;

public class Q3_test {
    public static void main(String[] args) {
        Random r = new Random();

        while (true) {
            int[] num = new int[3];
            int i;
            int result;
            for (i = 0; i < 3; i++) {
                result = r.nextInt(9) + 1;
                num[i] = result;
            }


            if (num[0] == num[1] || num[0] == num[2] || num[1] == num[2]) {
                for (i = 0; i < 3; i++) {
                    result = r.nextInt(9) + 1;
                    num[i] = result;
                }
            } else {
                System.out.println(num[0] + "," + num[1] + "," + num[2]);
                break;
            }
        }


    }
}
