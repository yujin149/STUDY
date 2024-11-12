package Day04_test;

import java.util.Random;

public class Q4_2 {
    static void ranNum(Random r, int[] lotto) {
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

    static void print(int[] lotto) {
        Random r = new Random();
        ranNum(r, lotto);
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] lotto = new int[6];

        print(lotto);
    }
}
