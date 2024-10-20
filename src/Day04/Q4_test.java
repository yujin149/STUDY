package Day04;

import java.util.Random;

public class Q4_test {
    public static void main(String[] args) {
        Random r = new Random();
        int[] lotto = new int[6];

        for (int i = 0; i < 6; i++) {
            lotto[i] = r.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println("로또 번호 추첨 : " + lotto[0] + "," + lotto[1] + "," + lotto[2] + "," + lotto[3] + "," + lotto[4] + "," + lotto[5]);


    }
}
