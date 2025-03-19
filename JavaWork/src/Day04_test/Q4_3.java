package Day04_test;

import java.util.Random;

class RanNum {
    Random r = new Random();

    RanNum() {
        int[] lotto = new int[6];
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = r.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
    }
}

public class Q4_3 {
    public static void main(String[] args) {
        new RanNum();

    }
}
