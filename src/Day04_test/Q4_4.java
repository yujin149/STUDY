package Day04_test;

import java.util.Random;

class RanNum1 {
    Random r = new Random();
    int[] lotto = new int[6];

    RanNum1() {
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = r.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }
    }

    int[] ranNum() {
        return lotto;
    }
}

class NumSort {
    RanNum1 ran;
    int temp;

    NumSort() {
        ran = new RanNum1();
        int[] lotto = ran.ranNum();

        for (int i = 0; i < lotto.length; i++) {
            for (int j = 0; j < i; j++) {
                if (lotto[i] < lotto[j]) {
                    temp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = temp;
                }
            }
        }

        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
    }
}

public class Q4_4 {
    public static void main(String[] args) {
        new NumSort();

    }
}
