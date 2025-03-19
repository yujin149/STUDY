package Day03;

import java.util.Random;

public class Q4_test {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int alp = r.nextInt(26) + 'A';

            System.out.print((char) alp);
        }
    }
}
